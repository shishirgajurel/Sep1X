package Model;
public class Cat extends Pet

{
  private String breed;
  private String breeder;

  public Cat(String name, char gender, String comment, MyDate birthDate, String color, int price, String breed, String breeder)
  {
    super(name, gender, comment, birthDate, color, price);
    this.breed = breed;
    this.breeder = breeder;
  }

  public Cat(String name, char gender, String comment, MyDate birthDate, String color, Customer customer, String breed, String breeder)
  {
    super(name, gender, comment, birthDate, color, customer);
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
