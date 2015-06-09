import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int h;
        for(int i = 0 ; i < n ; i++){
            int c = scanner.nextInt();
            h = 1;
            for (int j = 1 ; j <= c ; j++){
                if(j%2 == 0){
                    h += 1;
                }else{
                    h = h*2;
                }
            }
            System.out.println(h);
        }
    }
}