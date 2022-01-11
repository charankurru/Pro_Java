package java_progs.DataStructures;

import java.util.*;

public class GraphDs {

    public static void dfs(ArrayList<ArrayList<Integer>> adj, int node, ArrayList<Boolean> vis,
            List<Integer> res) {
        if (!vis.get(node)) {
            vis.set(node, true);
            res.add(node);
            System.out.print(node + "==>");
            for (int nbr : adj.get(node)) {
                if (!vis.get(nbr))
                    dfs(adj, nbr, vis, res);
            }
        }
    }

    public static void Display(ArrayList<ArrayList<Integer>> adj) {
        for (int i = 0; i < adj.size(); i++) {
            System.out.println(adj.get(i));
        }
    }

    public static void addEdge(ArrayList<ArrayList<Integer>> adj, int src, int dest) {
        adj.get(src).add(dest);
        adj.get(dest).add(src);
    }

    public static void main(String args[]) throws Exception {
        int V = 5;
        ArrayList<ArrayList<Integer>> lst = new ArrayList<>(V);
        for (int i = 0; i < V; i++)
            lst.add(new ArrayList<Integer>());
        ArrayList<Boolean> vis = new ArrayList<>(Collections.nCopies(V, false));
        System.out.println("Initial Visit array " + vis);

        addEdge(lst, 0, 1);
        addEdge(lst, 1, 2);
        addEdge(lst, 2, 3);
        addEdge(lst, 3, 4);
        addEdge(lst, 4, 1);
        System.out.println("Adjacency lst");
        Display(lst);

        System.out.println();
        List<Integer> res = new ArrayList<Integer>();
        dfs(lst, 0, vis, res);
        System.out.println(res);

    }
}
