import java.util.Scanner;

public class MaximizingXOR {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
        int L = sc.nextInt();
        int R = sc.nextInt();
        
        if(L > R) {
            L = L ^ R;
            R = L ^ R;
            L = L ^ R;
        }  
        
        int max = L ^ L;
        
        for(int i = L ; i<= R; i++){
            for(int j =i ; j <= R; j++){
                if((i ^ j) > max)
                    max = i ^ j;
            }
        }
        System.out.println(max);

	}

}
