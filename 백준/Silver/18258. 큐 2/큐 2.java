import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<Integer> q = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            switch (st.nextToken()) {
                case "push":
                    int num = Integer.parseInt(st.nextToken());
                    q.add(num);
                    break;
                case "pop":
                    if(q.isEmpty()) {
                        sb.append(-1).append('\n');
                    } else {
                        sb.append(q.peek()).append('\n');
                        q.remove(q.peek());
                    }
                    break;
                case "size":
                    sb.append(q.size()).append('\n');
                    break;
                case "empty":
                    if(!q.isEmpty()) {
                        sb.append(0).append('\n');
                    } else {
                        sb.append(1).append('\n');
                    }
                    break;
                case "front":
                    if(!q.isEmpty()) {
                        sb.append(q.peek()).append('\n');
                    } else {
                        sb.append(-1).append('\n');
                    }
                    break;
                case "back":
                    if(!q.isEmpty()) {
                        sb.append(q.get(q.size() - 1)).append('\n');
                    } else {
                        sb.append(-1).append('\n');
                    }
                    break;
            }
        }
        System.out.println(sb);
    }
}
