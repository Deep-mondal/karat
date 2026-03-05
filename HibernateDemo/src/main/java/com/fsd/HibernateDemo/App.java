package com.fsd.HibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.fsd.beans.Employee;

public class App {
	public static void main(String[] args) {
		Configuration conf = new Configuration();
		conf.configure("/com/fsd/config/hibernate.cnf.xml");
		SessionFactory sf = conf.buildSessionFactory();
		Session ssn = sf.openSession();
		Transaction tn = ssn.beginTransaction();

		// --------Create Operation-----
		try {
			Employee emp1 = new Employee();
			emp1.setName("Rakesh");
			emp1.setSalary(20000);

			ssn.persist(emp1);
			tn.commit();

		} catch (Exception e) {
			tn.rollback();
			e.printStackTrace();

		}

		// -------Read Operation-----
		try {
			Employee emp1 = new Employee();

			ssn.get(Employee.class,1);
			

		} catch (Exception e) {
			
			e.printStackTrace();

		}
		//--------Update Operation------
		try {
			Employee emp2=ssn.get(Employee.class,1);
			emp2.setName("Parimal");
			ssn.persist(emp2);
			tn.commit();

		} catch (Exception e) {
			tn.rollback();
			e.printStackTrace();

		}
		//---------Delete Operation---------
		try {
			Employee emp2=ssn.get(Employee.class,1);
			ssn.remove(emp2);
			tn.commit();

		} catch (Exception e) {
			tn.rollback();
			e.printStackTrace();

		}
	}
}
