import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<Integer> q = new LinkedList<>();
        int n = Integer.parseInt(br.readLine()); // 6

        for(int i = 1; i <= n; i++) {
            q.offer(i);
        } // [1, 2, 3, 4, 5, 6]

        while(q.size() > 1) {
            q.poll();
            q.offer(q.poll());
        }

        System.out.println(q.poll());
    }
}
