import java.util.Scanner;

public class ChocolateFeast {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for(int i=0; i<T; i++){
            int N = sc.nextInt();
            int C = sc.nextInt();
            int M = sc.nextInt();
            int total = N/C;
            int tmp = total;
            while(tmp >= M){
                    total++;
                    tmp++;
                    tmp -= M;
            }
            System.out.println(total);
        }

	}

}
