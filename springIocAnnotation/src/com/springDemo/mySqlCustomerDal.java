package com.springDemo;


public class mySqlCustomerDal implements ICustomerDal{
	
	String connectionString;
	
	public String getConnectionString() {
		return connectionString;
	}
	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}
	
	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("Connection String : " +this.connectionString);

		System.out.println("MySQL veritabanina Eklendi");
	}
	
}
