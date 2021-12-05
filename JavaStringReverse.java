import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String reverse = new StringBuilder()
            .append(A)
            .reverse()
            .toString();
        String answer = reverse.equals(A) ? "Yes" : "No";
        System.out.println(answer);        
    }
}
