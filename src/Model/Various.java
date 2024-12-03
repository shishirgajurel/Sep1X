package Model;

/**
 * The `Various` class represents a generic category of pets that do not fit into
 * specific types such as dogs, cats, or rodents. It extends the `Pet` class,
 * inheriting common pet properties and behaviors, while introducing a species
 * attribute for classification.
 */
public class Various extends Pet {

  // Attributes
  private String species; // The species of the pet (e.g., turtle, iguana, parrot)

  /**
   * Constructor for creating a Various object.
   *
   * @param name       The name of the pet.
   * @param gender     The gender of the pet ('M' or 'F').
   * @param comment    Additional comments or notes about the pet.
   * @param birthDate  The birth date of the pet.
   * @param color      The color of the pet.
   * @param price      The price of the pet.
   * @param species    The species of the pet.
   */
  public Various(String name, char gender, String comment, MyDate birthDate, String color, int price, String species) {
    super(name, gender, comment, birthDate, color, price); // Calls the constructor of the parent class (Pet)
    this.species = species;
  }

  /**
   * Gets the species of the pet.
   *
   * @return A string representing the species of the pet.
   */
  public String getSpecies() {
    return species;
  }
}
