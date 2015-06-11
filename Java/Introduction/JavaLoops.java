import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int T = scanner.nextInt();

        for(int i=0;i<T;i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();
        
            int total=a;
            for(int j=0;j<n;j++){
                total+=((int)Math.pow(2,j)*b);
                System.out.print(total);
                if(j!=n-1){
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        
    }
}