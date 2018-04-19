import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            boolean plus = true;
            int cnt = 0;
            ArrayList<Integer> con = new ArrayList<Integer>();
            for(int i=1; i<=n; i++) {
                if(cnt==k) {
                    if(plus) {
                        plus = false;
                    } else {
                        plus = true;
                    }
                    cnt=0;
                }
                if(plus) {
                    if(i+k>n) {
                        con = new ArrayList<Integer>();
                        con.add(-1);
                        break;
                    }
                    con.add(i+k);
                } else {
                    if(i-k<1) {
                        con = new ArrayList<Integer>();
                        con.add(-1);
                        break;
                    }
                    con.add(i-k);
                }
                cnt++;
            }
            for(int i: con) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
