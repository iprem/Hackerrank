import java.util.Scanner;

public class QuickSortInplace {
	private static Scanner sc;

	static int swap(int a, int b){
        return a;
    }
    
    static int[] QuickSort(int[] ar, int l, int r){
        if(l>=r)
            return ar;
        int pivot = ar[r];
        int right = l;
        for(int i = l; i< r; i++){
            if(ar[i] < pivot){
                ar[right] = swap(ar[i], ar[i] = ar[right]);
                right++;
            }
        }
        ar[r] = swap(ar[right], ar[right] = ar[r]);
        for(int i = 0; i< ar.length; i++){
            System.out.print(ar[i] + " ");
        }
        System.out.println();
        ar = QuickSort(ar, l, right-1);
        ar = QuickSort(ar, right+1, r);
        return ar;
    }

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        for(int i = 0; i<n; i++){
            ar[i] = sc.nextInt();
        }
        QuickSort(ar,0,n-1);
    }
}
