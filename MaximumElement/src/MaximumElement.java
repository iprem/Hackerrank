import java.util.Scanner;
import java.util.Stack;

public class MaximumElement {

	private static Scanner sc;

	public static void main(String[] args) {
		Stack<Long> st = new Stack<Long>();
        sc = new Scanner(System.in);
        int n = sc.nextInt();
        long element, max = -1;
        int flag = 0;
        for(int i = 0; i<n; i++){
            int type = sc.nextInt();
            if(type == 1){
                element = sc.nextLong();
                st.push(element);
                if(element > max && flag == 0)
                    max = element;
            }
            else if(type == 2){
                if(st.isEmpty() == false){
                    long p = st.pop();
                    if(p == max)
                        flag = 1;
                }
            }
            else{
                if(flag == 1){
                    Stack<?> tmp = (Stack<?>) st.clone();
                    max = -1;
                    long e;
                    while(tmp.isEmpty() != true){
                        e = (Long)tmp.pop();
                        if(e > max)
                            max = e;
                    }
                    flag = 0;
                }
                System.out.println(max);
            }
        }

	}

}
