//SaveOrUpdateTest
package com.kk.test;


import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.kk.entity.Actor;
import com.kk.utility.HibernateUtil;

public class SaveOrUpdateTest {

	public static void main(String[] args) {
		//get SEssion object
		Session ses=HibernateUtil.getSession();
		Transaction tx=null;
		boolean flag=false;
		try {
			//begin Tx
			tx=ses.beginTransaction();
			  //Save or update object
			Actor actor=new Actor();
			actor.setId(16);
			 actor.setActorName("rajesh");
			actor.setAddrs("hyd"); actor.setPhone(900998L);
			actor.setRemuneration(8900666.0f);
			ses.saveOrUpdate(actor);
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
				System.out.println("Object is saved or updated");
			}
			else {
				tx.rollback();
				System.out.println("Object is not saved or  updated");
			}
			//close Session,SessionFactory object
			HibernateUtil.closeSession(ses);
			HibernateUtil.closeSessionFactory();
		}//finally

	}//main
}//class
