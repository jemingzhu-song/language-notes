package DataStructures.Graph

/**
 * Graphs: https://www.geeksforgeeks.org/graph-data-structure-and-algorithms/
 *
 * Introduction to Graphs: https://www.geeksforgeeks.org/introduction-to-graphs-data-structure-and-algorithm-tutorials/
 *
 * Types of Graphs:
 *  1. Null Graph - no edges in the graph
 *  2. Trivial Graph - only a single vertex
 *  3. Undirected Graph - edges have no direction
 *  4. Directed Graph - edges have directions: nodes are ordered pairs in the definition of every edge
 *  5. Connected Graph - graph where one node can visit any other node
 *  6. Disconnected Graph - at least one node is not reachable from another node
 *  7. Regular Graph - degree of every vertex is equal to K, the graph is known as "K Regular Graph"
 *  8. Complete Graph - every node has an every other node
 *  9. Cyclic Graph - graph contains at least one cycle
 *  10. Directed Acyclic Graph - directed graph with no cycle in it
 *  11. Bipartite Graph - graph where each vertex can be divided into two sets such that each vertex
 *                        in the set does not contain any edge between them
 *
 * Representations of Graphs:
 * There are two ways of storing graphs:
 *  1. Adjacency Matrix
 *      - stored in the form of a 2D matrix, where rows and columns represent vertices
 *      - each entry in the matrix represents the weight of the edge between the two vertices
 *  2. Adjacency List
 *      - stored as an array/collection of linked lists: the size of the array/collection
 *        is equal to the number of vertices in the graph
 *      - list at a specific index of the array represents the adjacent vertices of the vertex
 *        represented by that array index
 *
 *  Adjacency Matrix is faster to implement (add & remove edge) and faster to query, but less space
 *  efficient.
 *
 *  Adjacency List is slower to implement (add & remove edge) and slower to query, but more space efficient
 */

