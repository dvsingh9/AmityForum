package persistence.dao;

import java.io.Serializable;

public interface GenericDAO<T ,ID extends Serializable> {

	T load(ID id);
	
	T get(ID id);
	
	void delete(T entiry);
	
	Serializable save(T entiry);
	
	void saveOrUpdate(T entiry);

	
}
