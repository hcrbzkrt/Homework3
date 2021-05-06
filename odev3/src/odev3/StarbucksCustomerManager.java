package odev3;


public class StarbucksCustomerManager {

	CustomerCheckService customerCheckService;

	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}

	public void save(Customer customer)  {
		if(customerCheckService.checkIfRealPerson(customer)) {
			this.save(customer);
			System.out.println("bilgiler gecerli.");
		}else {		
			System.out.println("bilgiler gecersiz");

		}
	}
}
