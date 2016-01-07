import java.util.Scanner;

public class StringReduction {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
        int t = sc.nextInt();
        String s;
        int a =0, b=0, c=0;
        for(int i =0; i< t; i++){
        	
            s = sc.next();
            a =0;
            b =0;
            c =0;
            
            for(int j =0; j<s.length(); j++){
            	if(s.charAt(j)== 'a')
            		a++;
            	else if(s.charAt(j) == 'b')
            		b++;
            	else c++;
            }
           
            if(a == 0 && b== 0)
                System.out.println(c);
            else if(a== 0 && c == 0)
                System.out.println(b);
            else if(b == 0 && c == 0)
                System.out.println(a);
            else if(a%2 == b%2 && b%2 == c%2)
                System.out.println(2);
            else
                System.out.println(1);

        }
	}

}
