import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int numLines = s.nextInt();
        
        //I tried to use some kind of hashset where I could remove the furthest index since Integer 
        //hashcode is just "return val;". in a stack like manner. but I do not know how to
        PriorityQueue<Integer> maxValues = new PriorityQueue<Integer>(numLines,Collections.reverseOrder());
        
        Stack<Integer> stack = new Stack<Integer>();
        
        for(int i=0; i<numLines; i++) {
            int action = s.nextInt();
            
            if(action==1) {
                int val = s.nextInt();
                stack.push(val);
                maxValues.add(val);
            }
            if(action==2) {
                int val = stack.pop();
                int maxVal = maxValues.peek();
                //O(1) for popping off biggest
                if(val==maxVal) {
                    maxValues.poll();
                } else {
                    //remove element
                    maxValues.remove(val);

                }
                
            }
            if(action==3) {
                System.out.println(maxValues.peek());
            }
        }
    }
}