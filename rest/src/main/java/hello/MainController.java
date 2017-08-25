package hello;

import java.text.SimpleDateFormat;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    
    @Autowired
    private UserRepository userRepository;
    
    //When connected, return message
    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }
    
    @RequestMapping("/user/add")
    public @ResponseBody String addNewUser(@RequestParam String userid){
    	Tbl_Web_User_Info n = new Tbl_Web_User_Info();
    	n.setUserid(userid);
    	
    	SimpleDateFormat dayTime = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		long regTime = System.currentTimeMillis();
    	n.setRegtime(dayTime.format(regTime));
    	n.setDeleted(0);
    	userRepository.save(n);
    	
    	return "Saved";
    }
    //user list from Tbl_User_Info(table)
    @RequestMapping("/user/all")
    public @ResponseBody Iterable<Tbl_Web_User_Info> getAllUsers(){
    	return userRepository.findAll();
    }
    
}
