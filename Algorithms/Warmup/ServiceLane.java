import java.util.*;

class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int T = scanner.nextInt();
        int[] data = new int[N];
        for(int i = 0;i < N; i++){
            data[i] = scanner.nextInt();
        }
        
        int i,j;
        int min;
        for(int t = 0;t < T; t++){
            min = 3;
            i = scanner.nextInt();
            j = scanner.nextInt();
            for(int k = i; k<=j ; k++){
                if(min>data[k]){
                    min = data[k];
                }
            }
            System.out.println(min);
        }
    }
}