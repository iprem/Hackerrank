import java.util.Scanner;

public class ValidNumber {
	
	 private static Scanner sc;

	public static boolean isNumber(String s) {
	        boolean b = false, flag = false, flag1 = false, flag2 = false, flag3 = false, flag4 = false;
	        
	        for(int i =0; i<s.length(); i++){
	            int dig = (int)s.charAt(i);
	            
	            if((dig == 32)){
	                if(flag == true)
	                    flag1 = true;
	                else if(flag3 == true || flag2 == true)
	                    return false;
	            }
	            else if((dig == '+') || (dig == '-')){
	                if(b == true)
	                    return false;
	                if(flag4 == true){
	                    flag4 = false;
	                    flag3 = true;
	                    b = false;
	                    continue;
	                }
	                if(flag == true || flag2 == true || flag3 == true)
	                    return false;
	                flag3 = true;
	            }
	            else if(dig == '.'){
	                if(flag2 == true || flag4 == true || flag1 == true)
	                    return false;
	                flag2 = true;
	            }
	            else if(dig == 'e'){
	                if(b == false || flag4 == true)
	                    return false;
	                flag4 = true;
	                b = false;
	            }
	            else if(dig>47 && dig<58){
	                flag = true;
	                if(flag1 == true)
	                    return false;
	                b = true;
	            }
	            else
	                return false;
	        }
	        return b;
	    }
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(isNumber(str));

	}

}
