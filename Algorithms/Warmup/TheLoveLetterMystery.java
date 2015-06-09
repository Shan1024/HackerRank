import java.util.*;

class Solution {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        int count;
        for(int i = 0 ; i < N ; i++){
            String line = scanner.nextLine();
            count = 0;
            for(int j = 0; j < (line.length())/2 ; j++){
                char left = line.charAt(j);
                char right = line.charAt(line.length()-1-j);
                count+=(int)Math.abs(left-right);
            }
            System.out.println(count);
        }
    }
}