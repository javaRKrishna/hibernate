//DeleteObjectTest
package com.kk.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.kk.entity.Actor;
import com.kk.utility.HibernateUtil;

public class DeleteObjectTest {

	public static void main(String[] args) {
		//get SEssion object
		Session ses=HibernateUtil.getSession();
		Transaction tx=null;
		boolean flag=false;
		try {
			//begin Tx
			tx=ses.beginTransaction();
			  //full object modification
			  Actor actor=new Actor();
			  actor.setId(5); // must be existing id
			  ses.delete(actor);
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
				System.out.println("Object is deleted");
			}
			else {
				tx.rollback();
				System.out.println("Object is not deleted");
			}
			//close Session,SessionFactory object
			HibernateUtil.closeSession(ses);
			HibernateUtil.closeSessionFactory();
		}//finally

	}//main
}//class
