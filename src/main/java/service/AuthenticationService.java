package service;

public class AuthenticationService {

	public static boolean isValidUser(String username, String password) {
		if ("samita".equals(username) && "pass".equals(password)) {
			return true;
		}
		return false;
	}
}
