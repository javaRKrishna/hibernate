package com.kk.factory;

import com.kk.command.BankServiceImpl;
import com.kk.command.IBankService;
import com.kk.proxy.BankServiceProxy;

public class BankServiceFactory {
    public static  IBankService  getInstance(boolean demonitiazation) {
    	IBankService  service=null;
    	        if(demonitiazation)
    	        	  service=new BankServiceProxy(); //proxy obj
    	        else
    	        	service=new BankServiceImpl(); //reaal obj
    	        return service;
    }
}
