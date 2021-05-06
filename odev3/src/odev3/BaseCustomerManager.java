package odev3;

import java.util.Date;

public class BaseCustomerManager implements CustomerCheckService{

	public void save(Customer customer) {
		System.out.println("saved to do : " + customer.getFirstName());
	}
	
	public void save(int i, String string, String string2, Date date, String string3) {
		
	}
}
