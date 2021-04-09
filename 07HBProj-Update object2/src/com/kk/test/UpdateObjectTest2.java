//UpdateObjectTest2.java
package com.kk.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.kk.entity.Actor;
import com.kk.utility.HibernateUtil;

public class UpdateObjectTest2 {

	public static void main(String[] args) {
		//get SEssion object
		Session ses=HibernateUtil.getSession();
		//Load object 
		Actor actor=ses.get(Actor.class,1);
		if(actor!=null) {
			System.out.println(actor);
		 Transaction tx=null;
		  boolean flag=false;
		try {
			//begin Tx
			tx=ses.beginTransaction();
			  //partial object modification
			actor.setAddrs("vizag");
			actor.setRemuneration(98617212.0f);
			flag=true;
		}//try
		catch(HibernateException he) {
			flag=false;
			he.printStackTrace();
		}
		catch(Exception e) {
			flag=false;
			e.printStackTrace();
		}
		finally {
			//perfrom  Tx mgmt
			if(flag) {
				tx.commit();
				System.out.println("Object is updated");
			}
			else {
				tx.rollback();
				System.out.println("Object is not updated");
			}
			//close Session,SessionFactory object
			HibernateUtil.closeSession(ses);
			HibernateUtil.closeSessionFactory();
		}//finally
		}//if
		else {
			System.out.println("Record /obect not found to  update");
			//close Session,SessionFactory object
			HibernateUtil.closeSession(ses);
			HibernateUtil.closeSessionFactory();
		}
	}//main
}//class
