package violation;

import helper.Store;
import helper.User;

/**
 * Here there are multiple reasons to change the class
 * e.g. if our user validation logic changes or the way
 * the user is created is changed or if SRViolation class 
 * needs to be changed. 
 * 
 * Hence Single Responsibility principle is violated
 */
public class SRViolation {
	
	private Store store = new Store(); 
	
	public String createUser(String userJson) {
		User user = new User(userJson); 
		
		if (!isValidUser(user)) {
			return "Error";
		}
		
		store.save(user);
		
		return "Success";
	}
	
	
	public boolean isValidUser(User user) {
		// return if the user is valid
		return true;
	}
}
