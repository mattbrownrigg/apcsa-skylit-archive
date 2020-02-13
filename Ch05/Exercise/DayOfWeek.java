// Chapter 5 Question 12

import java.util.Scanner;

public class DayOfWeek
{
  public static int toWeek(int day)
  {
    if(day < 31)
    {
        if(day % 7 - 1 < 0)
            return day % 7;
        else
            return day % 7 - 1;
    }
    else
        return 404;
    
  }

  public static void main(String[] args)
  {
    Scanner kboard = new Scanner(System.in);
    
    System.out.print("Day: ");
    int day = kboard.nextInt();

    kboard.close();

    int dayOfWeek = toWeek(day);

    System.out.println(dayOfWeek);
  }
}
