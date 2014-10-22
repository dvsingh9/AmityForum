package persistence.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import persistence.HibernateUtil;


public class GenericHibernateDAO<T, ID extends Serializable> implements GenericDAO<T, ID> {

	private Class<T> type; 
	
	public Class<T> getType() {
		return type;
	}
	
	
    private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	protected SessionFactory getSessionFactory() {
        if (sessionFactory == null){
            throw new IllegalStateException("SessionFactory has not been set on DAO before usage");
        }
        return sessionFactory;
    }

	Session session = getSessionFactory().openSession();
	
	@SuppressWarnings("unchecked")
	public GenericHibernateDAO() {  
		this.type = (Class<T>) ((ParameterizedType) getClass()  
                .getGenericSuperclass()).getActualTypeArguments()[0];  
	}
	
	public void delete(T entiry) {
		session.delete(entiry);
	}
	 
	public Serializable save(T entity) throws Exception {
		Transaction tx = null;
		Serializable id= null;
		try {
			tx = session.beginTransaction();
			id = session.save(entity);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			throw e;
		}finally{
			session.close();
		}
		return  id;
	}

	public void saveOrUpdate(T entity) throws Exception {
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.saveOrUpdate(entity);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			throw e;
		}finally{
			session.close();
		}
	}

	public  T load(ID id) throws Exception {
		Transaction tx =  null;
		Object object = null;
		try {
			tx = session.beginTransaction();
			object = (T) session.load(type, id);
			tx.commit();
		} catch (Exception e) {
			throw e;
			
		}finally{
			session.close();
		}
		return   (T) object;
	}

	public  T get(ID id) throws Exception{
		Transaction tx =  null;
		Object object = null;
		try {
			tx = session.beginTransaction();
			object = type.cast(session.get(type, id));
			tx.commit();
		} catch (Exception e) {
			throw e;
			
		}finally{
			session.close();
		}
		return  (T) object;
	}
	public List<T> getAll() {
		Transaction tx = null;
		List<T> list = new  ArrayList<T>();
		try {
			tx = session.beginTransaction();
			Criteria crit = session.createCriteria(getType());
			list = crit.list();
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
		}finally{
			session.close();
		}
		return list;
	}

	

}
