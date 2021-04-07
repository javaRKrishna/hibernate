//LoadObjectTest1.java
package com.kk.test;

import org.hibernate.Session;

import com.kk.entity.Actor;
import com.kk.utility.HibernateUtil;

public class LoadObjectTest2 {

	public static void main(String[] args) {
		//Get HB Session obj
		Session ses=HibernateUtil.getSession();
		try {
			Actor actor=ses.load(Actor.class,1);
		      // System.out.println(actor);
				}
		catch(Exception e) {
			System.out.println("Object not found");
			e.printStackTrace();
		}
		finally {
			//close Session obj (connection closing)
			HibernateUtil.closeSession(ses);
			//close SessionFactory object
			HibernateUtil.closeSessionFactory();
		}//finally   
	
		
		
	}//main
}//class
