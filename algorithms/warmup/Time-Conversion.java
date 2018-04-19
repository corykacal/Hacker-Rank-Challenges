import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String timeConversion(String s) {
        int hour  = Integer.parseInt(s.substring(0,2));
        char stat = s.charAt(8);
        String hours;
        if(stat=='A') {
            if(hour==12) {
                hours = "00";
            } else {
                hours = s.substring(0,2); 
            }
        } else {
            if(hour==12) {
                hours = ""+hour;
            } else {
                hours = ""+(hour+12);
            }
        }
        return hours+s.substring(2,s.length()-2);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
