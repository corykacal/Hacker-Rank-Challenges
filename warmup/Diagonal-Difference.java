import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int diagonalDifference(int[][] a) {
        int l = 0;
        int r = 0;
        for(int i=0; i<a.length; i++) {
            for(int j=0; j<a[0].length; j++) {
                if(i==j) {
                    l +=a[i][j];
                }
                if(i==a.length-j-1) {
                    r +=a[i][j];
                }
            }
        }
        return Math.abs(l-r);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n][n];
        for(int a_i = 0; a_i < n; a_i++){
            for(int a_j = 0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        int result = diagonalDifference(a);
        System.out.println(result);
        in.close();
    }
}