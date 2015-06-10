import java.util.*;

class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {

            int N = scanner.nextInt();
            int K = scanner.nextInt();

            int count = 0;
            boolean ok = false;
            for (int j = 0; j < N; j++) {
                int temp = scanner.nextInt();
                if (temp <= 0) {
                    count++;
                }

                if (K <= count &&!ok) {
                    System.out.println("NO");
                    ok = true;
                }
            }

            if (!ok) {
                System.out.println("YES");
            }

        }
    }

}
