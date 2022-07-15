package sns.entity;

public class App {

	public static void main(String[] args) {

		UserBean user = new UserBean();
//		user.email = "test@example.com";

		//setterを利用
		user.setEmail("test@example.com");
		user.setName("横浜　太郎");
		user.setPassword("pass1234");

		//getterを利用
		String email = user.getEmail();
		System.out.println(email);

		String name = user.getName();
		System.out.println(name);

		String password = user.getPassword();
		System.out.println(password);
	}
}
