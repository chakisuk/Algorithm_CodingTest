import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        StringBuilder sb = new StringBuilder();

        br.close();

        for(int i = 0; i < m; i++) {
            int key = Integer.parseInt(st.nextToken());
            int answer = Arrays.binarySearch(arr, key);

            // arr에 key값이 존재하지 않는다면
            if(answer < 0) {
                sb.append(0).append('\n');
            } else {
                sb.append(1).append('\n');
            }
        }
        System.out.println(sb);
    }
}
