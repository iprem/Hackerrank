import java.util.Scanner;

public class SherlockAndArray {
	private static Scanner sc;

	public static void main(String[] args) {
        sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i =0; i< t; i++){
            int n = sc.nextInt();
            int[] ar1 = new int[n];
            int[] ar2 = new int[n];
            for(int j = 0; j< n; j++){
                ar1[j] = sc.nextInt();
                if(j == 0)
                    ar2[j] = ar1[j];
                else
                    ar2[j] = ar2[j-1] + ar1[j];
            }
            int flag = 0;
            for(int j = 0; j< n; j++){
                int firstHalf = ar2[j] - ar1[j];
                int secondHalf = ar2[n-1] - ar2[j];
                if(firstHalf == secondHalf){
                    flag = 1;
                    break;
                }
            }
            if(flag == 0)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
}
