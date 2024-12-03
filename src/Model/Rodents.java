package Model;
import java.util.Date;

public class Rodents extends Pet
{
  private boolean biteBehaviour;
  private String species;

  public Rodents(String name, char gender, String comment, MyDate birthDate, String color, int price, String species)
  {
    super(name, gender, comment, birthDate, color, price);
    this.species = species;
  }

  public boolean isBiteBehaviour()
  {
    return biteBehaviour;
  }

  public void setBiteBehaviour(boolean biteBehaviour)
  {
    this.biteBehaviour = biteBehaviour;
  }

  public String getSpecies()
  {
    return species;
  }
}
