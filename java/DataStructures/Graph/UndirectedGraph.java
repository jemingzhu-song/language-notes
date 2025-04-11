package DataStructures.Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class UndirectedGraph {
    // https://www.geeksforgeeks.org/graph-and-its-representations/
}

class AdjacencyMatrixUndirectedGraph {
    /**
     * An adjacency matrix is a way of representing a graph as a matrix of boolean (0’s and 1’s)
     *
     * Let’s assume there are n vertices in the graph So, create a 2D matrix adjMat[n][n] having dimension n x n.
     *
     * If there is an edge from vertex i to j, mark adjMat[i][j] as 1.
     * If there is no edge from vertex i to j, mark adjMat[i][j] as 0.
     */

    public static void addEdge(int[][] matrix, int i, int j) {
        matrix[i][j] = 1;
        matrix[j][i] = 1;
    }

    public static void displayMatrix(int[][] mat) {
        for (int[] row : mat) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    /**
     * BFS on Graph - Adjacency Matrix
     */
    public static List<Integer> bfs(int[][] matrix, int source) {
        // Create list to store the traversal
        List<Integer> result = new ArrayList<>();

        // Create Queue
        Queue<Integer> queue = new LinkedList<>();

        // Initialise "Visited" Array
        boolean[] visited = new boolean[matrix.length];

        visited[source] = true;
        queue.add(source);

        while (!queue.isEmpty()) {
            // Dequeue vertex, and store it
            int curr = queue.poll();
            result.add(curr);

            // Find all adjacent vertices, and enqueue them
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[curr][i] == 1 && !visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // Create a graph with 4 vertices and no edges
        // Note that all values are initialized as 0
        int V = 6;
        int[][] mat = new int[V][V];

        // Now add edges one by one
        addEdge(mat, 0, 1);
        addEdge(mat, 0, 2);
        addEdge(mat, 1, 2);
        addEdge(mat, 2, 3);
        addEdge(mat, 3, 4);
        addEdge(mat, 2, 5);

        /* Alternatively we can also create using below
           code if we know all edges in advance

         int[][] mat = {{ 0, 1, 0, 0 },
                        { 1, 0, 1, 0 },
                        { 0, 1, 0, 1 },
                        { 0, 0, 1, 0 } }; */

        System.out.println("Adjacency Matrix Representation");
        displayMatrix(mat);

        System.out.println(bfs(mat, 3));
    }
}

class AdjacencyListUndirectedGraph {
    /**
     * An array of Lists is used to store edges between two vertices.
     * The size of array is equal to the number of vertices (i.e, n).
     * Each index in this array represents a specific vertex in the graph.
     * The entry at the index i of the array contains a linked list containing the vertices that are adjacent to vertex i.
     *
     * Let’s assume there are n vertices in the graph So, create an array of list of size n as adjList[n].
     * adjList[0] will have all the nodes which are connected (neighbour) to vertex 0.
     * adjList[1] will have all the nodes which are connected (neighbour) to vertex 1 and so on.
     */

    public static void addEdge(List<List<Integer>> adj, int i, int j) {
        adj.get(i).add(j);
        adj.get(j).add(i);
    }

    public static void displayAdjList(List<List<Integer>> adj) {
        for (int i = 0; i < adj.size(); i++) {
            System.out.print(i + ": "); // Print the vertex
            for (int j : adj.get(i)) {
                System.out.print(j + " "); // Print its adjacent
            }
            System.out.println();
        }
    }

    /**
     * BFS on Graph - Adjacency List
     */
    public static List<Integer> bfs(List<List<Integer>> adj, int source) {
        // Create list to store the traversal
        List<Integer> result = new ArrayList<>();

        // Create Queue
        Queue<Integer> queue = new LinkedList<>();

        // Initialise "Visited" Array
        boolean[] visited = new boolean[adj.size()];

        visited[source] = true;
        queue.add(source);

        while (!queue.isEmpty()) {
            // Dequeue vertex, and store it
            int curr = queue.poll();
            result.add(curr);

            // Find all adjacent vertices, and enqueue them
            for (int adjacent : adj.get(curr)) {
                if (!visited[adjacent]) {
                    queue.add(adjacent);
                    visited[adjacent] = true;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // Create a graph with 4 vertices and no edges
        int V = 6;
        List<List<Integer>> adj = new ArrayList<>(V);
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Now add edges one by one
        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 1, 2);
        addEdge(adj, 2, 3);
        addEdge(adj, 3, 4);
        addEdge(adj, 2, 5);

        System.out.println("Adjacency List Representation:");
        displayAdjList(adj);

        System.out.println(bfs(adj, 3));
    }
}
