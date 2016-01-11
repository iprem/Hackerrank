import java.util.Arrays;
import java.util.Scanner;

public class MarkAndToys {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i< n; i++)
            a[i] = sc.nextInt();
        Arrays.sort(a);
        int sum = 0, count = 0;
        while(sum<=k){
            sum+= a[count++];
        }
        System.out.println(count-1);
	}

}
