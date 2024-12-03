package Model;

/**
 * The `Pet` class represents a generic pet. It provides common attributes
 * and methods that can be shared among all pet types, such as name, gender,
 * birth date, color, price, and ownership information.
 */
public class Pet {

  // Attributes
  private String name;       // The name of the pet
  private char gender;       // The gender of the pet ('M' or 'F')
  private String comment;    // Additional comments or notes about the pet
  private MyDate birthDate;  // The birth date of the pet
  private String color;      // The color of the pet
  private int price;         // The price of the pet; -1 if not for sale
  private Customer customer; // The customer who owns the pet (if applicable)

  /**
   * Constructor for creating a Pet object when the pet is available for sale.
   *
   * @param name        The name of the pet.
   * @param gender      The gender of the pet ('M' or 'F').
   * @param comment     Additional comments or notes about the pet.
   * @param birthDate   The birth date of the pet.
   * @param color       The color of the pet.
   * @param price       The price of the pet.
   */
  public Pet(String name, char gender, String comment, MyDate birthDate, String color, int price) {
    this.name = name;
    this.gender = gender;
    this.comment = comment;
    this.birthDate = birthDate;
    this.color = color;
    this.price = price;
  }

  /**
   * Constructor for creating a Pet object that is already owned by a customer.
   *
   * @param name        The name of the pet.
   * @param gender      The gender of the pet ('M' or 'F').
   * @param comment     Additional comments or notes about the pet.
   * @param birthDate   The birth date of the pet.
   * @param color       The color of the pet.
   * @param customer    The customer who owns the pet.
   */
  public Pet(String name, char gender, String comment, MyDate birthDate, String color, Customer customer) {
    this.name = name;
    this.gender = gender;
    this.comment = comment;
    this.birthDate = birthDate;
    this.color = color;
    this.price = -1; // Indicates that the pet is not for sale
    this.customer = customer;
  }

  /**
   * Gets the name of the pet.
   *
   * @return A string representing the name of the pet.
   */
  public String getName() {
    return name;
  }

  /**
   * Sets the name of the pet.
   *
   * @param name A string representing the new name of the pet.
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Gets the gender of the pet.
   *
   * @return A char representing the gender of the pet ('M' or 'F').
   */
  public char getGender() {
    return gender;
  }

  /**
   * Gets additional comments or notes about the pet.
   *
   * @return A string representing comments about the pet.
   */
  public String getComment() {
    return comment;
  }

  /**
   * Sets additional comments or notes about the pet.
   *
   * @param comment A string representing the new comments for the pet.
   */
  public void setComment(String comment) {
    this.comment = comment;
  }

  /**
   * Gets the birth date of the pet.
   *
   * @return A `MyDate` object representing the birth date of the pet.
   */
  public MyDate getBirthDate() {
    return birthDate;
  }

  /**
   * Gets the color of the pet.
   *
   * @return A string representing the color of the pet.
   */
  public String getColor() {
    return color;
  }

  /**
   * Gets the price of the pet.
   *
   * @return An integer representing the price of the pet; -1 if not for sale.
   */
  public int getPrice() {
    return price;
  }

  /**
   * Sets the price of the pet.
   *
   * @param price An integer representing the new price of the pet.
   */
  public void setPrice(int price) {
    this.price = price;
  }

  /**
   * Assigns a customer as the owner of the pet.
   *
   * @param customer A `Customer` object representing the new owner of the pet.
   */
  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  /**
   * Gets the customer who owns the pet.
   *
   * @return A `Customer` object representing the owner of the pet; `null` if not owned.
   */
  public Customer getCustomer() {
    return customer;
  }

  /**
   * Returns a string representation of the pet object.
   *
   * @return A string containing the pet's name, gender, birth date, color, price, and comments.
   */
  public String toString() {
    return "Name: " + name +
        " Gender: " + gender +
        " Date of Birth: " + birthDate +
        " Color: " + color +
        " Price: " + price +
        " Comment: " + comment;
  }
}
