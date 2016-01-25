import java.util.Scanner;

public class RunningTimeQuickSort {
	static int insertionSortSwaps;
    static int quickSortSwaps;
	private static Scanner sc;
    
    static void insertionSort(int[] ar){
        for(int i = 1; i < ar.length; i++){
            int value = ar[i];
            int j = i - 1;
            while(j >= 0 && ar[j] > value){
                ar[j + 1] = ar[j];
                j = j - 1;
                insertionSortSwaps++;
            }
            ar[j + 1] = value;
        }
    }
    
    static int swap(int a , int b){
        return a;
    }
    
    static int[] quickSort(int[] ar, int l, int r){
        if(l>=r)
            return ar;
        int pivot = ar[r];
        int right = l;
        for(int i =l; i<r; i++){
            if(ar[i] < pivot){
                ar[right] = swap(ar[i], ar[i]=ar[right]);
                quickSortSwaps++;
                right++;
            }
        }
        ar[r] = swap(ar[right], ar[right] = ar[r]);
        quickSortSwaps++;
        quickSort(ar, l, right-1);
        quickSort(ar, right+1, r);
        return ar;
    }

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        int[] ar2 = new int[n];
        for(int i = 0; i< n; i++){
            ar[i] = sc.nextInt();
            ar2[i] = ar[i];
        }
        quickSort(ar, 0, n-1);
        insertionSort(ar2);
        System.out.println(insertionSortSwaps - quickSortSwaps);
    }
}
