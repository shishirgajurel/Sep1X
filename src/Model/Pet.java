package Model;

public class Pet
{
  private String name;
  private char gender;
  private String comment;
  private MyDate birthDate;
  private String color;
  private int price;
  private Customer customer;


  public Pet(String name, char gender, String comment, MyDate birthDate, String color, int price)
  {
    this.name = name;
    this.gender = gender;
    this.comment = comment;
    this.birthDate = birthDate;
    this.color = color;
    this.price = price;
  }

  public Pet(String name, char gender, String comment, MyDate birthDate, String color, Customer customer){
    this.name = name;
    this.gender = gender;
    this.comment = comment;
    this.birthDate = birthDate;
    this.color = color;
    this.price = -1;
    this.customer = customer;
  }

  public String getName()
  {
    return name;
  }
  public void setName(String name)
  {
    this.name = name;
  }

  public char getGender()
  {
    return gender;
  }

  public String getComment()
  {
    return comment;
  }

  public void setComment(String comment)
  {
    this.comment = comment;
  }

  public MyDate getBirthDate()
  {
    return birthDate;
  }

  public String getColor()
  {
    return color;
  }

  public int getPrice()
  {
    return price;
  }

  public void setPrice(int price)
  {
    this.price = price;
  }

  public void setCustomer(Customer customer)
  {
    this.customer = customer;
  }
  public Customer getCustomer()
  {
    return customer;
  }

  public String toString()
  {
    return "Name: " + name  + " Gender : " + " Model.Date of birth : " + birthDate + "Color : " + color + " Price : " + price + "Comment : " + comment;
  }
}
