import java.util.Scanner;

public class SparseArrays {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for(int i = 0; i< n; i++){
            str[i] = sc.next();
            //System.out.println(str[i]);
        }
        int q = sc.nextInt();
        for(int j = 0; j< q; j++){
            String query = sc.next();
            int count = 0;
            for(int i =0; i< n; i++){
                if(query.equals(str[i]) == true)
                    count++;
            }
            System.out.println(count);
        }
	}

}
