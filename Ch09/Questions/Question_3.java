
/**
 * Write a description of class Question_3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Question_3
{
    public static void main(String[] args)
    {
        String[] list = {"One", "Two", "Three"};
        for(String s : list)
        {
            s+="*";
            System.out.println(s);
        }
            
        System.out.println(list[0]);
        System.out.println(list[1]);
        System.out.println(list[2]);
    }
}
