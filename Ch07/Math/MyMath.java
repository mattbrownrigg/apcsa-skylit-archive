import java.util.Scanner;

public class MyMath
{
  /**
   * Returns the sum of all integers from 1 to n, if n >= 1,
   * and 0 otherwise.
   */
  public static int sumUpTo(int n)
  {
    int sum = 0;

    for (int k = 1; k <= n; k++)
      sum += k;

    return sum;
  }

  /**
   * Returns 1 * 2 * ... * n, if n >= 1; otherwise returns 1
   */
  public static long factorial(int n)
  {
    long f = 1;

    for (int k = 2; k <= n; k++)
      f *= k;

    return f;
  }

  /**
   * Returns true if n is a prime; otherwise returns false
   */
  public static boolean isPrime(int n)
  {
    if (n <= 1)
      return false;

    int m = 2;

    while (m * m <= n)
    {
      if (n % m == 0)
        return false;
      m++;
    }
    //System.out.println(m);
    return true;
  }

  /**
   * Tests Goldbach conjecture for even numbers
   * up to bigNum
   */
  public static boolean testGoldbach(int bigNum)
  {
    for (int n = 6; n <= bigNum; n += 2)  // obviously true for n = 4
    {
      boolean found2primes = false;

      for (int p = 3; p <= n/2; p += 2)
      {
        if (isPrime(p) && isPrime(n - p))
          found2primes = true;
      }

      if (!found2primes)
      {
        System.out.println(n + " is not a sum of two primes!");
        return false;
      }
    }

    return true;
  }
  
  public static boolean isPerfectNumber(long n)
  {
      long sum = 0;
      
      for(int k = 1; k <= n/2 ; k++)
      {
          if(n % k == 0)
            sum += k;
      }
      
      if(sum == n)
      {
        //System.out.print(sum);
        return true;
      }
      return false;
  }

  /*********************************************************************/

  public static void main(String[] args)
  {
    Scanner kb = new Scanner(System.in);
    int n;

    do
    {
      System.out.print("Enter an integer from 4 to 20: ");
      n = kb.nextInt();
    } while (n < 4 || n > 20);

    kb.close();

    System.out.println();
    System.out.println("Is " + n + " a perfect number? " + isPerfectNumber(n));
    System.out.println();
    System.out.print("The first four perfect numbers are: ");
    int count = 0;
    for(int k = 1; count < 4; k++)
    {
        if(isPerfectNumber(k))
        {
            System.out.print(k + ", ");
            count++;
        }
    }
    System.out.println();
    System.out.println();
    System.out.println("The first 6 Mersenne Primes are: ");
    int primeCount = 0;
    for(int p = 1; primeCount < 6; p++)
    {
        if(isPrime((int)Math.pow(2, p) - 1))
        {
            System.out.print("The Mersenne prime: ");
            System.out.print((int)Math.pow(2, p) - 1 + ", ");
            System.out.print("Its corresponding perfect number: ");
            System.out.print((long)Math.pow(2, p-1) * ((long)Math.pow(2, p) - 1) + "\n");
            primeCount++;
        }
    }
    System.out.println("\n" + "1 + ... + " + n + " = " + sumUpTo(n));
    System.out.println(n + "! = " + factorial(n));
    System.out.println("Primes: ");
    for (int k = 1; k <= n; k++)
      if (isPrime(k))
        System.out.print(k + " ");
    System.out.println();
    System.out.println("Goldbach conjecture up to " + n + ": " + testGoldbach(n));
    System.out.println();
    
  }
}

