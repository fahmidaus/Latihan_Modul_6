package com.mycompany.modul6;
import java.util.*;

public class Modul6 {
    private LinkedList<Integer> adj[];
    private boolean visited[];
    
    Modul6(int v){
        adj = new LinkedList[v];
        visited = new boolean[v];
        
        for (int i=0; i<v; i++)
            adj[i] = new LinkedList<Integer>();
    }
    
    void insertEdge(int src, int dest){
        adj[src].add(dest);
    }
    
    void DFS(int vertex){
    visited[vertex] = true;
    System.out.println(vertex+"");

Iterator<Integer> it = adj[vertex].listIterator();
while (it.hasNext()){
    int n = it.next();
    if (!visited[n])
        DFS(n);
}
    }
           

    public static void main(String[] args) {
    Modul6 graph = new Modul6(8);
    graph.insertEdge(0, 1);
    graph.insertEdge(0, 3);
    graph.insertEdge(0, 4);
    graph.insertEdge(4, 5);
    graph.insertEdge(3, 5);
    graph.insertEdge(1, 2);
    graph.insertEdge(1, 0);
    graph.insertEdge(2, 1);
    graph.insertEdge(4, 1);
    graph.insertEdge(3, 1);
    graph.insertEdge(5, 4);
    graph.insertEdge(5, 3);
    
    System.out.println("Depth First Traversal for the  graph is:");
    graph.DFS(0);
    
        
    }
}
