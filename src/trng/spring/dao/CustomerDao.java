package trng.spring.dao;

public interface CustomerDao<T> {
	public boolean addCustomer(T obj);

	public T getCustomer(int empId);

	public boolean updateCustomer(T obj);

	public boolean deleteCustomer(int empId);

	public void displayAllInfo();
}
