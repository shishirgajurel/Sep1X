package Model;
import java.util.Date;

public class Bird extends Pet
{
  private String preferredFood;
  private String species;

  public Bird(String name, char gender , String comment, MyDate birthDate, String color, int price, String species )
  {
    super(name, gender, comment, birthDate, color, price);
    this.species = species;
  }
  public Bird(String name, char gender , String comment, MyDate birthDate, String color,Customer customer ,String species )
  {
    super(name, gender, comment, birthDate, color, customer);
    this.species = species;
  }

  public String getPreferredFood()
  {
    return preferredFood;
  }

  public void setPreferredFood(String preferredFood)
  {
    this.preferredFood = preferredFood;
  }

  public String getSpecies()
  {
    return species;
  }

}
