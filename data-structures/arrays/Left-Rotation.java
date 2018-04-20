import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void printRotated(int[] a, int r) {
        r = r%a.length;
        int pointer = r;
        for(int i=0; i<a.length; i++) {
            System.out.print(a[pointer]+" ");
            pointer++;
            pointer%=a.length;
            if(pointer==r) {
                break;
            }
        }
    }
    
    
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nd = scan.nextLine().split(" ");

        int n = Integer.parseInt(nd[0].trim());

        int d = Integer.parseInt(nd[1].trim());

        int[] a = new int[n];

        String[] aItems = scan.nextLine().split(" ");

        for (int aItr = 0; aItr < n; aItr++) {
            int aItem = Integer.parseInt(aItems[aItr].trim());
            a[aItr] = aItem;
        }
        
        printRotated(a,d);
    }
}