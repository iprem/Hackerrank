import java.util.Scanner;
import java.util.Stack;

public class BalancedParenthesis {

	private static Scanner sc;

	public static void main(String[] args) {
		Stack<Character> st = new Stack<Character>();
        sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for(int i = 0; i<t; i++){
            String exp = sc.next();
            st.clear();
            for(int j = 0; j<exp.length(); j++){
                char ch = exp.charAt(j);
                if(st.isEmpty() == true){
                    st.push(ch);
                }
                else{
                    char c = st.peek();
                    if(ch == ')' && c == ch-1){
                        st.pop();
                    }
                    else if(ch == c+2 )
                        st.pop();
                    else{
                        st.push(ch);
                    }
                }
            }
            if(st.isEmpty() == true)
                System.out.println("YES");
            else{
                System.out.println("NO");
            }
        }

	}

}
