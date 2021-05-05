package Main;

import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;


public class Main {

	public static void main(String[] args) {
		
		
		Customer customer1= new Customer(1, "Ahmet", "Baþak", LocalDate.of(1997, 9, 10),"12345678901"); //tc yazman lazým.
		
		Customer customer2=new Customer(2,"Furkan","Açýkgöz",LocalDate.of(2000, 10, 23),"10047011846");
		
	
		BaseCustomerManager customerManager1 = new NeroCustomerManager();
		
		BaseCustomerManager CustomerManager2 = new StarbucksCustomerManager(new MernisServiceAdapter());
		
		customerManager1.Save(customer1);
		CustomerManager2.Save(customer2);
		
		
	}

}
