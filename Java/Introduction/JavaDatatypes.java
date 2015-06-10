import java.util.*;

class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < T; i++) {

            boolean ok_byte = false, ok_short = false, ok_int = false, ok_long = false;

            String line = scanner.nextLine();
            try {
                Byte.parseByte(line);
                ok_byte = true;
            } catch (Exception e) {
            }

            try {
                Short.parseShort(line);
                ok_short = true;
            } catch (Exception e) {
            }

            try {
                Integer.parseInt(line);
                ok_int = true;
            } catch (Exception e) {
            }

            try {
                Long.parseLong(line);
                ok_long = true;
            } catch (Exception e) {
            }

            if (ok_byte || ok_short || ok_int || ok_long) {
                System.out.println(line + " can be fitted in:");
                if (ok_byte) {
                    System.out.println("* byte");
                }
                if (ok_short) {
                    System.out.println("* short");
                }
                if (ok_int) {
                    System.out.println("* int");
                }
                if (ok_long) {
                    System.out.println("* long");
                }
            } else {
                System.out.println(line + " can't be fitted anywhere.");
            }
        }
    }
}
