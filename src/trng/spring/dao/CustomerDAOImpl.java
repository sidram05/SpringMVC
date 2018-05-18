package trng.spring.dao;

import java.util.ArrayList;
import java.util.HashSet;
import trng.spring.model.Customer;

public class CustomerDAOImpl<T extends Customer> implements CustomerDao<T>{
	
	ArrayList<T> customerList = new ArrayList<>();
	HashSet<Integer> set = new HashSet<Integer>();
	
	@Override
	public boolean addCustomer(T obj) {
		if (!set.contains(obj.getId())) {
			customerList.add(obj);
			set.add(obj.getId());
			return true;
		} else {
			return false;
		}
	}

	@Override
	public T getCustomer(int custId) {
		for (T cust : customerList) {
			if (cust != null && cust.getId() == custId) {
				return cust;
			}
		}
		return null;
	}

	@Override
	public boolean updateCustomer(T obj) {
		for (Customer c : customerList) {
			if (c != null && c.getId() == obj.getId()) {
				c.setFirstName(obj.getFirstName());
				c.setLastName(obj.getLastName());
				c.setEmail(obj.getEmail());;
			}
		}
		return true;
	}

	@Override
	public boolean deleteCustomer(int custId) {
		for (int i = 0; i < customerList.size(); i++) {
			if (customerList.get(i) != null && customerList.get(i).getId() == custId) {
				customerList.set(i, null);
				System.out.println(custId + " Customer is deleted");
				break;
			}
		}
		return true;
	}

	@Override
	public void displayAllInfo() {
		for (T e : customerList) {
			if (e != null) {
				System.out.println("Customer Num = " + e.getId() + "," + "Customer Fname = " + e.getFirstName() + ","
						+ "Customer Lname = " + e.getLastName() + ","+ "Customer Email = " + e.getEmail() + "," + "Customer PostalCode = " + e.getPostalCode() 
						+  "," + " Customer State = " + e.getState()+ "," +  "Customer Country = " + e.getCountry());
			}
		}
	}

}
