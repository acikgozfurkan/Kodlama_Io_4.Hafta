package Abstract;

import Entities.Customer;

public class BaseCustomerManager implements CustomerService {

	@Override
	public void Save(Customer customer) {
		System.out.println(" veri taban�na kaydedildi : " + customer.getFirstName());
		
	}

}
