package com.kk.test;

import com.kk.command.IBankService;
import com.kk.factory.BankServiceFactory;
import com.kk.proxy.BankServiceProxy;

public class BankCustomer1 {

	public static void main(String[] args) {
		IBankService  service=BankServiceFactory.getInstance(true);
		  System.out.println(service.withdraw(1001, 20000));
		  System.out.println("...................................");
			IBankService  service1=BankServiceFactory.getInstance(false);
			  System.out.println(service1.withdraw(1001, 20000));

	}

}
