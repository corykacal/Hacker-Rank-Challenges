import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the getTotalX function below.
     */
    static int getTotalX(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);
        int lowNum = a[0];
        int highNum = b[b.length-1];
        int count = 0;
        while(lowNum<=highNum) {
            if(hasFactors(lowNum,a) && isFactor(lowNum,b)) {
                count++;
            }
            lowNum++;
        }
        return count;
    }
    
    public static boolean hasFactors(int num, int[] a) {
        for(int i : a) {
            if(num%i!=0) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean isFactor(int num, int[] a) {
        for(int i : a) {
            if(i%num!=0) {
                return false;
            }
        }
        return true;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scan.nextLine().split(" ");

        int n = Integer.parseInt(nm[0].trim());

        int m = Integer.parseInt(nm[1].trim());

        int[] a = new int[n];

        String[] aItems = scan.nextLine().split(" ");

        for (int aItr = 0; aItr < n; aItr++) {
            int aItem = Integer.parseInt(aItems[aItr].trim());
            a[aItr] = aItem;
        }

        int[] b = new int[m];

        String[] bItems = scan.nextLine().split(" ");

        for (int bItr = 0; bItr < m; bItr++) {
            int bItem = Integer.parseInt(bItems[bItr].trim());
            b[bItr] = bItem;
        }

        int total = getTotalX(a, b);

        bw.write(String.valueOf(total));
        bw.newLine();

        bw.close();
    }
}