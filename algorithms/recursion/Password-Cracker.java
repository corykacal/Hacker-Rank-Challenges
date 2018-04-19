import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    //recursive backtracking problem
    static String passwordCracker(ArrayList<String> pass, String attempt, String result) {
        if(attempt.length()==0) {
            return result;
        }
        ArrayList<String> temp_pass = new ArrayList<String>(pass);
        for(String s : pass) {
            String temp = s;
            String temp_attempt;
            int pos = attempt.indexOf(s);
            if(pos==0) {
                temp_attempt = attempt.substring(s.length(),attempt.length());
                result += s + " ";
                
                String eval = passwordCracker(pass,temp_attempt,result);
                if(!eval.equals("WRONG PASSWORD")) {
                    return eval;
                }

                result = result.substring(0,result.length()-(s.length()+1));
            }
        }
        return "WRONG PASSWORD";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            ArrayList<String> pass = new ArrayList<String>();
            for(int pass_i = 0; pass_i < n; pass_i++){
                pass.add(in.next());
            }
            String attempt = in.next();
            String result = passwordCracker(pass, attempt, "");
            System.out.println(result);
        }
        in.close();
    }
}
