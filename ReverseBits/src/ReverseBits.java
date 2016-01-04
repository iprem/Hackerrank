import java.util.Scanner;

public class ReverseBits {
	
	private static Scanner sc;

	public static int reverse(int n){
		int tmp = 0;
		for(int i =0; i< 32; i++){
			tmp |= ((n>>i) & 1);
			System.out.println(tmp + " " + i);
			if(i != 31)
				tmp <<= 1;
		}
		
		return Math.abs(tmp);
	}

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(reverse(n));
		
	}

}
