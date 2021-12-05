import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        String[] aArray = a.toLowerCase().split("");
        String[] bArray = b.toLowerCase().split("");
        
        if(aArray.length == bArray.length){
            
            for(int i = 0; i < aArray.length ; i++){
                
                String letter = aArray[i];
                int aScore = 0;
                int bScore = 0;
                
                for(int j = 0; j < aArray.length; j++){
                    if(letter.equals(aArray[j])) aScore++;
                }
                
                for(int h = 0; h < bArray.length; h++){
                    if(letter.equals(bArray[h])) bScore++;
                }
                
                if(aScore != bScore) return false;
            }       
                        
        } else {
            return false;
        }
        
        return true;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
