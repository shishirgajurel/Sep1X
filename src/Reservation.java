public class Reservation
{
  private Date startDate;
  private Date endDate;
  private Pet pet;
  private Customer customer;
  private int price;

  public Reservation(Customer customer, Pet pet, Date startDate, Date endDate, int price){
    this.startDate = startDate;
    this.endDate = endDate;
    this.pet = pet;
    this.customer = customer;
    this.price = price;
  }

  public Date getEndDate()
  {
    return endDate;
  }

  public Date getStartDate()
  {
    return startDate;
  }

  public int getPrice()
  {
    return price;
  }

  public Pet getPet()
  {
    return pet;
  }

  public Customer getCustomer()
  {
    return customer;
  }
  public void setStartDate(Date startDate)
  {
    this.startDate = startDate;
  }
  public void setEndDate(Date endDate)
  {
    this.endDate = endDate;
  }

  public void setPrice(int price)
  {
    this.price = price;
  }

  public void setPet(Pet pet)
  {
    this.pet = pet;
  }

  @Override public String toString()
  {
    return "Start Date : " + startDate + " End Date : " + endDate + "Pet : " + pet + " Customer : " + customer + "Price : " + price;
  }

  @Override public boolean equals(Object obj)
  {
    if(obj == null && this.getClass() != obj){
      return false;
    }
    else {
      Reservation other = (Reservation) obj;
      return other.equals(startDate) && other.equals(endDate) && other.equals(pet) && other.equals(customer) && other.price == price;
    }
  }
}
