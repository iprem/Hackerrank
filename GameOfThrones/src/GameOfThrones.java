import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GameOfThrones {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
        String str = sc.next();
        Map<Integer, Integer> hm = new HashMap<Integer,Integer>();
        for(int i =0; i<str.length(); i++){
            Integer ch = (int)str.charAt(i);
           
            if(hm.containsKey(ch)){
                Integer value = hm.get(ch);
                hm.put(ch, (value++)%2);
            }
            else
                hm.put(ch, 1);
        }
        if(hm.containsValue(1))
            System.out.println("NO");
        else
            System.out.println("YES");

	}

}
