package DataStructures.Graph.DirectedGraph.AdjacencyList.Unweighted

// https://www.geeksforgeeks.org/breadth-first-search-or-bfs-for-a-graph/

class Graph() {
    var verticesCount: Int = 0
    var adjacency_list: ArrayList<ArrayList<Int>> = arrayListOf()

    constructor(verticesCount: Int) : this() {
        this.verticesCount = verticesCount
        for (i in 0..verticesCount-1) {
            adjacency_list.add(arrayListOf())
        }
    }

    fun addEdge(v1: Int, v2: Int) {
        adjacency_list[v1].add(v2)
    }

    fun removeEdge(v1: Int, v2: Int) {
        adjacency_list[v1].remove(v2)
    }

    fun printGraph() {
        for (v in 0..verticesCount-1) {
            print("Vertex $v ->")
            for (v1 in adjacency_list[v]) {
                print(" $v1 ")
            }
            print("\n")
        }
        print("\n")
    }
}

fun main() {
    var g = Graph(5)
    g.addEdge(0, 2)
    g.addEdge(0, 5)
    g.addEdge(2, 5)
    g.addEdge(3, 4)
    g.addEdge(1, 2)
    g.addEdge(2, 1)
    g.addEdge(2, 3)

    g.printGraph()

    println("------------")

    g.removeEdge(1, 2)
    g.removeEdge(4, 5) // doesn't exist

    g.printGraph()
}
