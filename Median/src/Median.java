import java.util.Scanner;

public class Median {
	private static Scanner sc;

	static int swap(int a, int b){
        return a;
    }
    
    static int median(int[] ar, int l ,int r){
        if(l>=r)
            return r;
        int pivot = ar[r];
        int right = l;
        for(int i = l; i< r; i++){
            if(ar[i] < pivot){
                ar[right] = swap(ar[i], ar[i] = ar[right]);
                right++;
            }
        }
        ar[right] = swap(ar[r], ar[r] = ar[right]);
        int m;
        if(right == ar.length/2)
            return right;
        else if(right > ar.length/2)
            m = median(ar, l, right-1);
        else
            m = median(ar, right+1, r);
        
         return m;
    }

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        for(int i =0; i< n; i++){
            ar[i] = sc.nextInt();
        }
        if(ar.length == 1)
            System.out.println(ar[0]);
        else{
            int m = median(ar, 0, n-1);
            System.out.println(ar[m]);
        }
    }
}
