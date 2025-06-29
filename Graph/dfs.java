package Graph;

import java.util.ArrayList;
import java.util.List;

public class dfs {
     List<List<Integer>> adjList;
     dfs(int nodes){
         adjList=new ArrayList<>();
         for(int i=0;i<nodes;i++){
             adjList.add(new ArrayList<>());
         }
     }
    public  void addEdgeInList(int edges[][],boolean isDir){

        for(int edge[]:edges){
            int u=edge[0];
            int v=edge[1];
            if(isDir){
                adjList.get(u).add(v);
            }
             else{
                 adjList.get(u).add(v);
                adjList.get(v).add(u);
            }
        }
    }
    public void printList() {
        for (int i = 0; i < adjList.size(); i++) {
            System.out.print(i + "->");
            System.out.print("[");
            for (int j = 0; j < adjList.get(i).size(); j++) {
                System.out.print(adjList.get(i).get(j) + ",");
            }
            System.out.print("]");
            System.out.println();

        }

    }

    public static void main(String[] args) {
        int edges[][]={{0,2},{0,3},{0,1},{2,4}};
        int n= 5;
        dfs d1=new dfs(n);
        d1.addEdgeInList(edges,false);
        d1.printList();
    }
}
