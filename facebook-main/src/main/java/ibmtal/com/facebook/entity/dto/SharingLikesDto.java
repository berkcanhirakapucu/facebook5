package ibmtal.com.facebook.entity.dto;

public class SharingLikesDto {
    private int userid;
    private int sharingid;
    private String liketime;
	public SharingLikesDto() {
		super();
		
	}
	public SharingLikesDto(int userid, int sharingid, String liketime) {
		super();
		this.userid = userid;
		this.sharingid = sharingid;
		this.liketime = liketime;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public int getSharingid() {
		return sharingid;
	}
	public void setSharingid(int sharingid) {
		this.sharingid = sharingid;
	}
	public String getLiketime() {
		return liketime;
	}
	public void setLiketime(String liketime) {
		this.liketime = liketime;
	}	
}
