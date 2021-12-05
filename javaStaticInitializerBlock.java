import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

static int H, B;
static boolean flag = false;

static{
    Scanner s = new Scanner(System.in);
    B = s.nextInt();
    H = s.nextInt();
    
    try{
    
    if(B<0 || H<0) throw new Exception();
    flag = true;

    } catch (Exception e){
        System.out.println("java.lang.Exception: Breadth and height must be positive");
    }
}

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

