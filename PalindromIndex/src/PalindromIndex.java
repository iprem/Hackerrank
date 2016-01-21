import java.util.Scanner;

public class PalindromIndex {

	private static Scanner sc;

	static boolean isPalindrom(String s){
        int len = s.length();
        for(int i =0; i<len/2; i++){
            if(s.charAt(i) != s.charAt(len-i-1))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for(int j =0; j<t; j++){
            String s = sc.next();
            if(isPalindrom(s)){
                System.out.println(-1);
            }
            else{
                int len = s.length();
                for(int i = 0; i<=len/2; i++){
                    if(s.charAt(i) == s.charAt(len-i-1))
                        continue;
                    String sub1 = s.substring(0,i) + s.substring(i+1);
                    //System.out.println(sub1+ " "+sub2);
                    if(isPalindrom(sub1)){
                        System.out.println(i);
                        break;
                    }
                    String sub2 = s.substring(0,len-i-1) + s.substring(len-i);
                    if(isPalindrom(sub2)){
                        System.out.println(len-1-i);
                        break;
                    }
                }
            }
        }
    }

}
