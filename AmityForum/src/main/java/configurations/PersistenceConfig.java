package configurations;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.tomcat.dbcp.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@PropertySource({ "classpath:hibernate.properties" })
@ComponentScan(basePackages = {"persistence"})
public class PersistenceConfig {
	
	 	@Autowired
	    private Environment environment;
	 
	 	@Bean
	    public DataSource dataSource()
	    {
	        BasicDataSource dataSource = new BasicDataSource();
	        dataSource.setDriverClassName(environment.getProperty("jdbc.driverClassName"));
	        dataSource.setUrl(environment.getProperty("jdbc.url"));
	        dataSource.setUsername(environment.getProperty("jdbc.user"));
	        dataSource.setPassword(environment.getProperty("jdbc.pass"));
	        return dataSource;
	    }
	 	
	 	@Bean
	    public LocalSessionFactoryBean sessionFactory()
	    {
	        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
	        sessionFactory.setDataSource(dataSource());
	        sessionFactory.setPackagesToScan(new String[] { "persistence" });
	        sessionFactory.setHibernateProperties(hibernateProperties());
	        return sessionFactory;
	    }
	    
	 	
	 	@Bean
	    public HibernateTransactionManager transactionManager()
	    {
	        HibernateTransactionManager txManager = new HibernateTransactionManager();
	        txManager.setSessionFactory(sessionFactory().getObject());
	        return txManager;
	    }
	 	
	 	 @Bean
	     public PersistenceExceptionTranslationPostProcessor exceptionTranslation()
	     {
	         return new PersistenceExceptionTranslationPostProcessor();
	     }
	 	
	 	Properties hibernateProperties() {
	        return new Properties() {
	            /**
				 * 
				 */
				private static final long serialVersionUID = -3822800910021370786L;

				{
	                //setProperty("hibernate.hbm2ddl.auto", env.getProperty("hibernate.hbm2ddl.auto"));
	                setProperty("hibernate.dialect", environment.getProperty("hibernate.dialect"));
	                setProperty("hibernate.globally_quoted_identifiers", "true");
	            }
	        };
	 	}    

}
