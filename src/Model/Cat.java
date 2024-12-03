package Model;

/**
 * The `Cat` class represents a cat as a type of pet. It extends the `Pet` class,
 * inheriting common pet properties and behaviors, while introducing additional
 * attributes specific to cats, such as breed and breeder information.
 */
public class Cat extends Pet {

  // Attributes
  private String breed;   // The breed of the cat
  private String breeder; // The breeder who bred the cat

  /**
   * Constructor for creating a Cat object when it is being sold (not yet owned by a customer).
   *
   * @param name        The name of the cat.
   * @param gender      The gender of the cat ('M' or 'F').
   * @param comment     Additional comments about the cat.
   * @param birthDate   The birth date of the cat.
   * @param color       The color of the cat.
   * @param price       The price of the cat.
   * @param breed       The breed of the cat.
   * @param breeder     The breeder who bred the cat.
   */
  public Cat(String name, char gender, String comment, MyDate birthDate, String color, int price, String breed, String breeder) {
    super(name, gender, comment, birthDate, color, price); // Calls the constructor of the parent class (Pet)
    this.breed = breed;
    this.breeder = breeder;
  }

  /**
   * Constructor for creating a Cat object that is already owned by a customer.
   *
   * @param name        The name of the cat.
   * @param gender      The gender of the cat ('M' or 'F').
   * @param comment     Additional comments about the cat.
   * @param birthDate   The birth date of the cat.
   * @param color       The color of the cat.
   * @param customer    The customer who owns the cat.
   * @param breed       The breed of the cat.
   * @param breeder     The breeder who bred the cat.
   */
  public Cat(String name, char gender, String comment, MyDate birthDate, String color, Customer customer, String breed, String breeder) {
    super(name, gender, comment, birthDate, color, customer); // Calls the constructor of the parent class (Pet)
    this.breed = breed;
    this.breeder = breeder;
  }

  /**
   * Gets the breed of the cat.
   *
   * @return A string representing the breed of the cat.
   */
  public String getBreed() {
    return breed;
  }

  /**
   * Gets the breeder information for the cat.
   *
   * @return A string representing the breeder of the cat.
   */
  public String getBreeder() {
    return breeder;
  }
}
