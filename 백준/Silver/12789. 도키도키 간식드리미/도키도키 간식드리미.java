import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 학생 수
        int n = Integer.parseInt(br.readLine());
        int index = 1; // 간식 주려는 번호
        String result = "Nice"; // 기본 값
        String[] arr = br.readLine().split(" ");
        Stack<Integer> stack = new Stack<>();

        // 현재줄 + 대기 줄 사람 처리
        for(int i = 0; i < n; i++) {
            int currentNum = Integer.parseInt(arr[i]);
            if(index != currentNum) {
                if(!stack.isEmpty() && index == stack.peek()) {
                    index ++;
                    i --;
                    stack.pop();
                } else {
                    stack.push(currentNum);
                }
            } else {
                index ++;
            }
        }
        // 대기 줄 사람 처리
        while(!stack.isEmpty()) {
            int pop = stack.pop();
            if(pop == index) {
                index ++;
            } else {
                result = "Sad";
                break;
            }
        }
        System.out.println(result);
    }
}
