package Model;

import java.util.Date;

public class Dog extends Pet
{
  private String breed;
  private String breeder;

  public Dog(String name, int age, char gender, String comment, MyDate birthDate, String color, int price, String breed, String breeder)
  {
    super(name, gender, comment, birthDate, color, price);
    this.breed = breed;
    this.breeder = breeder;
  }

  public String getBreed()
  {
    return breed;
  }

  public String getBreeder()
  {
    return breeder;
  }
}
