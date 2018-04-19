import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String super_reduced_string(String s){
        boolean removal = false;
        int i;
        for(i=0; i<s.length()-1; i++) {
            char a = s.charAt(i);
            char b = s.charAt(i+1);
            if(a==b) {
                s = s.substring(0,i) + s.substring(i+2,s.length());
                i = -1;
            }
        }
        if(s.length()==0) {
            return "Empty String";
        } else {
            return s;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = super_reduced_string(s);
        System.out.println(result);
    }
}