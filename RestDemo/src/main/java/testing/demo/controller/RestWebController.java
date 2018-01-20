package testing.demo.controller;

import java.util.ArrayList;
import java.util.List;


import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
 
import testing.demo.model.Customer;
 
@RestController
public class RestWebController {
	
	List<Customer> cust = new ArrayList<Customer>();
	
	private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
	
	
	/*@RequestMapping(value = "/getallcustomer", method = RequestMethod.GET)
	public List<Customer> getResource(){
			return cust;
	}*/
	
	@RequestMapping(value="/postcustomer", method=RequestMethod.POST)
	public String postCustomer(@RequestBody Customer customer){
		cust.add(customer);
		
		return "Sucessful!";
	}
	
	@RequestMapping("/getallcustomer")
	public List<Customer> customer(@RequestParam(value="firstName") String firstName, @RequestParam(value="lastName") String lastName) {
		
		//cust.add(new Customer(firstName, lastName));
		return cust;
	}
}
