import java.util.Scanner;

public class LoveLetterMystery {
	private static Scanner sc;

	public static void main(String[] args) {
        sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i< t; i++){
            String str = sc.next();
            int minOperations = 0;
            int len = str.length();
            for(int j = 0; j<len/2; j++){
                char ch1 = str.charAt(j);
                char ch2 = str.charAt(len-j-1);
                if(ch1 == ch2)
                    continue;
                minOperations += Math.abs(ch1 - ch2);
            }
            System.out.println(minOperations);
        }
    }
}
