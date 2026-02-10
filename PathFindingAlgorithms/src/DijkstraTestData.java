import java.util.*;

class Edge {
    int to;
    int weight;

    public Edge(int to, int weight) {
        this.to = to;
        this.weight = weight;
    }
}

public class DijkstraTestData {
    public static void main(String[] args) {
        // Aantal knopen
        int n = 6;

        // Adjacency list
        List<Edge>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        // Verbindingen toevoegen (voorbeeld: node 0 naar node 1 met gewicht 7)
        graph[0].add(new Edge(1, 7));
        graph[0].add(new Edge(2, 9));
        graph[0].add(new Edge(5, 14));

        graph[1].add(new Edge(0, 7));
        graph[1].add(new Edge(2, 10));
        graph[1].add(new Edge(3, 15));

        graph[2].add(new Edge(0, 9));
        graph[2].add(new Edge(1, 10));
        graph[2].add(new Edge(3, 11));
        graph[2].add(new Edge(5, 2));

        graph[3].add(new Edge(1, 15));
        graph[3].add(new Edge(2, 11));
        graph[3].add(new Edge(4, 6));

        graph[4].add(new Edge(3, 6));
        graph[4].add(new Edge(5, 9));

        graph[5].add(new Edge(0, 14));
        graph[5].add(new Edge(2, 2));
        graph[5].add(new Edge(4, 9));

        // Print de dataset voor controle
        for (int i = 0; i < n; i++) {
            System.out.print("Node " + i + " -> ");
            for (Edge e : graph[i]) {
                System.out.print("(" + e.to + ", " + e.weight + ") ");
            }
            System.out.println();
        }

        int start = 0;
        int[] dist = new int[n];
        boolean[] visited = new boolean[n];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[start] = 0;

        for (int i = 0 ; i < n;i++){
            int unvisited = -1;
            for (int j = 0; j < n; j++){
                if (!visited[j] && (unvisited == -1 || dist[j] < dist[unvisited])){
                    unvisited = j;
                }
            }

            if (dist[unvisited] == Integer.MAX_VALUE) break;
            visited[unvisited] = true;

            for (Edge e : graph[unvisited]){
                if (dist[unvisited] + e.weight < dist[e.to]){
                    dist[e.to] = dist[unvisited] + e.weight;
                }
            }
        }

        for (int i = 0; i < dist.length; i++) {
            System.out.print(i + " ");
        }

    }
}
