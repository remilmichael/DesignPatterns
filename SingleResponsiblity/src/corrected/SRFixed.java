package corrected;

import helper.User;

public class SRFixed {
	
	public String createUser(String userJson) {
		User user = new User(userJson); 
		
		// Validation logic is now in a different class
		UserValidator userValidator = new UserValidator();
		
		// Storing user is now delegated to a different class
		UserPersistenceService userPersistenceService = 
				new UserPersistenceService();
		
		
		boolean valid = userValidator.validateUser(user);
		
		if (!valid) {
			return "Error";
		}
		
		// persistence is now managed by a different class now
		userPersistenceService.saveUser(user);
		
		return "Success";
	}
}
