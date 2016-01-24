import java.util.LinkedList;
import java.util.Scanner;

public class QuickSort2 {
	private static Scanner sc;

	static int[] QuickSort(int[] ar, int l, int r){
        if(l>=r)
            return ar;
        int pivot = ar[l];
        LinkedList<Integer> l1 = new LinkedList<> ();
        LinkedList<Integer> l2 = new LinkedList<> ();
        for(int i = l; i<=r; i++){
            if(ar[i] < pivot)
                l1.add(ar[i]);
            if(ar[i] > pivot)
                l2.add(ar[i]);
        }
        int i =l;
        while(l1.isEmpty() == false)
            ar[i++] = l1.pop();
        int index = i;
        ar[i++] = pivot;
        while(l2.isEmpty() == false)
            ar[i++] = l2.pop();
        ar = QuickSort(ar, l, index-1);
        ar = QuickSort(ar, index+1, r);
        for(int j= l; j<=r; j++)
            System.out.print(ar[j] + " ");
        System.out.println();
        return ar;
    }

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        for(int i = 0; i< n; i++)
            ar[i] = sc.nextInt();
        ar = QuickSort(ar,0,n-1);
    }
}
