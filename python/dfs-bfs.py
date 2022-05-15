# Depth First Search
n = "number of nodes in the graph"
g = "adjaceny list representing graph"
visited = []

def dfs(at):
    if visited[at] == True:
        return
    
    visited[at] = True

    neighbours = graph[at]
    for next in neighbours:
        dfs(next)

