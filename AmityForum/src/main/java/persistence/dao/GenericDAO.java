package persistence.dao;

import java.io.Serializable;
import java.util.List;


public interface GenericDAO<T ,ID extends Serializable> {

	 T load(ID id) throws Exception;
	
	 T get( ID id) throws Exception;
	
	void delete(T entiry);
	
	Serializable save(T entiry) throws Exception;
	
	void saveOrUpdate(T entiry) throws Exception;
	
	List<T> getAll();

	
}
