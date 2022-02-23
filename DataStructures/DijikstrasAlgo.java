package java_progs.DataStructures;

import java.util.*;

class GraphDijikstra {
    int V, E;
    List<Integer> dist;
    ArrayList<ArrayList<Integer>> graph;

    GraphDijikstra(int v, int e) {
        this.V = v;
        this.E = e;
        this.dist = new ArrayList<Integer>(Collections.nCopies(V, Integer.MAX_VALUE));
        this.graph = new ArrayList<ArrayList<Integer>>(V);
    }

    public void addEdge(int u, int v, int wt) {
        System.out.println(graph);
        // graph.get(u).addAll(new ArrayList<>(Arrays.asList(v, wt)));
        // graph.get(v).addAll(new ArrayList<>(Arrays.asList(u, wt)));
    }

    void display() {
        System.out.println(graph);
    }
}

public class DijikstrasAlgo {
    public static void main(String[] args) throws Exception {
        GraphDijikstra g = new GraphDijikstra(9, 14);

        g.addEdge(0, 1, 4);
        // g.addEdge(0, 7, 8);
        // g.addEdge(1, 2, 8);
        // g.addEdge(1, 7, 11);
        // g.addEdge(2, 3, 7);
        // g.addEdge(2, 8, 2);
        // g.addEdge(2, 5, 4);
        // g.addEdge(3, 4, 9);
        // g.addEdge(3, 5, 14);
        // g.addEdge(4, 5, 10);
        // g.addEdge(5, 6, 2);
        // g.addEdge(6, 7, 1);
        // g.addEdge(6, 8, 6);
        // g.addEdge(7, 8, 7);

        g.display();
    }
}
