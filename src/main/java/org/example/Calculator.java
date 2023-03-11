package org.example;


/**
 * Hello world!
 *
 */
import java.lang.Math;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.*;
public class Calculator {
    public static double root(double n) {
        logger.info("[ROOT] - " + n);
        if (n < 0) {
            return Double.NaN;
        }

        double ans = Math.sqrt(n);
        logger.info("[RESULT - ROOT] - " + ans);
        return ans;
    }
    private static final Logger logger = LogManager.getLogger(Calculator.class);
    //	MyClass.class.getName()
//	logger.entry();
    public static void main( String[] args ) {
//        System.out.println(logger.isDebugEnabled());

        Scanner sc = new Scanner(System.in);
//    	logger.entry();
        System.out.println("Welcome to Calculator Program");
        System.out.println("Enter the number for the required operation");
        System.out.println("1. Square root function - √x");
        System.out.println("2. Factorial function - x!");
        System.out.println("3. Natural logarithm (base е) - ln(x)");
        System.out.println("4. Power function - x^" + "b");
        int loop = sc.nextInt();
//    	while (1==1) {
        if (loop == 1) {
            System.out.println("Square root function - √x");
            System.out.println("Input the number");
            double n = sc.nextDouble();
            Double ans = root(n);
            if (ans.isNaN()) {
                System.out.println("Invalid input, Please Try again");
                logger.error("Invalid input, Entered input is not of the expected type");

                return;
            }
            System.out.println("Result: " + ans);
        }
    }
}