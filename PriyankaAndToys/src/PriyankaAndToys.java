import java.util.Arrays;
import java.util.Scanner;

public class PriyankaAndToys {

	private static Scanner sc;

	public static void main(){
		sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i< n; i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int count = 0;
        int j = 0;
        for(int i =1; i<n ; i++){
            if(a[i] > a[j]+4){
                count++;
                j = i;
            }
        }
        System.out.println(count+1);
	}
}
