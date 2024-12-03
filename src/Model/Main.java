package Model;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
  public static void main(String[] args)
  {

    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.

    Cat cat = new Cat("Lea", 'f', "She ate a cup cake", new MyDate(4,4,1997), "White" ,new Customer("asd", "asds", "asd.asd@asd"), "Awd I don't know cats", "My mother");

    MyDate date1 = new MyDate(3,12,2024);
    MyDate date2 = new MyDate(23,1,2025);
    System.out.println(date1.until(date2));
    Reservation reservation = new Reservation(cat.getCustomer(), cat, new MyDate(3,12,2024), new MyDate(5,12,2024));
    System.out.println(reservation.getPrice());

  }
}