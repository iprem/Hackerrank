import java.util.Scanner;

public class CutSticks {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] sticks = new int[N];
        for(int i =0; i<N; i++){
            sticks[i] = sc.nextInt();
        }
        
        System.out.println(N);
        int min = sticks[0], count = 0, tmp;
        while(true){
            for(int j = 0; j<N; j++){
                //System.out.print(" "+sticks[j]);
                if( (sticks[j] < min) && (sticks[j] > 0)){
                    min = sticks[j];
                    //System.out.print(" Min "+min);
                }
            }
            //System.out.println("Min "+min);
            count = 0; tmp =0 ;
            for(int i =0 ; i< N; i++){
                sticks[i] -= min;
                //System.out.print(sticks[i]+ " ");
                if(sticks[i] > 0){
                    count++;
                    tmp = sticks[i];
                }
            }
            if(count == 0)  break;
            min += tmp;
            System.out.println(count);
        }
	}

}
