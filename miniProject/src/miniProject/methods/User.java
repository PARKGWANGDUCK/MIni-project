package miniProject.methods;

public class User {
	
	// 인스턴스
	private String user_id;
	private String user_password;
	private int user_num;
	
	// 생성자
	public User() {
		
	}
	
	public User(String user_id, String user_password) {
		super();
		this.user_id = user_id;
		this.user_password = user_password;
	}

	public User(int user_num, String user_id, String user_password) {
		super();
		this.user_id = user_id;
		this.user_password = user_password;
		this.user_num = user_num;
	}
	
	// get, set 메서드
	public String getUser_id() {
		return user_id;
	}


	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUser_password() {
		return user_password;
	}

	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}

	public int getUser_num() {
		return user_num;
	}

	public void setUser_num(int user_num) {
		this.user_num = user_num;
	}
	
	
}
