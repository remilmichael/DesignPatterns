package alternative;

import java.util.List;

import entities.Entity;
import entities.User;

public interface UserPersistenceInterface<T extends Entity> extends PersistenceService<User>{
	public List<User> findByName(String name);
}
