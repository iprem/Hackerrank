import java.util.Scanner;

public class Atoi {
	
private static Scanner sc;

public static int myAtoi(String str) {
        
        int num = 0, f = 0;
        boolean flag = false, flag2 = false, flag3 = false;
        for(int i = 0; i<str.length(); i++){
            
            int dig = (int)str.charAt(i) - 48;
            
            if((dig+48) == 32){
                if(flag2 == true)
                    break;
                continue;
            }
            else if((dig<0 || dig>9)){ 
                if(f > 0)
                    break;
                if((char)(dig+48) == '-'){
                    flag = true;
                    flag2 = true;
                    f++;
                    continue;
                }
                else if((char)(dig+48) == '+'){
                    f++;
                    flag2 = true;
                    continue;
                }
                break;
            }
            
            //Take care of overflow conditions
            if( (num + dig/10.0) > (Integer.MAX_VALUE/10.0)){
                num = Integer.MAX_VALUE;
                flag3 = true;
                break;
            }

            num = num*10 + dig;
            flag2 = true;
        }
        if(flag == true){
            if((num == Integer.MAX_VALUE) && (flag3 == true)){
                return(Integer.MIN_VALUE);
            }
            num *= -1;
        }
        return num;
    }

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(myAtoi(str));
	}

}
