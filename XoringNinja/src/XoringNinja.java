import java.util.Scanner;

public class XoringNinja {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for(int i =0; i< T; i++){
            int n = sc.nextInt();
            long[] arr = new long[n];
            int[] bit = new int[64]; 
            int c=0, flag = 0;
            long sum =0;
            for(int j =0; j< n; j++){
                arr[j] = sc.nextLong();
                c = 0;
                while((arr[j] > 0) && (flag < 33)){
                    if(bit[c++] == 0){
                        bit[c-1] = (int)(arr[j] & 1); 
                        sum += (bit[c-1] * ((long)Math.pow(2,c-1) %(1000000007)));
                        if(bit[c-1] == 1)
                        	flag++;
                    }
                    arr[j] >>= 1;
                }
            }
            for(int j = 1; j< n; j++)
            	sum = (2*sum)%1000000007 ;
            System.out.println(sum);
        }
	}

}
