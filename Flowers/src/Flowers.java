import java.util.Arrays;
import java.util.Scanner;

public class Flowers {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] ar = new int[n];
        
        for(int i = 0; i<n; i++){
            ar[i] = sc.nextInt();
        }
        int cost =0, j=k, l = 0;
        Arrays.sort(ar);
        for(int i = n-1; i>=0; i--){
            
            if(k < 1){
                k = j;
                l++;
            }
            cost+=(l+1)*ar[i];
            k--;
        }
        System.out.println(cost);
	}

}
