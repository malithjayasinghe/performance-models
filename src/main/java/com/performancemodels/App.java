package com.performancemodels;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String input= args[0];
        int moment = Integer.parseInt(args[1]);
        System.out.println("Start to calculate the moment");
        double ex_moment= DistributionUtilities.getMoment(y,input);
        System.out.println("The moment("+args[1]+ ") = " + ex_moment);
        System.out.println("exiting from the program");
    }
}
