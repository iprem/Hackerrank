import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
 

public class BreadthFirstShortestPath {
	
private LinkedList<Integer> adj[];
private Map<Integer,Boolean> nodes = new HashMap<Integer,Boolean>();
private Map<Integer,Integer> layer = new HashMap<Integer, Integer>();
private static Scanner sc;
    
    void graph(int n){
        adj = (LinkedList<Integer>[])new LinkedList<?>[n+1];
        for(int i =0; i<= n; i++)
            adj[i] = new LinkedList<Integer>();
    }
    
    void addEdge(int a, int b){
    	if(!adj[a].contains(b))
    		adj[a].add(b);
    	if(!adj[b].contains(a))
    		adj[b].add(a);
    }
    
    void findShortestDistance(int root, int n){
        layer.put(root, 0);
        Queue<Integer> queue = new LinkedList<Integer>();
        nodes.put(root, true);
        queue.add(root);
        int j = 0;
        while(!queue.isEmpty()){
        	for(int i =0; i<adj[queue.peek()].size(); i++){
        		int node = adj[queue.peek()].get(i);
        		if(nodes.get(node) == false){
        			queue.add(node);
        			nodes.put(node, true);
        			j = layer.get(queue.peek());
        			layer.put(node, j+6);
        		}
        	}
        	queue.poll();
        }   
    }
    
    void printShortestDistance(int root, int n){        
        for(int i = 1; i<=n; i++){
        	if( i == root)
        		continue;
        	if(layer.containsKey(i))
        		System.out.print(layer.get(i)+ " ");
        	else
        		System.out.print(-1 + " ");
        }
    }
    

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        int t = sc.nextInt();     //Number of test cases
        for(int i =0; i<t; i++){
            int n = sc.nextInt();
            int edges = sc.nextInt();
            BreadthFirstShortestPath spd = new BreadthFirstShortestPath();
            spd.graph(n);
            for(int j = 0; j< edges; j++){
                int n1 = sc.nextInt();
                int n2 = sc.nextInt();
                spd.addEdge(n1,n2);
                if (spd.nodes.containsKey(n1) == false){
                	spd.nodes.put(n1, false);
                	spd.layer.put(n1, -1);
                }
                if (spd.nodes.containsKey(n2) == false){
                	spd.nodes.put(n2, false);
                	spd.layer.put(n1, -1);
                }
            }            	
            int start = sc.nextInt();
            spd.findShortestDistance(start, n);
            spd.printShortestDistance(start, n);
        }
    }

}
