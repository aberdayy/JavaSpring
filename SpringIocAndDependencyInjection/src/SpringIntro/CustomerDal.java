package SpringIntro;

public class CustomerDal implements ICustomerDal{
		String connectionString;

	public void add() {
		System.out.println("Connection String : " +this.connectionString);
		System.out.println("Oracle veritabanina Eklendi");
		
	}
	public String getConnectionString() {
		return connectionString;
	}
	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}
}
