package AdjList;
import java.util.ArrayList;
import java.util.Stack;

public class AdjList {
    private ArrayList<Integer> adjList[];
    private int V;

    public AdjList(int V) {
        this.V = V;
        adjList = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            adjList[i] = new ArrayList<Integer>();
        }
    }

    public void addEdge(int i, int j) {
        adjList[i].add(j);
        adjList[j].add(i);
    }

    public void BFS(int s) {
        boolean[] visited = new boolean[V];
        ArrayList<Integer> q = new ArrayList<Integer>();
        q.add(s);
        visited[s] = true;
        while (!q.isEmpty()) {
            int current = q.remove(0);
            System.out.print(current + " ");
            for (int i = 0; i < adjList[current].size(); i++) {
                int neighbour = adjList[current].get(i);
                if (!visited[neighbour]) {
                    q.add(neighbour);
                    visited[neighbour] = true;
                }
            }
        }
    }

    public void DFS(int start) {
        boolean[] visited = new boolean[V];
        Stack<Integer> st = new Stack<Integer>();
        st.add(start);
        visited[start] = true;
        while (!st.isEmpty()) {
            int current = st.remove(0);
            System.out.print(current + " ");
            for (int i = 0; i < adjList[current].size(); i++) {
                int neighbour = adjList[current].get(i);
                if (!visited[neighbour]) {
                    st.add(neighbour);
                    visited[neighbour] = true;
                }
            }
        }
    }


    public static void main(String[] args) {
        AdjList g = new AdjList(5);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 3);
        g.addEdge(3, 4);
        g.BFS(0);
        System.out.println();
        g.DFS(0);
    }
}
