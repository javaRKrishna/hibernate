//LoadObjectTest1.java
package com.kk.test;

import java.util.Arrays;

import org.hibernate.Session;

import com.kk.entity.IActor;
import com.kk.utility.HibernateUtil;

public class LoadObjectTest2 {

	public static void main(String[] args) {
		//Get HB Session obj
		Session ses=HibernateUtil.getSession();
		try {
			IActor actor=ses.load(IActor.class,1);
			System.out.println(actor.getClass()+"     "+actor.getClass().getSuperclass()+"  "+Arrays.toString(actor.getClass().getInterfaces()));
		      System.out.println(actor);
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
