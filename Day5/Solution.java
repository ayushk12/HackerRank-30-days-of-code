package Day5;

import java.util.Scanner;
public class Solution {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
       
        scanner.close();
        for(int i =1;i<=10;i++){
    
       
        System.out.println(n +" x "+i+" = "+(n*i));
        }
    }
}