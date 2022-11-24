package Hibernatefirst.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cglib.proxy.Factory;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;


public class HiberApplication {
	//private static SessionFactory;
	public static void main(String[] args) {
		//Step1
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		configuration.addAnnotatedClass(Employee.class);
		//step 2
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		//step3
		Session session = sessionFactory.openSession();
		//step 4
		List l1 = session.createQuery("from Employee ey").list();
		Iterator it = l1.iterator();
		while(it.hasNext()){
			Object o = (Object) it.next();
			Employee em = (Employee) o;
			System.out.println("ID Name: "+ em.getName());
			System.out.println("ID  Salary:" +em.getSalary());
		}

//		session.beginTransaction();
//		Employee e = new Employee();
//		e.setEmp_id(456);
//		e.setName("Zaheer");
//		e.setLocation("Bangalore");
//		e.setSalary(20000d);
//		session.save(e);
//		session.getTransaction().commit();
		session.close();
		}

}
