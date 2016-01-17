import java.util.Scanner;
import java.util.Stack;

public class LargestRectangle {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> s = new Stack<Integer> ();
        int[] ar = new int[n];
        int i;
        for(i = 0; i<n; i++){
            ar[i] = sc.nextInt();
        }
        i = 0;
        int maxArea = 0;
        while(i<n){
            if(s.isEmpty() == true || ar[s.peek()] <= ar[i]){
                s.push(i++);
            }
            else{
                int index = s.pop();
                int area = ar[index] * ((s.isEmpty() == true) ? i : (i - s.peek() - 1));
                if(area > maxArea)
                    maxArea = area;
            }
        }
        i =1;
        while(s.isEmpty() == false){
            int area = i*ar[s.pop()];
            if(area> maxArea)
                maxArea = area;
            i++;
        }
        System.out.println(maxArea);

	}

}
