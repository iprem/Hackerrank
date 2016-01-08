import java.util.Arrays;
import java.util.Scanner;

public class ClosestNumbers {
	private static Scanner sc;

	public static void main(){
		sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        for(int i =0; i< n; i++){
            ar[i] = sc.nextInt();
        }
        Arrays.sort(ar);
        //StringBuilder sb = new StringBuilder("");
        int min = Math.abs(ar[0] - ar[1]);
        for(int i =1; i< n-1; i++){
            int diff = Math.abs(ar[i] - ar[i+1]);
            if(diff < min )
                min = diff; 
        }
        for(int i =0; i<n-1 ; i++){
            if(Math.abs(ar[i] - ar[i+1]) == min)
                System.out.print(ar[i]+" " + ar[i+1]+ " ");
        }
	}
}
