import java.util.Scanner;

public class ReverIntegers {
	
	private static Scanner sc;

	public static int reverse(int x){
		
		int rev = 0, flag =0;
        if(x< 0){
            flag = 1;
            x*=-1;
        }
        for(int i = x; i> 0; i/=10){
            int dig = i %10;
            
            //Take care of overflow condition
            if(rev > (Integer.MAX_VALUE/10 + dig/10)){
                rev = 0;
                break;
            }
            
            rev = rev*10 + (i%10);
            //System.out.println(rev +" "+ (Integer.MAX_VALUE + dig));
        }
        if(flag == 1)
            rev*=-1;
        return rev;
	}
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(reverse(n));

	}

}
