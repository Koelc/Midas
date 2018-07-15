package com.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import com.models.*;


@Configuration
@ComponentScan("com")
@EnableTransactionManagement
public class hibernateConfig 
{
	@Autowired
	@Bean(name="datasource")
	public DataSource getH2Data()
	{
		System.out.println("hibernate bean initiated");
		DriverManagerDataSource dsource= new DriverManagerDataSource();
		dsource.setDriverClassName("org.h2.Driver");
		dsource.setUrl("jdbc:h2:tcp://localhost/~/MT");
		dsource.setUsername("sa");
		dsource.setPassword("");
		System.out.println("H2 Connected");
		return dsource;
	}

	private Properties gethiberProp()
	{
		Properties p = new Properties();
		p.put("hibernate.dialect","org.hibernate.dialect.H2Dialect");
		p.put("hibernate.hbm2ddl.auto", "update");
		p.put("hibernate.show_sql", "true");
		
		System.out.println("Data table created in H2");
		return p;
		
	}
	
	@SuppressWarnings("deprecation")
	@Autowired
	@Bean(name="sessionFactory")
	public SessionFactory getSessionFac(DataSource datasource)
	{	LocalSessionFactoryBuilder sb= new LocalSessionFactoryBuilder(datasource);
	  sb.addProperties(gethiberProp());
	  sb.addAnnotatedClass(User.class);
	  sb.addAnnotatedClass(RegionCode.class);
	  sb.addAnnotatedClass(Course.class);
	  sb.addAnnotatedClass(BatchLaunchFitness.class);
	 
	  return sb.buildSessionFactory();
	 	
	}

	
	@Autowired
	@Bean(name="transactionManager")
	public HibernateTransactionManager gettrans(SessionFactory sf)
	{
		HibernateTransactionManager tm = new HibernateTransactionManager(sf);
		return tm;
	}
	
	
	
}








