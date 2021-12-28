package ibmtal.com.facebook.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="sharinglikes")
public class SharingLikes {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private int id;
    
    @ManyToOne
    @JoinColumn(name="userid")
    private User user;
    @Column(name="sharingid")
    private int sharingid;
    @Column(name="liketime")
    private String liketime;
	public SharingLikes() {
		super();
    }
	public SharingLikes(int id, User user, int userid, int sharingid, String liketime) {
		super();
		this.id = id;
		this.user = user;
		this.sharingid = sharingid;
		this.liketime = liketime;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
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
	