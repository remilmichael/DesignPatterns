package corrected;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import entities.User;

public class UserPersistenceService implements PersistenceService<User>{

	private final Map<Long, User> USERS = new HashMap<>();
	
	@Override
	public void save(User entity) {
		USERS.put(entity.getId(), entity);	
	}

	@Override
	public void delete(User entity) {
		USERS.remove(entity.getId());
	}

	@Override
	public User findById(Long id) {
		return USERS.remove(id);
	}

	// UserPersistenceService can implement its own findByName() method
	public List<User> findByName(String name) {
		return USERS
				.values()
				.stream()
				.filter(e -> e.getName().equalsIgnoreCase(name))
				.collect(Collectors.toList());
	}

	
}
