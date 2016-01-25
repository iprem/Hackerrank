import java.util.Arrays;
import java.util.Scanner;

public class BiggerIsGreater {
	private static Scanner sc;

	public static void main(String[] args) {
        sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i =0; i<t; i++){
            String str = sc.next();
            int flag = 0, j;
            char ch = '\0'; 
            char ch2 = '\0';
            for(j= str.length()-1 ;j>0; j--){
                ch = str.charAt(j);
                ch2 = str.charAt(j-1);
                if(ch != ch2 && ch2 < ch){
                    flag = 1;
                    break;
                }
            }
            if(flag == 0 || str.length() < 2){
                System.out.println("no answer");
            }
            else{
                if(str.length() == 2){
                    System.out.println(Character.toString(ch) + Character.toString(ch2));
                }
                else{
                    int k = 0;
                    for(k = str.length()-1; k>=j; k--){
                        if(str.charAt(k) > ch2)
                            break;
                    }
                        StringBuilder s = new StringBuilder();
                        s.append(str.substring(j-1, k));
                        s.append(str.substring(k+1));
                        String st = s.toString();
                        char[] c = st.toCharArray();
                        Arrays.sort(c);
                        st = new String(c);
                        System.out.println(str.substring(0, j-1) + str.charAt(k) + st);
                    
                }
            } 
        }
    }
}
