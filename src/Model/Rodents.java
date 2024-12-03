package Model;

import java.util.Date;

/**
 * The `Rodents` class represents rodents as a type of pet. It extends the `Pet` class,
 * inheriting common pet properties and behaviors, while introducing additional attributes
 * specific to rodents, such as bite behavior and species information.
 */
public class Rodents extends Pet {

  // Attributes
  private boolean biteBehaviour; // Indicates if the rodent has a tendency to bite
  private String species;        // The species of the rodent (e.g., hamster, guinea pig)

  /**
   * Constructor for creating a Rodents object when it is being sold (not yet owned by a customer).
   *
   * @param name         The name of the rodent.
   * @param gender       The gender of the rodent ('M' or 'F').
   * @param comment      Additional comments or notes about the rodent.
   * @param birthDate    The birth date of the rodent.
   * @param color        The color of the rodent.
   * @param price        The price of the rodent.
   * @param species      The species of the rodent.
   */
  public Rodents(String name, char gender, String comment, MyDate birthDate, String color, int price, String species) {
    super(name, gender, comment, birthDate, color, price); // Calls the constructor of the parent class (Pet)
    this.species = species;
  }

  /**
   * Checks if the rodent has biting behavior.
   *
   * @return A boolean value: `true` if the rodent is prone to biting, `false` otherwise.
   */
  public boolean isBiteBehaviour() {
    return biteBehaviour;
  }

  /**
   * Sets the biting behavior of the rodent.
   *
   * @param biteBehaviour A boolean value indicating if the rodent bites (`true` if it bites, `false` otherwise).
   */
  public void setBiteBehaviour(boolean biteBehaviour) {
    this.biteBehaviour = biteBehaviour;
  }

  /**
   * Gets the species of the rodent.
   *
   * @return A string representing the species of the rodent.
   */
  public String getSpecies() {
    return species;
  }
}
