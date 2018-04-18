import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void plusMinus(int[] arr) {
        double neg = 0.0;
        double pos = 0.0;
        double zer = 0.0;
        for(int num: arr) {
            if(num<0) {
                neg++;
            } else if(num>0) {
                pos++;
            } else {
                zer++;
            }
        }
        double size = (double)arr.length;
        System.out.println(pos/size);
        System.out.println(neg/size);
        System.out.println(zer/size);

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        plusMinus(arr);
        in.close();
    }
}
