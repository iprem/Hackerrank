import java.util.Scanner;

public class CavityMap {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for(int i =0; i< n; i++)
            str[i] = sc.next();
        System.out.println(str[0]);
        for(int i = 1; i<n-1; i++){
            for(int j = 1; j< n-1; j++){
                char ch = str[i].charAt(j);
                if(str[i-1].charAt(j) < ch && str[i+1].charAt(j) < ch && str[i].charAt(j-1) < ch && str[i].charAt(j+1)< ch)
                    str[i] = str[i].substring(0,j) + 'X' + str[i].substring(j+1);
            }
            System.out.println(str[i]);
        }
        if(n-1 > 0)
        System.out.println(str[n-1]);
	}

}
