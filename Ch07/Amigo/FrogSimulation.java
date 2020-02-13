public class FrogSimulation
{
    /** Distance in inches from the starting point to the goal */
    private int goalDistance;

    /** Maximum number of hops allowed to reach the goal */
    private int maxHops;

    /** Constructs a FrogSimulation where dist is the distance, in inches, from the starting
     *  position to the goal, and numHops is the maximum number of hops allowed to reach the goal.
     * Precondition: dist > 0; numHops > 0
     */
    public FrogSimulation(int dist, int numHops)
    {
	this.goalDistance = dist;
	this.maxHops = numHops;
    }

    /**  Returns an integer representing the distance, in inches, to be moved when the frog hops.
     */
    private int hopDistance()
    {
	//generate a random integer between 1 & 20 inclusive.
	int num = (int)(Math.random() * 20) + 1;

	//75% of the time return a postive number between 1 and 7 inclusive
	if (num <= 15)
	    return (int)((Math.random() * 7) + 1);
	//25% of the time return a negative int between -1 and -7 inclusive
	else if (num <=18)
	    return (-1) * (int)((Math.random() * 7) + 1);		
	//5% of the time return a positive number between 8 and 30 inclusive
	else if (num <=19)
	    return (int)((Math.random() * 22) + 8);
	//5% of the time return a negative number between -8 and -30 inclusive
	else
	    return (-1) * (int)((Math.random() * 22) + 8);		
    }

    public boolean simulate()
    {
	//write this method!  This return statement is just here so the skeleton code will compile.	
	return true;
    }
    
    public double runSimulations(int num)
    {
	//write this method!  This return statement is just here so the skeleton code will compile.
	return 0.5;
    }
    
    //Run this main method to test your code.
    public static void main(String[] args)
    {

	System.out.println("********* Testing FrogSimulation **********");
	System.out.println("Creating FrogSimulation object with goalDistance 24 and maxHops 5...");
	FrogSimulation frogSim = new FrogSimulation(24, 5);
	System.out.print("Running the simulate() method 5 times: ");
	for (int i = 0; i < 5; i++)
	    System.out.print(frogSim.simulate() + " ");
	System.out.println();
	System.out.print("Running runSimulation() method with 400 trials: ");
	System.out.println(frogSim.runSimulations(400));	
	System.out.println("********* Testing PrintNums with value 5 and numRounds 4 **********");
	printNums(5,4);
    }


    //You can choose to implement this method here as well, eventhough it is not really part of this class.
    public static void printNums(int value, int numRounds)
    {
	
    }   
		
}
