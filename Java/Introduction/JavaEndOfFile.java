import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count=1;
        while(scanner.hasNextLine()){
            System.out.println(count++ +" "+(scanner.nextLine()));
        }
    }
}