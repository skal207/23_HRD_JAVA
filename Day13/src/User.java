
public class User {
	
	private String userid;
	private String username;
	private String userpassward;
	private int userage;
	private String useremail;
	
	public User(String userid, String username, String userpassward, int userage, String useremail) {
		super();
		this.userid = userid;
		this.username = username;
		this.userpassward = userpassward;
		this.userage = userage;
		this.useremail = useremail;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserpassward() {
		return userpassward;
	}

	public void setUserpassward(String userpassward) {
		this.userpassward = userpassward;
	}

	public int getUserage() {
		return userage;
	}

	public void setUserage(int userage) {
		this.userage = userage;
	}

	public String getUseremail() {
		return useremail;
	}

	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}

}
