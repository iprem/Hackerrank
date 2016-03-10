import java.util.*;

public class SwapNodes {
    
    static int[] left;
    static int[] right;
    static int[] depth;
	private static Scanner sc;
    
    static void calculateDepth(int cur, int d){
        depth[cur] = d;
        if(left[cur] > 0)   calculateDepth(left[cur], d+1);
        if(right[cur] > 0)  calculateDepth(right[cur], d+1);
    }
    
    static void inorder(int cur){
        if(left[cur] > 0)   inorder(left[cur]);
        System.out.print(cur+ " ");
        if(right[cur] > 0)  inorder(right[cur]);
    }
    
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        int totalNodes = sc.nextInt();
        left = new int[totalNodes+1];
        right = new int[totalNodes+1];
        depth = new int[totalNodes+1];
        for(int i=1; i<=totalNodes; i++){
            left[i] = sc.nextInt();
            right[i] = sc.nextInt();
        }
        calculateDepth(1,1);
        int k = sc.nextInt();
        while(k-- > 0){
            int d = sc.nextInt();
            // d[i] is a multiple of k
            // left child of i becomes right, and vice versa
            for(int i = 1; i<= totalNodes; i++){
                if(depth[i] % d == 0){
                    int temp = left[i];
                    left[i] = right[i];
                    right[i] = temp;
                }
            }
            inorder(1);
            System.out.println();
        }
    }
}
