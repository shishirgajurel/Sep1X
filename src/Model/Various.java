package Model;

public class Various extends Pet
{
  private String species;

  public Various(String name, char gender, String comment, MyDate birthDate, String color, int price, String species)
  {
    super(name, gender ,comment, birthDate, color, price);
    this.species = species;
  }

  public String getSpecies()
  {
    return species;
  }
}
