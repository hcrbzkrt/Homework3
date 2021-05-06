package odev3;


public class Main {

	private static final Customer customer = null;

	public static void main(String[] args) {

	    StarbucksCustomerManager customerManager=new StarbucksCustomerManager(new MernisServiceAdapter());

		customerManager.save(new Customer(1, "Engin", "Demiroð", 1985, "28861499108"));
        
		customerManager.save(customer);
	}

}
