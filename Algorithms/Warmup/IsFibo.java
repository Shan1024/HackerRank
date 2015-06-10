import java.util.*;

class Solution {

    private static ArrayList<Long> data = new ArrayList<Long>();
    private static HashMap<Long, Boolean> map = new HashMap<Long, Boolean>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        data.add((long) 1);
        data.add((long) 2);

        map.put((long) 1, true);
        map.put((long) 2, true);

        for (int i = 0; i < T; i++) {

            long n = scanner.nextLong();

            while (data.get(data.size() - 1) <= n) {
                long temp = data.get(data.size() - 2) + data.get(data.size() - 1);
                data.add(temp);
                map.put(temp, true);
            }
            
            if (map.containsKey(n)) {
                System.out.println("IsFibo");
            } else {
                System.out.println("IsNotFibo");
            }
        }
    }
}