import java.util.*;

class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            long number = scanner.nextLong();
            process(number);
        }
    }

    private static void process(long number) {

        String s = number + "";

        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            int val = s.charAt(i) - 48;

            if (val != 0) {
                if (number % val == 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
