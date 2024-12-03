package Model;

import java.util.Date;

/**
 * The `Bird` class represents a bird as a type of pet. It extends the `Pet` class,
 * inheriting common pet properties and behaviors, while introducing additional
 * attributes specific to birds, such as species and preferred food.
 */
public class Bird extends Pet {

  // Attributes
  private String preferredFood; // The preferred type of food for the bird
  private String species;       // The species of the bird

  /**
   * Constructor for creating a Bird object when it is being sold (not yet owned by a customer).
   *
   * @param name        The name of the bird.
   * @param gender      The gender of the bird ('M' or 'F').
   * @param comment     Additional comments about the bird.
   * @param birthDate   The birth date of the bird.
   * @param color       The color of the bird.
   * @param price       The price of the bird.
   * @param species     The species of the bird.
   */
  public Bird(String name, char gender, String comment, MyDate birthDate, String color, int price, String species) {
    super(name, gender, comment, birthDate, color, price); // Calls the constructor of the parent class (Pet)
    this.species = species;
  }

  /**
   * Constructor for creating a Bird object that is already owned by a customer.
   *
   * @param name        The name of the bird.
   * @param gender      The gender of the bird ('M' or 'F').
   * @param comment     Additional comments about the bird.
   * @param birthDate   The birth date of the bird.
   * @param color       The color of the bird.
   * @param customer    The customer who owns the bird.
   * @param species     The species of the bird.
   */
  public Bird(String name, char gender, String comment, MyDate birthDate, String color, Customer customer, String species) {
    super(name, gender, comment, birthDate, color, customer); // Calls the constructor of the parent class (Pet)
    this.species = species;
  }

  /**
   * Gets the preferred food for the bird.
   *
   * @return A string representing the preferred food of the bird.
   */
  public String getPreferredFood() {
    return preferredFood;
  }

  /**
   * Sets the preferred food for the bird.
   *
   * @param preferredFood A string representing the new preferred food for the bird.
   */
  public void setPreferredFood(String preferredFood) {
    this.preferredFood = preferredFood;
  }

  /**
   * Gets the species of the bird.
   *
   * @return A string representing the species of the bird.
   */
  public String getSpecies() {
    return species;
  }
}
