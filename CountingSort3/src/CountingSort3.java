import java.util.Scanner;

public class CountingSort3 {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[100];
        String[] s = new String[100];
        for(int i = 0; i< n; i++){
            int num = sc.nextInt();
            a[num]++;
            s[num] = sc.next();
        }
        
        for(int i =0; i< 100; i++){
            int sum = 0;
            for(int j =0; j<=i; j++)
                sum+=a[j];
            System.out.print(sum + " ");
        }
	}

}
