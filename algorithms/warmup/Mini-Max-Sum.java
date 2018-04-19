import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the miniMaxSum function below.
     */
    static void miniMaxSum(int[] arr) {
        long max_num = 0;
        long min_num = 1000000000;
        long sum = 0;
        
        for(int num : arr) {
            sum+=num;
            max_num = num>max_num ? num : max_num;
            min_num = num<min_num ? num : min_num;
        }
        
        System.out.print((sum-max_num) + " ");
        System.out.print(sum-min_num);

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scan.nextLine().split(" ");

        for (int arrItr = 0; arrItr < 5; arrItr++) {
            int arrItem = Integer.parseInt(arrItems[arrItr].trim());
            arr[arrItr] = arrItem;
        }

        miniMaxSum(arr);
    }
}
