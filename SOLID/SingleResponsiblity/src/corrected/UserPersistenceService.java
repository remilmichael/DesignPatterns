package corrected;

import helper.Store;
import helper.User;

public class UserPersistenceService {
	private Store store = new Store();
	
	public void saveUser(User user) {
		store.save(user);
	}
}
