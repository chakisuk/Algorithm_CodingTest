import java.util.*;

public class Solution {
    public Stack<Integer> solution(int []arr) {
        
        Stack<Integer> stack = new Stack<>();
        
        stack.push(arr[0]);
        
        for(int i = 1; i < arr.length; i++) {
            if(stack.get(stack.size() - 1) == arr[i]) {
                continue;
            } else {
                stack.push(arr[i]);
            }
        }
        
        return stack;
    }
}