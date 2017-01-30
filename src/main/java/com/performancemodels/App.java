package com.performancemodels;

import java.io.*;


/**
 * Hello world!
 */
public class App {
    public static void main(String[] args){
        Double d=DistributionUtilities.getMean(args[0]);
        System.out.println("Mean Value= "+d);

    }
}