package Model;

public class Sale
{
  private Pet pet;
  private double discount;
  private MyDate saleDate;

  public Sale (MyDate saleDate, Pet pet, Customer customer)
  {
    if (pet.getPrice() != -1 && customer != null)
    {
      this.saleDate = saleDate;
      this.pet = pet;
      this.discount = 1.0;
      this.pet.setCustomer(customer);
      this.pet.setPrice(-1);
    }
    else
    {
      throw new RuntimeException("pet cannot be sold");
    }
  }

  public MyDate getSaleDate()
  {
    return saleDate;
  }

  public Pet getPet()
  {
    return pet;
  }

  public Customer getCustomer()
  {
    return pet.getCustomer();
  }
  public double getDiscount()
  {
    return discount;
  }

  public void setDiscount(double discount)
  {
    this.discount = discount;
  }

  public double getFinalPrice()
  {
    return pet.getPrice()*discount;
  }

  public String toString()
  {
    return "Pet: "+pet + "\nCustomer: "+pet.getCustomer()+"\nPrice: "+getFinalPrice()+"\nDate: "+saleDate;
  }

}
