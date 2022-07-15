package sns.entity;

public class UserBean {

//	public String email;
//	protected String email;
//	String email;

	private String email;
	private String name;
	private String password;

	//アクセサメソッド（setter/getter）
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	
}
