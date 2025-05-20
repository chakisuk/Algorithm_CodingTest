import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[] balloonLocation;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Deque<Balloon> deque = new ArrayDeque<>();

        balloonLocation = new int[n];

        for(int i = 0; i < n; i++) {
            // 3 2 1 -3 -1
            balloonLocation[i] = Integer.parseInt(st.nextToken());
        }

        sb.append("1 ");
        int moveValue = balloonLocation[0];

        for(int i = 1; i < n; i++) {
            deque.add(new Balloon(i+1, balloonLocation[i])); // 2번 인덱스 -> 2, 3:1, 4:-3, 5:-1
        }

        while(!deque.isEmpty()) {
            if(moveValue > 0) {
                for(int i = 1; i < moveValue; i++) {
                    deque.add(deque.poll());
                }

                Balloon next = deque.poll();
                moveValue = next.value;
                sb.append(next.idx+" ");
            } else{
                for(int i = 1; i < -moveValue; i++){
                    deque.addFirst(deque.pollLast());
                }

                Balloon next = deque.pollLast();
                moveValue = next.value;
                sb.append(next.idx).append(" ");
            }
        }

        System.out.println(sb.toString().trim());
        }
    }

class Balloon {
    int idx;
    int value;

    public Balloon(int idx, int value) {
        this.idx = idx;
        this.value = value;
    }
}
