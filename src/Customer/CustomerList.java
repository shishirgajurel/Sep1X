package Customer;

public class CustomerList
{

  private<Customer> customers;

    // Constructor
    public CustomerList()
    {
        customers = new<Customer>();
    }
// get number of customers
    public int getNumberOfCustomers()
    {
        return customers.size();
    }

    //get all customers
    public<Customer> getCustomers()
    {
        return customers;
    }

    // add customer
    public void addCustomer(Customer customer)
    {
        customers.add(customer);
    }
    // get customer from customer list
    public Customer getCustomer(Customer customer)
    {
        return customers.get(customers.indexOf(customer));
    }
    // remove customer
    public void removeCustomer(Customer customer)
    {
        customers.remove(customer);
    }
   
    // toString
    public String toString()
    {
        return "CustomerList{" +
                "customers=" + customers +
                '}';
    }
    // equals
    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null || getClass() != obj.getClass())
        {
            return false;
        }
        CustomerList that = (CustomerList) obj;
        return customers.equals(that.customers);
    }




    


}
