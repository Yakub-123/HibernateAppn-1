package com.excler;
import org.hibernate.*;
import org.hibernate.cfg.*;
public class ProductCreateInsert {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("com/excler/hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Product p1=new Product(104,"iphone",9000.99);
		Transaction ts=session.beginTransaction();
		session.save(p1); //create the table and insert one record
		ts.commit();
		System.out.println("new Table is created and record also inserted");
		session.close();
	factory.close();
	
	}

}
