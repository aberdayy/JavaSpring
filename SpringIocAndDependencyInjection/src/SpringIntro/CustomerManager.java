package SpringIntro;

public class CustomerManager implements ICustomerService{
	//Dependency Injection
	private ICustomerDal customerDal;
	
	
	
	//Constructor Injection
	//public CustomerManager(ICustomerDal customerDal) {
	//	this.customerDal = customerDal;
	//	}

	//setter injection
	public void setCustomerDal(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}


	public void add() {
		//Is kurallari (Musteri eklenmis mi sartlar saglaniyor mu vs.)
		customerDal.add();
	}
}
