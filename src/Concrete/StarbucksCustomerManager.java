package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{
	
	private CustomerCheckService CustomerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.CustomerCheckService = customerCheckService;
	}

	@Override
	public void Save(Customer customer) {
		if (CustomerCheckService.checkIfRealPerson(customer)) {
			super.Save(customer);
		} else {
			System.out.println("Not a valid person");
		}

	}
	
	

}