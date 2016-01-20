import java.util.Scanner;

public class SherlockAndAnagrams {
	private static Scanner sc;

	static boolean isAnagram(String s1, String s2){
        int[] ar1 = new int[26];
        int[] ar2 = new int[26];
        for(int i =0; i<s1.length(); i++){
            ar1[s1.charAt(i) - 97]++;
            ar2[s2.charAt(i) - 97]++;
        }
        for(int i =0 ;i <26; i++){
            if(ar1[i]!=ar2[i])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for(int i =0; i<t; i++){
            String str = sc.next();
            int count = 0;
            for(int x = 0; x<str.length(); x++){
            for(int j =x; j+1<=str.length()-1;j++){
                String sub1 = str.substring(x,j+1);
                for(int k = x+1; k+sub1.length()<=str.length(); k++){
                    String sub2 = str.substring(k,k+sub1.length());
                    //System.out.println(sub1 + " " + sub2);
                    if(isAnagram(sub1, sub2))
                        count++;
                }
            }
            }
            System.out.println(count);
        }
    }
}
