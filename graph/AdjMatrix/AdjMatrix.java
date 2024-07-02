import java.util.ArrayList;
class AdjMatrix {
    private int[][] adjMatrix;
    private int V;

    public AdjMatrix(int V) {
        this.V = V;
        adjMatrix = new int[V][V];
    }

    public void addEdge(int i, int j) {
        adjMatrix[i][j] = 1;
        adjMatrix[j][i] = 1;
    }

    public void BFS(int s) {
        boolean[] visited = new boolean[V];
        ArrayList<Integer> q = new ArrayList<Integer>();
        q.add(s);
        visited[s] = true;
        while (!q.isEmpty()) {
            int current = q.remove(0);
            System.out.print(current + " ");
            for (int i = 0; i < V; i++) {
                if (adjMatrix[current][i] == 1 && !visited[i]) {
                    q.add(i);
                    visited[i] = true;
                }
            }
        }
    }

    public void DFS(int start) {
        boolean[] visited = new boolean[V];
        ArrayList<Integer> st = new ArrayList<Integer>();
        st.add(start);
        visited[start] = true;
        while (!st.isEmpty()) {
            int current = st.remove(st.size() - 1);
            System.out.print(current + " ");
            for (int i = 0; i < V; i++) {
                if (adjMatrix[current][i] == 1 && !visited[i]) {
                    st.add(i);
                    visited[i] = true;
                }
            }
        }
    }

    public void Dijkstra(int start) {
        //arreglo de distancias.
        int[] dist = new int[V];
        boolean[] visited = new boolean[V];
        for (int i = 0; i < V; i++) {
            dist[i] = Integer.MAX_VALUE;
        }
        dist[start] = 0;
        for (int i = 0; i < V; i++) {
            int u = minDistance(dist, visited);
            visited[u] = true;
            for (int v = 0; v < V; v++) {
                if (!visited[v] && adjMatrix[u][v] != 0 && 
                dist[u] != Integer.MAX_VALUE && dist[u] + adjMatrix[u][v] < dist[v]) {
                    dist[v] = dist[u] + adjMatrix[u][v];
                }
            }
        }
        for (int i = 0; i < V; i++) {
            System.out.println(i + " " + dist[i]);
        }
    }

    // encontrar la distancia mínima
    // esto puede mejorado usando una cola de prioridad
    private int minDistance(int[] dist, boolean[] visited) {
        int min = Integer.MAX_VALUE;
        int minIndex = -1;
        for (int i = 0; i < V; i++) {
            //si no está visitado y la distancia es menor o igual a la mínima
            if (!visited[i] && dist[i] <= min) {
                min = dist[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
    public static void main(String[] args) {
        AdjMatrix g = new AdjMatrix(5);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(0, 3);
        g.addEdge(3, 4);
        g.BFS(0);
        System.out.println();
        g.Dijkstra(0);
    }
}
