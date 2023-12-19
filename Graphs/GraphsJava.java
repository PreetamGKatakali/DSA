package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
/**
 * this is of creating the graph and printing their neighbores 
 * and even the BFS 
 */
class Edge{
    int src;
    int des;
    Edge(int src,int des){
        this.src=src;
        this.des=des;
    }
}
public class GraphsJava {
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));


        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));

        graph[6].add(new Edge(6, 5));
    }

    public static void BFS(ArrayList<Edge> graph[],int V){
        Queue<Integer> q=new LinkedList<>();
        boolean vis[]=new boolean[V];
        q.add(0);
        while(!q.isEmpty()){
            int curr=q.remove();
            if(vis[curr]==false){
                System.out.print(curr+" ");
                vis[curr]=true;
                for(int i=0;i<graph[curr].size();i++){
                    Edge e=graph[curr].get(i);
                    q.add(e.des);
                }
            }
        }
    }
    public static void DFS(ArrayList<Edge> graph[],int curr,boolean[] vis){
        System.out.print(curr+" ");
        vis[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(vis[e.des]==false){
                DFS(graph, e.des, vis);
            } 
        }
    } 

    public static void allPaths(ArrayList<Edge> graphs[],boolean vis[],int curr,String path,int target){
        if(curr==target){
            System.out.println(path);
            return ;
        }
        for(int i=0;i<graphs[curr].size();i++){
            Edge e=graphs[curr].get(i);
            if(!vis[e.des]){
                vis[curr]=true;
                allPaths(graphs, vis,e.des, path+e.des, target);
                vis[curr]=false;
            }
        }
    }
    public static void main(String[] args) {
        int V=7;
        ArrayList<Edge> graph[]=new ArrayList[V];
        createGraph(graph);

        // BFS(graph, V);

        boolean[] vis=new boolean[V];
        // DFS(graph, 0, vis);

        int start=0,target=5;
        allPaths(graph, vis, start, "0", target);


        //printing the neighbours 
        // for(int i=0;i<graph[2].size();i++){
        //     Edge e=graph[2].get(i);
        //     System.out.println(e.des+","+e.weight);
        // }
    }
}
