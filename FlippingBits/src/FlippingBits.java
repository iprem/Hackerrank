import java.util.Scanner;

public class FlippingBits {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for(int i = 0; i< T; i++){
            long num = sc.nextLong();
            num = num ^ (((long)1<<32) - 1);
            System.out.println(num);
        }

	}

}
