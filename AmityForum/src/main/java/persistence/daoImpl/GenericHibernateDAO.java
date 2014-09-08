package persistence.daoImpl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import persistence.dao.GenericDAO;

public class GenericHibernateDAO<T, ID extends Serializable> implements GenericDAO<T, ID> {

	private Class<T> persistentClass; 
	
	public Class<T> getPersistentClass() {
		return persistentClass;
	}
	
	
	@Autowired
    private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	protected SessionFactory getSessionFactory() {
        if (sessionFactory == null)
            throw new IllegalStateException("SessionFactory has not been set on DAO before usage");
        return sessionFactory;
    }

	@SuppressWarnings("unchecked")
	public GenericHibernateDAO() {  
		this.persistentClass = (Class<T>) ((ParameterizedType) getClass()  
                .getGenericSuperclass()).getActualTypeArguments()[0];  
	}
	
	@Transactional
	public void delete(T entiry) {
		getSessionFactory().getCurrentSession().delete(entiry);
	}
	
	@Transactional
	public Serializable save(T entiry) {
		//System.out.println(getSessionFactory());
		return  getSessionFactory().getCurrentSession().save(entiry);
	}

	@Transactional
	public void saveOrUpdate(T entiry) {
		getSessionFactory().getCurrentSession().saveOrUpdate(entiry);
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public T load(ID id) {
		return (T) getSessionFactory().getCurrentSession().load(getPersistentClass(), id);
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public T get(ID id) {
		return (T) getSessionFactory().getCurrentSession().get(getPersistentClass(), id);
	}

	
}
