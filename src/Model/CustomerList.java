package Model;

import java.util.ArrayList;

public class CustomerList
{
  private ArrayList<Customer> customers;
  public CustomerList()
  {
    customers = new ArrayList<Customer>();
  }
  public int getNumberOfCustomers()
  {
    return customers.size();
  }
  public void addCustomer(Customer customer)
  {
    customers.add(customer);
  }
  public Customer getCustomer(Customer customer)
  {
    for (int i = 0; i < customers.size(); i++)
    {
      if (customers.get(i).equals(customer))
      {
        return customers.get(i);
      }
    }
    return null;
  }
  public Customer removeCustomer(Customer customer)
  {
    for (int i = 0; i < customers.size(); i++)
    {
      if (customers.get(i).equals(customer))
      {
        return customers.remove(i);
      }
    }
    return null;
  }

}
