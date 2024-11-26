import java.util.Date;

public class Pet
{
  private String name;
  private int age;
  private  char gender;
  private String comment;
  private Date birthDate;
  private String color;
  private int price;


  public Pet(String name, int age, char gender, String comment, Date birthDate, String color, int price){
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.comment = comment;
    this.birthDate = birthDate;
    this.color = color;
    this.price = price;

  }

  public Pet(String name, int age, char gender, String comment, Date birthDate, String color, int price, Customer customer){
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.comment = comment;
    this.birthDate = birthDate;
    this.color = color;
    this.price = price;
    // customer part

  }

  public String getName()
  {
    return name;
  }
  public void setName(String name)
  {
    this.name = name;
  }
  public int getAge()
  {
    return age;
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

  public Date getBirthDate()
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

  @Override public String toString()
  {
    return "Name: " + name + " Age :" + age + " Gender : " + " Date of birth : " + birthDate + "Color : " + color + " Price : " + price + "Comment : " + comment;
  }
}
