import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] apt = new int[15][15];

        for(int i = 0; i < 15; i++) {
            apt[i][1] = 1; // 모든 층의 1호는 1명
            apt[0][i] = i; // 0층의 1호에 1명 2호에 2명 ... 14호에 14명
        }

        for(int i = 1; i < 15; i++) { // 층
            for(int j = 2; j < 15; j++) { // 호수
                apt[i][j] = apt[i-1][j] + apt[i][j-1]; // ex) 1층의2호 = 0층의2호 + 1층의1호
            }
        }

        // 테스트할 수
        int testCount = Integer.parseInt(br.readLine());

        for(int i = 0; i < testCount; i++) {
            // 층
            int k = Integer.parseInt(br.readLine());
            // 호수
            int n = Integer.parseInt(br.readLine());
            System.out.println(apt[k][n]);
        }
    }
}
