import java.util.Scanner;

public class CountingSort2 {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[100];
        for(int  i= 0; i< n;i ++){
            a[sc.nextInt()]++;
        }
        for(int i =0;i < 100; i++){
            for(int j = 0; j<a[i]; j++)
                System.out.print(i+ " ");
        }
	}

}
