package Model;

import java.util.ArrayList;
/*
* Class
 */
public class SalesLog
{
  private ArrayList<Sale> sales; //i used ArrayList for saving sales log as sÂ´list
  public SalesLog()
  {
    sales= new ArrayList<Sale>();
  }
  public void addSale(Sale sale) // to be added in the diagram
  {
    sales.add(sale);
  }
  public SalesLog getSalesByCustomer(Customer customer)
  {
    SalesLog temp = new SalesLog();// make a temp list to store the result
    for (int i = 0; i < sales.size(); i++)// makes a loop for searching the SalesLogList
    {
      if (sales.get(i).getCustomer().equals(customer))// check if the customer matches the customer i have in parameter.
      {
        temp.addSale(sales.get(i));// temperary store the sales with customer of that parameter and then add it to temp list
      }
    }
    return temp;// return the results
  }
}