import java.io.*;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = br.readLine();
        int n = Integer.parseInt(br.readLine()); // 연산 횟수
        LinkedList<Character> list = new LinkedList<>();

        // list = [a,b,c,d]
        for(int i = 0; i < word.length(); i++) {
            list.add(word.charAt(i));
        }

        ListIterator<Character> it = list.listIterator();

        while(it.hasNext()) {
            it.next(); // 커버 맨 뒤로
        }

        for(int i = 0; i < n; i++) {
            String command = br.readLine();
            char c = command.charAt(0);
            switch (c) {
                // 왼쪽에 더 있나 확인 후(hasPrevious) 커서 옮기기(previous)
                case 'L':
                    if(it.hasPrevious()) it.previous();
                    break;
                case 'D':
                    if(it.hasNext()) it.next();
                    break;
                case 'B':
                    if(it.hasPrevious()) {
                        it.previous();
                        it.remove();
                    }
                    break;
                case 'P':
                    // P x (charAt(2) = x)
                    char add = command.charAt(2);
                    it.add(add);
                    break;
                default:
                    break;
            }
        }
        for(Character result : list) {
            bw.write(result); // 출력
        }
        br.close();
        bw.close();
    }
}