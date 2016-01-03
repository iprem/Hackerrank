import java.util.Scanner;

public class FunnyString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int flag, len;
        for(int i = 0; i< T; i++){
            String S = sc.next();
            flag = 0;
            len = S.length();
            for(int j = 1 ; j<len ; j++){
                int ch1 = (int)S.charAt(j-1) - (int)S.charAt(j);
                int ch2 = (int)S.charAt(len-j-1) - (int)S.charAt(len-j);
                if(Math.abs(ch1) != Math.abs(ch2)){
                    flag = 1;
                    break;
                }
            }
            if(flag == 1)
                    System.out.println("Not Funny");
                else
                    System.out.println("Funny");
        }

	}

}
