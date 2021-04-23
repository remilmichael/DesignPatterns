package alternative;
//import java.util.List;

import entities.Entity;

public interface PersistenceService<T extends Entity> {

	public void save(T entity);
	
	public void delete(T entity);
	
	public T findById(Long id);
	
//	public List<T> findByName(String name);
}
