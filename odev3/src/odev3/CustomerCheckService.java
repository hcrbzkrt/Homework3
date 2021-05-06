package odev3;

public interface CustomerCheckService {

	public default boolean checkIfRealPerson(Customer customer) {
		return false;
		
	}
}
