import java.util.*;

public class AlmostSorted {
	private static Scanner sc;

	static boolean isSorted(int[] ar){
        for(int i = 1; i< ar.length; i++){
            if(ar[i] < ar[i-1])
                return false;
        }
        return true;
    }
    
    static int swap (int a, int b){
        return a;
    }

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        int l=0,r=0;
        ar[0] = sc.nextInt();
        int flag = 0;
        for(int i = 1; i< n; i++){
            ar[i] = sc.nextInt();
            if(ar[i] < ar[i-1]){
                if(flag == 0){
                    l = i-1;
                    flag = 1;
                }
                r = i;
            }
        }
        if(flag == 0){
            System.out.println("yes");
        }
        else{
            int tmp = ar[l];
            ar[l] = ar[r];
            ar[r] = tmp;
            if(isSorted(ar) == true)
                System.out.println("yes\nswap " + (l+1) + " " + (r+1));
            else{
                for(int j = l+1; j<= (l+r)/2; j++){
                    ar[r-j+l] = swap(ar[j], ar[j] = ar[r-j+l]);
                }
                if(isSorted(ar) == false){
                    System.out.println("no");
                }
                else{
                    System.out.println("yes\nreverse " + (l+1) + " " + (r+1));
                }
            }
        }
    }
}
