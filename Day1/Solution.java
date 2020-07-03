package Day1;

import java.util.Scanner;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
 
        /* Declare second integer, double, and String variables. */
  
        /* Read and save an integer, double, and String to your variables.*/
        
        int n = scan.nextInt();
        double r= scan.nextDouble();
        scan.nextLine();
     
        String str= scan.nextLine();
        /* Print the sum of both integer variables on a new line. */
        System.out.println(i+n);
        System.out.println((double)d+r);
        System.out.println(s+str);

        /* Print the sum of the double variables on a new line. */
		
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */

        scan.close();
}
}