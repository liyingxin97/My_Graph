

public class MyGraph {
    private int graph[][];

    public MyGraph() {
        graph = new int [0][0];
    }
  
    public MyGraph(int[][] g) {
        this.graph = g;
    }
  
    public int numNodes() {
        return graph.length;
    }
  
    public int numEdge() {
        int numEdge = 0;
        for(int i = 0; i < graph.length; i++) {
            for(int j = i; j < graph[i].length; j++) {
                if(graph[i][j] != 0) {
                    numEdge++;
                }
            }
        }
        return numEdge;
    }
  
    public boolean IsEdge(int index_A, int index_B) {
        if(graph.length == 0) {
            return false;
        }
        return graph[index_A-1][index_B-1] != 0;
    }
  
    public int weight(int index_A, int index_B) {
        if (this.IsEdge(index_A, index_B)) {
            return graph[index_A-1][index_B-1];
        }
        return 0;
    }
  
    public boolean isEmpty() {
        if (graph.length == 0) {
            return true;
        }
        else {
            return false;
        }
    }
  
    public boolean isIn(int n) {
        return n <= graph.length+1;
    }
  
    public int[] find_Adj(int n) {
        if(!this.isIn(n)) {
            return new int[0];
        }
        int count_adj = 0;
        for (int j =0; j < graph[n-1].length; j++) {
            if (graph[n-1][j] != 0) {
                count_adj++;
            }
        }
        int adj[] = new int [count_adj];
        count_adj = 0;
        for (int j = 0; j < graph[n-1].length; j++) {
            if(graph[n-1][j] != 0) {
                adj[count_adj] = j+1;
                count_adj++;
            }
        }
        return adj;
    }

    String isEdge(int index_A, int index_B) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}