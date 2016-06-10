package servlet;

import javax.jdo.annotations.*;
import java.util.Date;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Kutikomi {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Long id; // id
	@Persistent
	private String userName; // ユーザー名
	@Persistent
	private String review; // 口コミ内容
	 //@Persistent
	    //private Date datetime;//口コミの日付

	public Kutikomi(String userName, String review){//,Date datetime) {
		super();
		this.userName = userName;
		this.review = review;
		//this.datetime = datetime;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserName() {
		return userName;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public String getReview() {
		return review;
	}
	/*
	public Date getDatetime() {
        return datetime;
    }
 
    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }*/
}
