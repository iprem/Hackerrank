import java.util.Scanner;

public class SherlockAndWatson {
	private static Scanner sc;

	public static void main(String[] args) {
        sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int Q = sc.nextInt();
        int[] ar = new int[N];
        for(int i = 0; i< N; i++){
            ar[(i+K)%N] = sc.nextInt();
        }
        for(int i = 0; i< Q; i++){
            int idx = sc.nextInt();
            System.out.println(ar[idx]);
        }
    }
}
