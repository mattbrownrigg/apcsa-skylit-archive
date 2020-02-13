// Chapter 5 Question 12

import java.util.Scanner;

public class DigitSwap
{
  public static int toSwap(int n)
  {
      return n%10*10 + n%100/10 + n/100*100;
  }

  public static void main(String[] args)
  {
    Scanner kboard = new Scanner(System.in);

    System.out.print("Let n equal: ");
    int pNum = kboard.nextInt();

    kboard.close();
    
    int result = toSwap(pNum);
    
    System.out.println(result);
  }
}
