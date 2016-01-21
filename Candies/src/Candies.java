import java.util.Scanner;

public class Candies {

    private static Scanner sc;

	public static void main(String[] args) {
        sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] c = new int[n];
        c[0] = 1;
        for(int i =0; i<n; i++){
            a[i] = sc.nextInt();
            if(i>0 && a[i] > a[i-1])
                c[i] = c[i-1]+1;
            else
                c[i] = 1;
        }
        int candies = 0;
        for(int i = n-2; i>=0; i--){
            if(a[i] > a[i+1]){
                if(c[i] <= c[i+1])
                    c[i] = c[i+1]+1;
            }
            candies+=c[i];
        }        
        System.out.println(candies+c[n-1]);
    }
    }
