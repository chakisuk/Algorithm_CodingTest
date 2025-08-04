import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] dp = new int[n+1];
        int[] score = new int[n+1];

        for(int i = 1; i < n+1; i++) {
            score[i] = Integer.parseInt(br.readLine()); // 각 점수 기입
        }

        if(n == 1) {
            dp[1] = score[1];
        } else if(n == 2) {
            dp[2] = score[1] + score[2];
        } else {
            dp[1] = score[1];
            dp[2] = score[1] + score[2];
            dp[3] = Math.max(score[1] + score[3], score[2] + score[3]);

            // 두계단 + 한계단
            // 두계단
            for(int i = 4; i < n+1; i++) {
                dp[i] = Math.max(dp[i-3] + score[i-1] + score[i], dp[i-2] + score[i]);
            }
        }
        System.out.println(dp[n]);

    }
}
