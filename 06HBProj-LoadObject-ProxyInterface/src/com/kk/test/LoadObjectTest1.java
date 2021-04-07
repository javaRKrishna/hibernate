//LoadObjectTest1.java
package com.kk.test;

import java.util.Arrays;

import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.kk.entity.Actor;
import com.kk.utility.HibernateUtil;

public class LoadObjectTest1 {

	public static void main(String[] args) {
		//Get HB Session obj
		Session ses=HibernateUtil.getSession();
		try {
			Actor actor=ses.get(Actor.class,1);
			if(actor==null)
				System.out.println("Actor not found");
			else
				System.out.println(actor);
		}
		catch(HibernateException he) {
			he.printStackTrace();
		}
		catch(Exception e) {
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
