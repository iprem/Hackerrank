import java.util.Scanner;

public class AlternateCharacters {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
        int T = sc.nextInt(), ch2,ch;
        String str;
        for(int i = 0; i<T; i++){
            str= sc.next();
            int count = 0;
            ch2 = str.charAt(0);
            for(int j= 1; j< str.length(); j++){
                ch = str.charAt(j);
                if(ch == ch2)
                    count++;
                else ch2 = ch;
            }
            
            System.out.println(count);
        }
	}

}
