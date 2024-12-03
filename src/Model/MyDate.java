package Model;

import java.time.temporal.ChronoUnit;

public class MyDate
{
  private int day;
  private int month;
  private int year;

  public MyDate(int day, int month, int year)
  {
    this.year = year;
    this.month = month;
    this.day = day;
  }

  public int getDay()
  {
    return day;
  }

  public int getMonth()
  {
    return month;
  }

  public int getYear()
  {
    return year;
  }

  public void setDayMonthYear(int day, int month, int year)
  {
    this.day = day;
    this.month = month;
    this.year = year;
  }

  public boolean isBefore(MyDate date)
  {
    if (year < date.year)
    {
      return true;
    }
    else if (year == date.year)
    {
      if (month < date.month)
      {
        return true;
      }
      else if (month == date.month)
      {
        if (day < date.day)
        {
          return true;
        }
      }
    }
    return false;
  }

  private boolean isLeapYear()
  {
    if (year % 4 == 0 && year % 100 != 0)
    {
      return true;
    }
    else
      return year % 400 == 0;
  }
  private int daysInMonth()
  {
    if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8
        || month == 10 || month == 12)
    {
      return 31;
    }
    else if (month == 2)
    {
      if (isLeapYear())
      {
        return 29;
      }
      else
      {
        return 28;
      }
    }
    else if (month == 4 || month == 6 || month == 9 || month == 11)
    {
      return 30;
    }

    else
    {
      return -1;
    }
  }
  private void nextDay()
  {
    day++;
    if (day > daysInMonth())
    {
      month++;
      day=1;
      if (month>12)
      {
        year++;
        month=1;
      }
    }
  }

  public int until(MyDate endDate)
  {
    MyDate temp = copy();
    int countDays = 0;
    while (!temp.equals(endDate))
    {
      temp.nextDay();
      countDays++;
    }
    return countDays;
  }

  public MyDate copy()
  {
    return new MyDate(day, month, year);
  }

  public String toString()
  {
    return day + "/" + month + "/" + year;
  }

  public boolean equals(MyDate myDate)
  {
    return day == myDate.day && month == myDate.month && year == myDate.year;
  }
}





