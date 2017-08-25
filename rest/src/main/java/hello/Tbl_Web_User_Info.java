package hello;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Tbl_Web_User_Info {
	
	
	//@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	private Integer seqno;
	private String userid;
	private String certuserid;
	private String regtime;
	private String updatetime;
	private String mainaccessip;
	private String remoteaccessip;
	private String lastmainaccesstime;
	private String lastremoteaccesstime;
	private Integer deleted;
	public Integer getSeqno() {
		return seqno;
	}
	public void setSeqno(Integer seqno) {
		this.seqno = seqno;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getCertuserid() {
		return certuserid;
	}
	public void setCertuserid(String certuserid) {
		this.certuserid = certuserid;
	}
	public String getRegtime() {
		return regtime;
	}
	public void setRegtime(String regtime) {
		this.regtime = regtime;
	}
	public String getUpdatetime() {
		return updatetime;
	}
	public void setUpdatetime(String updatetime) {
		this.updatetime = updatetime;
	}
	public String getMainaccessip() {
		return mainaccessip;
	}
	public void setMainaccessip(String mainaccessip) {
		this.mainaccessip = mainaccessip;
	}
	public String getRemoteaccessip() {
		return remoteaccessip;
	}
	public void setRemoteaccessip(String remoteaccessip) {
		this.remoteaccessip = remoteaccessip;
	}
	public String getLastmainaccesstime() {
		return lastmainaccesstime;
	}
	public void setLastmainaccesstime(String lastmainaccesstime) {
		this.lastmainaccesstime = lastmainaccesstime;
	}
	public String getLastremoteaccesstime() {
		return lastremoteaccesstime;
	}
	public void setLastremoteaccesstime(String lastremoteaccesstime) {
		this.lastremoteaccesstime = lastremoteaccesstime;
	}
	public Integer getDeleted() {
		return deleted;
	}
	public void setDeleted(Integer deleted) {
		this.deleted = deleted;
	}
	
	
}
