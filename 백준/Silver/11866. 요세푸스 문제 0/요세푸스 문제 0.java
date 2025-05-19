import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        LinkedList<Integer> list = new LinkedList<>();
        StringTokenizer st = new StringTokenizer(br.readLine(), " "); // 7 3

        int n = Integer.parseInt(st.nextToken()); // 7
        int k = Integer.parseInt(st.nextToken()); // 3

        for(int i = 1; i <= n; i++) {
            list.offer(i);
        }
        sb.append("<");
        int index = 0;

        while(n > 1) {
            index = (index + (k-1)) % n;
            sb.append(list.remove(index)).append(", ");
            n--;
        }
        
        sb.append(list.remove()).append(">");
        System.out.println(sb);
    }
}
