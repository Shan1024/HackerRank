import java.util.*;

class Solution {

    private static int[] data;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        data = new int[N];
        for(int i = 0 ; i < N ; i++){
            data[i] = scanner.nextInt();
        }
        while(sticksAvailable()){
            int count = 0;
            int min = getShortest();
            for(int i = 0 ; i < N ; i++){
                if(data[i] != 0){
                    data[i]-=min;
                    count++;
                }
            }
            System.out.println(count);
        }
    }
    
    private static boolean sticksAvailable(){
         for(int i = 0 ; i < data.length ; i++){
            if(data[i]>0){
                return true;
            }
         }
        return false;
    }
        
    private static int getShortest(){
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i < data.length ; i++){
            if(data[i] < min && data[i] != 0){
                min = data[i];
            }
        }
        return min;
    }
}