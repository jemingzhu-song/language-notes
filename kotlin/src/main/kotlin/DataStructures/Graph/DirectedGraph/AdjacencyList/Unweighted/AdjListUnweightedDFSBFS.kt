package DataStructures.Graph.DirectedGraph.AdjacencyList.Unweighted

// https://www.softwaretestinghelp.com/java-graph-tutorial/

// Graph Declared in AdjacencyListUnweightedGraph.kt

fun Graph.bfs(src: Int, value: Int): Boolean {
    var visited = Array<Boolean>(verticesCount){false}
    var queue = ArrayList<Int>()

    visited[src] = true
    queue.add(src)

    while(queue.size != 0) {
        // Dequeue vertex from queue
        var dequeued = queue.removeFirst()
        print("$dequeued -> ")

        // Get adjacent vertices of dequeued vertex
        for (adjacent in adjacency_list[dequeued]) {
            // If adjacent vertex hasn't been visited, enqueue it
            if (!visited[adjacent]) {
                // If found
                if (adjacent == value) {
                    println("4 (found)")
                    return true
                }
                visited[adjacent] = true
                queue.add(adjacent)
            }
        }
    }

    return false
}

fun main() {
    var g = Graph(6)
    g.addEdge(0, 2)
    g.addEdge(0, 5)
    g.addEdge(2, 5)
    g.addEdge(3, 4)
    g.addEdge(1, 2)
    g.addEdge(2, 1)
    g.addEdge(2, 3)
    g.addEdge(4, 5)

    g.printGraph()

    g.bfs(0, 4) // 0 -> 2 -> 5 -> 1 -> 3 -> 4
}