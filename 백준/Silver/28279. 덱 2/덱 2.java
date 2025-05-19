import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> deque = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());


        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            switch (Integer.parseInt(st.nextToken())) {
                case 1:
                    // offer = offerLast
                    deque.offerFirst(Integer.parseInt(st.nextToken()));
                    break;
                case 2:
                    deque.offerLast(Integer.parseInt(st.nextToken()));
                    break;
                case 3:
                    if(deque.isEmpty()) {
                        sb.append(-1).append('\n');
                    } else {
                        sb.append(deque.poll()).append('\n'); // 뽑고 제거
                    }
                    break;
                case 4:
                    if(deque.isEmpty()) {
                        sb.append(-1).append('\n');
                    } else {
                        sb.append(deque.pollLast()).append('\n');
                    }
                    break;
                case 5:
                    sb.append(deque.size()).append('\n');
                    break;
                case 6:
                    if(deque.isEmpty()) {
                        sb.append(1).append('\n');
                    } else {
                        sb.append(0).append('\n');
                    }
                    break;
                case 7:
                    if (deque.isEmpty()) {
                        sb.append(-1).append('\n');
                    } else {
                        sb.append(deque.getFirst()).append('\n');
                    }
                    break;
                case 8:
                    if(deque.isEmpty()) {
                        sb.append(-1).append('\n');
                    } else {
                        sb.append(deque.getLast()).append('\n');
                    }
                    break;
            }
        }
        System.out.println(sb);
    }
}
