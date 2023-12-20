package Graphs;

import java.util.ArrayList;

class Edge{
    int src;
    int des;
    Edge(int src,int des){
        this.src=src;
        this.des=des;
    }
}
public class DetectCycle {
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }

        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        

        graph[2].add(new Edge(2, 3));
     

        graph[3].add(new Edge(3, 0));
     
    }
    public static boolean findCycle(ArrayList<Edge> graph[],int curr,boolean vis[],boolean resStack[]){
        vis[curr]=true;
        resStack[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(resStack[e.des]==true){
                return true;
            }
            if(!vis[e.des]){
                if(findCycle(graph, e.des, vis, resStack)){
                    return true;
                }
            }
        }
        resStack[curr]=false;
        return false;
    }

    
    public static void main(String[] args) {
        int V=4;
        ArrayList<Edge> graph[]=new ArrayList[V];
        createGraph(graph);

        boolean res=findCycle(graph, 0,new boolean[V],new boolean[V]);
        System.out.println(res);
      
        
    }
}
