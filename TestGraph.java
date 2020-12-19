


import java.util.Scanner;

public class TestGraph
{
public static void main (String[] args) {
  
int [][] g = {
{0,7,9,0,0,14},{7,0,10,15,0,0},{9,10,0,11,0,2},
{0,15,11,0,6,0},{0,0,0,6,0,9},{14,0,2,0,9,0}
};

MyGraph graph = new MyGraph(g);
System.out.println("Total Nodes In Graph: " + graph.numNodes());
System.out.println("Total Edges In Graph: " + graph.numEdge());
System.out.println("Is Graph Empty? " + graph.isEmpty());
System.out.println("Are nodes 1 , 2 there In Graph? " +"\n"+
graph.isIn(1)+" , "+graph.isIn(2)+"\n");
System.out.println("Enter two nodes ");
int index_A, index_B;
Scanner sc = new Scanner(System.in);
index_A = sc.nextInt(); index_B = sc.nextInt();
System.out.println("Is There an Edge Between " + index_A + " & " + index_B + "? " + graph.isEdge(index_A, index_B));
System.out.println("Weight of Edge Between " + index_A + " & " + index_B + ": " + graph.weight(index_A, index_B) + "\n");
System.out.println("Enter a Node to Check It's Adjacent Nodes");
index_A = sc.nextInt();
System.out.print("Nodes Adjacent to Node " + index_A + " are : ");
for(int j:graph.find_Adj(index_A))
System.out.print(j + " ");
}
}