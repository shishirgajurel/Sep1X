package Model;

import java.util.ArrayList;

public class ReservationList
{
  private ArrayList<Reservation> reservations;


  public ReservationList()
  {
    reservations = new ArrayList<Reservation>();

  }
  public boolean isAvailable(Reservation reservation, int maxReservations)
  {
    if (reservations.size() < maxReservations)
    {
      return true;
    }
    return false;

  }

  public void addReservation(Reservation reservation)
  {
    reservations.add(reservation);
  }

  public void removeReservation(Reservation reservation)
  {
    reservations.remove(reservation);
  }

  public Reservation getReservation(int index)
  {
    return reservations.get(index);
  }

  public Reservation getReservationByCustomersEmailAddress(String email)
  {
    for (int i = 0; i < reservations.size(); i++)
    {
      if (reservations.get(i).getCustomer().getEmailAddress().equals(email))
      {
        return reservations.get(i);
      }
    }
    return null;
  }

  public Reservation getReservationByCustomersPhoneNumber(String phoneNumber)
  {
    for (int i = 0; i < reservations.size(); i++)
    {
      if (reservations.get(i).getCustomer().getPhoneNumber().equals(phoneNumber))
      {
        return reservations.get(i);
      }
    }
    return null;
  }


}
