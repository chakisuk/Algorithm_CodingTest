import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public final static int MAX = 30;
    static int[][] dp = new int[MAX+1][MAX+1]; // 조합을 계산 할 때 사용 하는 배열

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCount = Integer.parseInt(br.readLine());

        createComie();

        for(int i = 0; i < testCount; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken()); // 서쪽
            int n = Integer.parseInt(st.nextToken()); // 동쪽

            System.out.println(dp[n][r]);
        }

    }

    static void createComie() {
        for(int i = 1; i <= 30; i++) {
            dp[i][1] = i; // 30C1 = 30
        }

        for(int j = 2; j <= MAX; j++) {
            for(int k = 2; k <= MAX; k++) {
                // nCr = n-1 C r-1 + n-1 C r
                dp[j][k] = dp[j-1][k-1] + dp[j-1][k];
            }
        }
    }
}
