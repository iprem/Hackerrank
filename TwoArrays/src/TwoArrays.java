import java.util.Arrays;
import java.util.Scanner;

public class TwoArrays {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int j =0; j<t; j++){
            int n = sc.nextInt();
            long k = sc.nextInt();
            long[] a1 = new long[n];
            long[] a2 = new long[n];
            for(int i = 0; i< n; i++)
                a1[i] = sc.nextLong();
            for(int i = 0; i< n; i++)
                a2[i] = sc.nextLong();
            Arrays.sort(a1);
            Arrays.sort(a2);
            int flag = 0;
            for(int i = 0; i<n; i++){
                if(a1[i] + a2[n-i-1] < k){
                    flag = 1;
                    break;
                }
            }
            if(flag == 1)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
	}

}
