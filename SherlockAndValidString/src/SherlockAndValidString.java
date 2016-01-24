import java.util.Scanner;

public class SherlockAndValidString {

	private static Scanner sc;

	public static void main(String[] args) {
        sc = new Scanner(System.in);
        String str = sc.next();
        int[] ar = new int[26];
        int len = str.length();
        for(int i =0; i< len; i++){
            ar[str.charAt(i) - 97]++;
        }
        int[] count = new int[2];
        int[] different = new int[2];
        int flag = 0;
        count[0] = 1;
        different[0] = ar[0];
        for(int i = 1; i<=25 ; i++){
            if(ar[i] < 1)
                continue;
            if(ar[i] == different[0])
                count[0]++;
            else{
                if(count[1] == 0){
                    different[1] = ar[i];
                    count[1]++;
                }
                else if(ar[i] == different[1])
                    count[1]++;
                else{
                    flag = 1;
                    break;
                }
            }
        }
        if(flag == 1)
            System.out.println("NO");
        else if(count[0] > 1 && count[1] > 1)
            System.out.println("NO");
        else
            System.out.println("YES");
    }

}
