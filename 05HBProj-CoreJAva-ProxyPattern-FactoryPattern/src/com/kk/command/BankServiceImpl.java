package com.kk.command;

public class BankServiceImpl implements IBankService {

	@Override
	public String withdraw(long acno, double amount) {
		return amount+" amount is withdrawn from  account"+acno;
	}

}
