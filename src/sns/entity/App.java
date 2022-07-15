package sns.entity;

public class App {

	public static void main(String[] args) {

		UserBean user = new UserBean();
//		user.email = "test@example.com";

		//setterを利用
		user.setEmail("test@example.com");

		//getterを利用
		String email = user.getEmail();
		System.out.println(email);
	}
}
