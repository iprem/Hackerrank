import java.util.Scanner;

public class LonelyInteger {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] num = new int[100];
        
        for(int i =0 ; i< N; i++){
            num[sc.nextInt()]++ ;
        }
        for(int i =0; i< 100; i++){
            if(num[i] == 1){
                System.out.println(i);
                break;
            }
        }

	}

}
