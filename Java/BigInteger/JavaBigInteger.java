import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String ta= scanner.nextLine();
        String tb= scanner.nextLine();
        
        BigInteger a= new BigInteger(ta);
        BigInteger b= new BigInteger(tb);
        
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }
}