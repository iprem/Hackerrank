import java.util.Scanner;

public class CeaserCipher {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        int K = sc.nextInt();
        
        for(int i =0; i<N; i++){
            int c = (int)S.charAt(i);
            if((c < 91 && c > 64)){
                int ch = c + K;
                if (ch > 90)    ch = 65 + ((ch - 90-1)%26);
                System.out.print((char)ch);
            }
            else if ((c >= 97 && c < 123)){
                int ch = c + K;
                if (ch > 122)    ch = 97 + ((ch - 122-1)%26);
                System.out.print((char)ch);
            }
            else    System.out.print(S.charAt(i));
        }

	}

}
