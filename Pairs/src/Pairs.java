import java.util.Arrays;
import java.util.Scanner;

public class Pairs {
	private static Scanner sc;

	public static void main(){
		sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] ar = new int[n];
        int count = 0, j;
        for(int i = 0; i<n; i++){
            ar[i] = sc.nextInt();
            /*j = 0;
            while(j < i){
                if(Math.abs(ar[i] - ar[j]) == k){
                    count++;
                    break;
                }
                j++;
            }*/
        }
        Arrays.sort(ar);
        int l = 0;
        for(int i =0; i<n; i++){
            j = n-1;
            while(Math.abs(ar[i] - ar[j]) > k && j > l) j--;
            if(Math.abs(ar[i] - ar[j]) == k){
                count++;
                l = j;
            }
            if(l == n-1)    break;
        }
        System.out.println(count);
	}
}
