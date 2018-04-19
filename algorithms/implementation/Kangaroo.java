import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    

    static String kangaroo(int x1, int v1, int x2, int v2) {
        // y = x*v1 + x1
        // y = x*v2 + x2
        // x*v1 + x1 = x*v2 + x2
        
        double v = (double) v1-v2;
        double x = (double) x1-x2;
        double root = ((-x)/v);
        if((root)%1 != 0 || root<0) {
            return "NO";
        } else {
            return "YES";
        }
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);
    }
}
