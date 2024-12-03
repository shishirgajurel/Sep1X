package Model;

import java.util.Date;

/**
 * The `Fish` class represents a fish as a type of pet. It extends the `Pet` class,
 * inheriting common pet properties and behaviors, while introducing additional
 * attributes specific to fish, such as whether it is a saltwater fish or a predator.
 */
public class Fish extends Pet {

  // Attributes
  private boolean isSaltyWater; // Indicates if the fish lives in saltwater
  private boolean isPredator;   // Indicates if the fish is a predator

  /**
   * Constructor for creating a Fish object when it is being sold (not yet owned by a customer).
   *
   * @param name          The name of the fish.
   * @param gender        The gender of the fish ('M' or 'F').
   * @param comment       Additional comments about the fish.
   * @param birthDate     The birth date of the fish.
   * @param color         The color of the fish.
   * @param price         The price of the fish.
   * @param isSaltyWater  Indicates if the fish is a saltwater fish.
   * @param isPredator    Indicates if the fish is a predator.
   */
  public Fish(String name, char gender, String comment, MyDate birthDate, String color, int price, boolean isSaltyWater, boolean isPredator) {
    super(name, gender, comment, birthDate, color, price); // Calls the constructor of the parent class (Pet)
    this.isSaltyWater = isSaltyWater;
    this.isPredator = isPredator;
  }

  /**
   * Constructor for creating a Fish object that is already owned by a customer.
   *
   * @param name          The name of the fish.
   * @param gender        The gender of the fish ('M' or 'F').
   * @param comment       Additional comments about the fish.
   * @param birthDate     The birth date of the fish.
   * @param color         The color of the fish.
   * @param customer      The customer who owns the fish.
   * @param isSaltyWater  Indicates if the fish is a saltwater fish.
   * @param isPredator    Indicates if the fish is a predator.
   */
  public Fish(String name, char gender, String comment, MyDate birthDate, String color, Customer customer, boolean isSaltyWater, boolean isPredator) {
    super(name, gender, comment, birthDate, color, customer); // Calls the constructor of the parent class (Pet)
    this.isSaltyWater = isSaltyWater;
    this.isPredator = isPredator;
  }

  /**
   * Checks if the fish is a saltwater fish.
   *
   * @return A boolean value: `true` if the fish lives in saltwater, `false` otherwise.
   */
  public boolean isSaltyWater() {
    return isSaltyWater;
  }

  /**
   * Checks if the fish is a predator.
   *
   * @return A boolean value: `true` if the fish is a predator, `false` otherwise.
   */
  public boolean isPredator() {
    return isPredator;
  }
}
