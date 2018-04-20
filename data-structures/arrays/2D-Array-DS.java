import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {
    
    
    public static int sumArray(int[][] a, int r, int c) {
        int top = a[r][c] + a[r][c+1] + a[r][c+2];
        int mid = a[r+1][c+1];
        int bot = a[r+2][c] + a[r+2][c+1] + a[r+2][c+2];
        return top+mid+bot;
    }

    /*
     * Complete the array2D function below.
     */
    static int array2D(int[][] arr) {
        int cnt = arr.length - 2;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<cnt; i++) {
            for(int j=0; j<cnt; j++) {
                int sum = sumArray(arr,i,j);
                max = sum>max ? sum : max;
            }
        }
        return max;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int arrRowItr = 0; arrRowItr < 6; arrRowItr++) {
            String[] arrRowItems = scanner.nextLine().split(" ");

            for (int arrColumnItr = 0; arrColumnItr < 6; arrColumnItr++) {
                int arrItem = Integer.parseInt(arrRowItems[arrColumnItr].trim());
                arr[arrRowItr][arrColumnItr] = arrItem;
            }
        }

        int result = array2D(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}
