package Model;

import java.util.Date;

/**
 * The `Dog` class represents a dog as a type of pet. It extends the `Pet` class,
 * inheriting common pet properties and behaviors, while introducing additional
 * attributes specific to dogs, such as breed and breeder information.
 */
public class Dog extends Pet {

  // Attributes
  private String breed;   // The breed of the dog
  private String breeder; // The breeder who bred the dog

  /**
   * Constructor for creating a Dog object.
   *
   * @param name        The name of the dog.
   * @param age         The age of the dog (in years).
   * @param gender      The gender of the dog ('M' or 'F').
   * @param comment     Additional comments about the dog.
   * @param birthDate   The birth date of the dog.
   * @param color       The color of the dog.
   * @param price       The price of the dog.
   * @param breed       The breed of the dog.
   * @param breeder     The breeder who bred the dog.
   */
  public Dog(String name, int age, char gender, String comment, MyDate birthDate, String color, int price, String breed, String breeder) {
    super(name, gender, comment, birthDate, color, price); // Calls the constructor of the parent class (Pet)
    this.breed = breed;
    this.breeder = breeder;
  }

  /**
   * Gets the breed of the dog.
   *
   * @return A string representing the breed of the dog.
   */
  public String getBreed() {
    return breed;
  }

  /**
   * Gets the breeder information for the dog.
   *
   * @return A string representing the breeder of the dog.
   */
  public String getBreeder() {
    return breeder;
  }
}
