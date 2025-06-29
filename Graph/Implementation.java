package Graph;

import java.util.ArrayList;
import java.util.List;

public class Implementation {
    class Pair{
        int node;
        int weight;
        Pair(int n,int w){
            node=n;
            weight=w;
        }
//    (node,weight)
        @Override
        public String toString() {
            return "(" +node + ","+weight+")";
        }
    }
    int adjMatrix[][];
    List<List<Integer>>adjList;
    List<List<Pair>> adjListWithWeight;
    Implementation(int nodes){
          adjMatrix=new int[nodes][nodes];
          adjList =new ArrayList<>();
          adjListWithWeight=new ArrayList<>();
          for(int i=0;i<nodes;i++){
              adjList.add(new ArrayList<>());
              adjListWithWeight.add(new ArrayList<>());
          }

    }
//       ->[[0,2],[0,1],[2,0]]
    public void findDegreeInUndire(int edges[][],int nodes){
        int degree[]=new int[nodes];
   for(int edge[]:edges){
       int u=edge[0];
       int v=edge[1];
        degree[u]++;
        degree[v]++;
   }
//      print
        for(int i=0;i<degree.length;i++){
            System.out.println("node ->" + i + "degree->"+degree[i]);
        }
    }
    public void findDegreeIndire(int edges[][],int nodes){
        int indegree[]=new int[nodes];
        int outdegree[]=new int[nodes];
        for(int edge[]:edges){
            int u=edge[0];
            int v=edge[1];
            indegree[u]++;
            outdegree[v]++;
        }
//      print
        for(int i=0;i<nodes;i++){
            System.out.println("node ->" + i + "in-degree->"+indegree[i]);
            System.out.println("node ->" + i + "out-degree->"+outdegree[i]);
        }

    }
      public void addEdgesInMatrix(int edges[][],boolean isDirected) {
          for (int edge[] : edges) {
              int u = edge[0];
              int v = edge[1];
//         directed
              if (isDirected)
                  adjMatrix[u][v] = 1;

              else {
//   undirected
                  adjMatrix[u][v] = 1;
                  adjMatrix[v][u] = 1;
              }
          }
      }
    public void addEdgesWithWeightInMatrix(int edges[][],boolean isDirected){
        for (int edge[] : edges) {
            int u = edge[0];
            int v = edge[1];
            int w=edge[2];
//         directed
            if (isDirected)
                adjMatrix[u][v] = w;

            else {
//   undirected
                adjMatrix[u][v] = w;
                adjMatrix[v][u] = w;
            }
        }
    }
    public void addEdgesInList(int edges[][],boolean isDirected) {
        for (int edge[] : edges) {
            int u = edge[0];
            int v = edge[1];
//         directed
            if (isDirected)
                adjList.get(u).add(v);

            else {
//   undirected
                adjList.get(u).add(v);
                adjList.get(v).add(u);
            }
        }
    }
    public void addEdgesWithWeightInList(int edges[][],boolean isDirected) {
        for (int edge[] : edges) {
            int u = edge[0];
            int v = edge[1];
            int w=edge[2];
//         directed
            if (isDirected){
                Pair p=new Pair(v,w);
                adjListWithWeight.get(u).add(p);
            }


            else {
//   undirected
                Pair p1=new Pair(v,w);
                Pair p2=new Pair(u,w);
                adjListWithWeight.get(u).add(p1);
                adjListWithWeight.get(v).add(p2);
            }
        }
    }

      public void printMatrix(){
        for(int i=0;i< adjMatrix.length;i++){
            System.out.print("row"+i+ "->");
            for(int j=0;j< adjMatrix[i].length;j++){
                System.out.print(adjMatrix[i][j]+ " ");
            }
            System.out.println();
        }
      }
    public void printList(){
        for(int i=0;i< adjList.size();i++){
            System.out.print(i+"->");
            System.out.print("[");
            for(int j=0;j< adjList.get(i).size();j++){
                System.out.print(adjList.get(i).get(j)+",");
            }
            System.out.print("]");
            System.out.println();

        }
    }
    public void printWeightedList(){
        for(int i=0;i< adjListWithWeight.size();i++){
            System.out.print(i+"->");
            System.out.print("[");
            for(int j=0;j< adjListWithWeight.get(i).size();j++){
                System.out.print(adjListWithWeight.get(i).get(j)+",");
            }
            System.out.print("]");
            System.out.println();

        }
    }
    public static void main(String[] args) {
//  int edges[][]={{0,2},{0,1},{1,3}};
//  int nodes=4;
//        Implementation g=new Implementation(nodes);
//        g.addEdgesInMatrix(edges,false);
//        g.printMatrix();
//        int edges[][]={{0,2,10},{0,1,20},{1,3,30}};
//        int nodes=4;
//        Implementation g=new Implementation(nodes);
//        g.addEdgesWithWeightInMatrix(edges,false);
//        g.printMatrix();
  int edges[][]={{0,2},{0,1},{1,3}};
  int nodes=4;
        Implementation g=new Implementation(nodes);
        g.addEdgesInList(edges,false);
        g.printList();
//        int edges[][]={{0,2,10},{0,1,20},{1,3,30}};
//        int nodes=4;
//        Implementation g=new Implementation(nodes);
////        g.addEdgesWithWeightInList(edges,false);
////        g.printWeightedList();
////        g.findDegreeInUndire(edges,nodes);
//        g.findDegreeIndire(edges,nodes);
    }
}
