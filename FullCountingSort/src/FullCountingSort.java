import java.util.Scanner;

public class FullCountingSort {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[100];
        
        StringBuilder[] sb = new StringBuilder[100];
        for(int i =0; i<100; i++){
            sb[i] = new StringBuilder("");
        }
        
        for(int i = 0; i<n ; i++){
            int num = sc.nextInt();
            ar[num]++;
            String s = sc.next();
            if(i >= n/2)
                sb[num].append(s+" ");
            else
                sb[num].append("- ");
        }
        for(int i =0; i<100;i ++){
            if(ar[i] != 0)
                System.out.print(sb[i]);
        }
	}

}
