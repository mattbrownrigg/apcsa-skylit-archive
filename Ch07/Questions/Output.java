
import java.util.Scanner;

public class Output
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        
        System.out.print("Enter a positive Integer: ");
        int n = kb.nextInt();
        kb.nextLine();
        
        System.out.print("Enter a positive Integer: ");
        int b = kb.nextInt();
        kb.close();
        
        for(int p = 1; p <= n; p++)
        {
            n = n - p;
            p = p * b;
        }
        
        System.out.print(n);
    }
}
