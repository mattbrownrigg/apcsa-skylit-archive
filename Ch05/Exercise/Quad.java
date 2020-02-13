// Chapter 5 Question 12

import java.util.Scanner;

public class Quad
{
  public static double toPosRoot(double a, double b, double discriminant)
  {
      return ((-b + discriminant) / (2 * a));
  }
  public static double toNegRoot(double a, double b, double discriminant)
  {
      return ((-b - discriminant) / (2 * a));
  }

  public static void main(String[] args)
  {
    Scanner kboard = new Scanner(System.in);

    System.out.print("A: ");
    double a = kboard.nextInt();

    System.out.print("B: ");
    double b = kboard.nextInt();
    
    System.out.print("C: ");
    double c = kboard.nextInt();

    kboard.close();
    
    double discriminant = Math.sqrt(Math.pow(b, 2) - 4 * a * c);

    double positiveRoot = toPosRoot(a, b, discriminant);
    double negativeRoot = toNegRoot(a, b, discriminant);

    System.out.println("x = " + positiveRoot + " and " + negativeRoot);
  }
}
