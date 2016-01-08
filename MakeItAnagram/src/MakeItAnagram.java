import java.util.Scanner;

public class MakeItAnagram {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        int len1 = str1.length();
        int len2 = str2.length();
        int count = 0;
        for(int i =0; i< len1; i++){
            for(int j = 0; j< len2; j++){
                if(str1.charAt(i) == str2.charAt(j)){
                    count++;
                    str2 = str2.substring(0,j)+"#"+str2.substring(j+1);
                    //System.out.println(count + " "+ len1 + " " + len2);
                    break;
                }
            }
        }
        count = (len1 + len2 - 2*count);
        System.out.println(count);
	}

}
