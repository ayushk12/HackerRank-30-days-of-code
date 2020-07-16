package Day9;


    public class Solution {

        // Complete the factorial function below.
        static int factorial(int n) {
     if(n==0){
         return 1;
     }
     else return factorial(n-1)*n;
        }
}