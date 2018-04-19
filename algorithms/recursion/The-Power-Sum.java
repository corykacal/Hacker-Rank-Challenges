import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static double root(double num, double root) {
        return Math.pow(Math.E, Math.log(num)/root);
    } 

    static int powerSum(int X, int N, int num) {
        int result = X - (int) Math.pow(num,N);
        if(result==0) {
            return 1;
        }
        if(result<0) {
            return 0;
        }
        return powerSum(result,N,num+1) + powerSum(X,N,num+1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int X = in.nextInt();
        int N = in.nextInt();
        int result = powerSum(X, N, 1);
        System.out.println(result);
        in.close();
    }
}
