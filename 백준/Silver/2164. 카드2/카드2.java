import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<Integer> q = new LinkedList<>();
        int n = Integer.parseInt(br.readLine()); // 6
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = i+1;
            q.add(arr[i]);
        } // [1, 2, 3, 4, 5, 6]

        while(q.size() > 1) {
            q.remove(q.peek()); // 첫 번째 삭제
            int pop = q.peek(); // 앞에꺼 뽑기
            q.remove(q.peek());
            q.add(pop); // 뽑은거 맨 뒤로
        }
        System.out.println(q.get(0));
    }
}
