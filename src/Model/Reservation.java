package Model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Reservation
{
  private MyDate startDate;
  private MyDate endDate;
  private Pet pet;
  private Customer customer;
  private  int pricePerDay = 20;

  public Reservation(Customer customer, Pet pet, MyDate startDate, MyDate endDate)
  {
    this.startDate = startDate;
    this.endDate = endDate;
    this.pet = pet;
    this.customer = customer;
  }

  public MyDate getEndDate()
  {
    return endDate;
  }

  public MyDate getStartDate()
  {
    return startDate;
  }

  public int getPrice()
  {
    return pricePerDay*numberOfDays();
  }

  public int numberOfDays()
  {
    return startDate.until(endDate);
  }
  public Pet getPet()
  {
    return pet;
  }

  public Customer getCustomer()
  {
    return customer;
  }
  public void setStartDate(MyDate startDate)
  {
    this.startDate = startDate;
  }
  public void setEndDate(MyDate endDate)
  {
    this.endDate = endDate;
  }

  public void setPrice(int price)
  {
    this.pricePerDay = price;
  }

  public void setPet(Pet pet)
  {
    this.pet = pet;
  }

  public String toString()
  {
    return "Start Model.Date : " + startDate + " End Model.Date : " + endDate + "Model.Pet : " + pet + " Model.Customer : " + customer + "Price : " + getPrice();
  }

  public boolean equals(Object obj)
  {
    if(obj == null || this.getClass() != obj.getClass()){
      return false;
    }
      Reservation other = (Reservation) obj;
      return other.startDate.equals(startDate) && other.endDate.equals(endDate) && other.pet.equals(pet) && other.customer.equals(customer) && other.getPrice() == getPrice();
    }
  }


