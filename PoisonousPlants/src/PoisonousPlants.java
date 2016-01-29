import java.util.LinkedList;
import java.util.Scanner;

public class PoisonousPlants {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<Integer>();
        int n = sc.nextInt();
        int[] ar = new int[n];
        int flag = 0, j= 0;
        for(int i = 0; i< n; i++){
            ar[i] = sc.nextInt();
            if(list.isEmpty() == true || ar[i] < ar[i-1]){
                if(i!=0 && ar[i] < list.peekLast()){
                    list.remove(j-1);
                    j--;
                    if(i > 1 && ar[i-2] >= ar[i-1]){
                        list.addLast(ar[i-1]);
                        j++;
                    }
                }
                list.addLast(ar[i]);
                j++;
            }
            else if (ar[i] > ar[i-1])
                flag = 1;
            System.out.println(list);
        }
        int days = 1;
        if(ar[n-1] == ar[n-2]){
            list.addLast(ar[n-1]);
        }
        /*if (flag == 1 && list.size() == 1){
            days = 2;
        }*/
        while(flag != 0){
            flag = 0;
            System.out.println(list);
            for(int i =list.size()-1; i>0; i--){
                if(list.get(i) > list.get(i-1)){
                    list.remove(i);
                    flag = 1;
                }
            }
            days++;
        }
        System.out.println(days-1);

	}

}
