
/**
 * Write a description of class PollTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PollTest
{
    public static void main(String[] args)
    {
        PollDisplayPanel votingMachine =
                         new PollDisplayPanel("Tami", "Brian", "Liz");
        votingMachine.vote1();
        votingMachine.vote2();
        votingMachine.vote3();
        System.out.println(votingMachine);
    }
}
