import java.util.Scanner;

public class TwoStrings {
	private static Scanner sc;

	public static void main(String[] args) {
        sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for(int i =0; i< t; i++){
            String s1 = sc.next();
            int[] ar1 = new int[26];
            String s2 = sc.next();
            int[] ar2 = new int[26];
            int l = (s1.length() > s2.length()) ? s1.length():s2.length();
            for(int j = 0; j< l ; j++){
                if(j<s1.length()){
                    char ch = s1.charAt(j);
                    ar1[ch - 97] = 1;
                }
                if(j<s2.length()){
                    char ch = s2.charAt(j);
                    ar2[ch- 97] = 1;
                }
            }

            int flag = 0;
            for(int j =0; j<26; j++){
                if(ar1[j] == 1 && ar2[j] == 1){
                   flag = 1;
                    break;
                }
                //System.out.println((char)(j+97) + " " + ar1[j] + " " + ar2[j]);
            }
            if(flag == 1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
