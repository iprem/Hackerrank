import java.util.Arrays;
import java.util.Scanner;

public class DecimalToBinary {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
        int t =sc.nextInt();
        int[] a = new int[31];
        for(int i =0;i <t; i ++){
            int num = sc.nextInt();
            int j =0;
            Arrays.fill(a,-1);
            while(num>0){
                a[j++] = num&1;
                num >>= 1;
            }
            //System.out.println(j);
            while(--j>=0){
                System.out.print(a[j]);
                
            }
            System.out.println();
        }
	}

}
