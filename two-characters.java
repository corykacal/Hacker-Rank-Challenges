import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int twoCharaters(String s) {
        if(s.length()==1) {
            return 0;
        }
        HashSet<Character> chars = new HashSet<Character>();
        for(int i=0; i<s.length(); i++) {
            chars.add(s.charAt(i));
        }
        String temp = "";
        int biggest = 0;
        for(char c : chars) {
            for (char d: chars) {
                temp = s;
                if(c!=d) {
                    for(char e: chars) {
                        if(e!=d && e!=c) {
                            temp = temp.replace(""+e,"");
                        }
                    }
                    if(valid(temp)) {
                    int size = temp.length();
                    if(size>biggest) {
                        biggest=size;
                    }
                }
                }
                
            }
        }
        return biggest;
        
    }
    
    public static boolean valid(String s) {
        for(int i=1; i<s.length(); i++) {
            if(s.charAt(i-1)==s.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        String s = in.next();
        int result = twoCharaters(s);
        System.out.println(result);
        in.close();
    }
}
