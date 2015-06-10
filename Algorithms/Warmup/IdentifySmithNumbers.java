import java.util.*;

class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        if(getSumOfDigits(N)==getSum(getAllPrimeFactors(N))){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
    }

    private static long getSum(LinkedList<Integer> list) {
        long total = 0;
        for (Integer i : list) {
            total += getSumOfDigits(i);
        }
        return total;
    }

    private static LinkedList<Integer> getAllPrimeFactors(int n) {
        int temp = n;
        LinkedList< Integer> factors = new LinkedList<Integer>();
        while (temp > 1) {
            for (int i = 2; i <= temp; i++) {
                if (temp % i == 0) {
                    factors.add(i);
                    temp = temp / i;
                    break;
                }
            }
        }
        return factors;
    }

    private static int getSumOfDigits(long n) {
        int tot = 0;
        long temp = n;
        while (temp > 0) {
            tot += (temp % 10);
            temp /= 10;
        }
        return tot;
    }
}
