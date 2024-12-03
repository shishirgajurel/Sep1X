package Model;
import java.util.Date;
public class Fish extends Pet
{
  private boolean isSaltyWater;
  private boolean isPredator;

  public Fish(String name, char gender, String comment, MyDate birthDate, String color, int price, boolean isSaltyWater, boolean isPredator)
  {
    super(name, gender, comment, birthDate, color, price);
    this.isSaltyWater = isSaltyWater;
    this.isPredator = isPredator;
  }
  public Fish(String name, char gender, String comment, MyDate birthDate, String color,Customer customer, boolean isSaltyWater, boolean isPredator)
  {
    super(name, gender, comment, birthDate, color, customer);
    this.isSaltyWater = isSaltyWater;
    this.isPredator = isPredator;
  }

  public boolean isSaltyWater()
  {
    return isSaltyWater;
  }

  public boolean isPredator()
  {
    return isPredator;
  }
}
