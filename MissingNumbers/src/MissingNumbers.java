import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class MissingNumbers {
	private static Scanner sc;

	public static void main(String[] args) {
        sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer,Integer> map = new HashMap<>();
        for(int i =0; i< n; i++){
            int num = sc.nextInt();
            if(map.containsKey(num))
                map.put(num, map.get(num)+1);
            else
                map.put(num,1);
        }
        int m = sc.nextInt();
        for(int i =0; i< m; i++){
            int num = sc.nextInt();
            if(map.containsKey(num))
                map.put(num, map.get(num)-1);
            else
                map.put(num,-1);
        }
        Map<Integer, Integer> tmap = new TreeMap<>(map);
        Set<?> set = tmap.entrySet();
        Iterator<?> iterator = (Iterator<?>) set.iterator();
        while(iterator.hasNext()){
            Map.Entry e = (Map.Entry)iterator.next();
            int tmp = (int) e.getValue();
            if(tmp < 0)
                System.out.print(e.getKey()+ " ");
        }
    }
}
