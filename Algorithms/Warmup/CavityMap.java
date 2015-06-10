import java.util.*;

class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        int[][] data = new int[n][n];
        boolean[][] isCavity = new boolean[n][n];

        String temp;

        for (int i = 0; i < n; i++) {
            temp = scanner.nextLine();
            for (int j = 0; j < n; j++) {
                data[i][j] = temp.charAt(j);
                isCavity[i][j] = false;
            }
        }

        for (int i = 1; i < n - 1; i++) {
            for (int j = 1; j < n - 1; j++) {
                if (data[i][j] > data[i - 1][j] && data[i][j] > data[i][j - 1] && data[i][j] > data[i + 1][j] && data[i][j] > data[i][j + 1]) {
                    isCavity[i][j] = true;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (isCavity[i][j]) {
                    System.out.print("X");
                } else {
                    System.out.print((char) data[i][j]);
                }
            }
            System.out.println("");
        }
    }
}
