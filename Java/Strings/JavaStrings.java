import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String line=scanner.nextLine();
        int n=scanner.nextInt();
        LinkedList<String> list=new LinkedList<String>();
        for(int i=0;i<line.length()-n+1;i++){
            list.add(line.substring(i,i+n));
        }
        Collections.sort(list);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
    }
}