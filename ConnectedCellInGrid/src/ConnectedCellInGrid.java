import java.util.Scanner;

public class ConnectedCellInGrid {
static int[][] ar;
private static Scanner sc;
    
    public static int findArea(int[][] ar, int i, int j){
        if(i>ar.length-1 || j>ar[0].length-1 || i < 0 || j < 0)
            return -1;
        if(ar[i][j] == 0 || ar[i][j] == -1)
            return -1;
        ar[i][j] = -1;
        //System.out.println(i+ " " + j);
        int areaHorizontal = 1 + findArea(ar,i, j+1);
        int areaVertical = 1 + findArea(ar, i+1, j);
        int areaDiagonal = 1 + findArea(ar, i+1, j+1);
        int h2 = 1 + findArea(ar, i, j-1);
        int v2 = 1+ findArea(ar, i-1, j);
        int d2 = 1 + findArea(ar, i-1, j-1);
        int d3 = 1 + findArea(ar, i+1, j-1);
        int d4 = 1 + findArea(ar, i-1, j+1);
        //System.out.println(areaHorizontal + " " + areaVertical + " " + areaDiagonal);
        return (areaHorizontal+areaVertical+areaDiagonal+ h2 + d2 + v2+d3+d4);
    }

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        ar = new int[m][n];
        for(int i =0; i<m; i++){
            for(int j = 0; j<n; j++){
                ar[i][j] = sc.nextInt();
            }
        }
        int maxArea =0;
        int area = 0;
        for(int i =0; i<m; i++){
            for(int j =0; j<n; j++){
                if(ar[i][j] == 1)
                   area = 1 + findArea(ar, i, j);
                if(area > maxArea)
                    maxArea = area;
            }
        }
        System.out.println(maxArea);
    }
}
