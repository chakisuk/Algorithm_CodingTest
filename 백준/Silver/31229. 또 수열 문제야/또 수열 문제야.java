import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int res = 1;
        for(int i = 0; i < num; i++) {
            System.out.print(res + " ");
            res += 2;
        }
    }
}