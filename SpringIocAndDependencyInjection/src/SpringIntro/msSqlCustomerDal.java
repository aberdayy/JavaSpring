package SpringIntro;

public class msSqlCustomerDal implements ICustomerDal{
	String connectionString;
	public String getConnectionString() {
		return connectionString;
	}
	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}
	@Override
	public void add() {
		System.out.println("Connection String : " +this.connectionString);
		System.out.println("MsSQL veritabania gecildi");
		
	}

}
