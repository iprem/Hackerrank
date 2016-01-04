import java.util.Scanner;

public class Pangram {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] arr = new int[26];
        
        for(int i = 0; i< str.length() ; i++){
            int ch = (int)str.charAt(i);
            if(ch > 64 && ch < 91)
                arr[ch-65] = 1;
            else if(ch > 96 && ch < 123)
                arr[ch - 97] = 1;
        }
        int sum = 0;
        for(int i: arr){ 
            sum+=i;
        }            
        if( sum == 26 )
            System.out.println("pangram");
        else System.out.println("not pangram");

	}

}
