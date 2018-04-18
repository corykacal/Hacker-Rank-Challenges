import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int minimumNumber(int n, String password) {
        String numbers = "0123456789";
        String lower_case = "abcdefghijklmnopqrstuvwxyz";
        String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String special_characters = "!@#$%^&*()-+";
        int num = 1;
        int l = 1;
        int u = 1;
        int s = 1;
        int six = 1;
        if(password.length()>=6) {
            six = 0;
        }
        for(int i=0; i<password.length(); i++) {
            char c = password.charAt(i);
            if(num==1 && numbers.indexOf(c)!=-1) {
                num=0;
            }
            if(l==1 && lower_case.indexOf(c)!=-1) {
                l=0;
            }
            if(u==1 && upper_case.indexOf(c)!=-1) {
                u=0;
            }
            if(s==1 && special_characters.indexOf(c)!=-1) {
                s=0;
            }
        }
        if(six==1) {
            return Math.max((6-password.length()),(l+num+s+u));
        }
        return ((u+l+s+num));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String password = in.next();
        int answer = minimumNumber(n, password);
        System.out.println(answer);
        in.close();
    }
}