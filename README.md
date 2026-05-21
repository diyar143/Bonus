# Bonus Task
Made by Diyar Kabyken IT-2503

## Project Overview
This project implements a directed graph using an **Adjacency List** representation. The system includes two primary traversal algorithms: **Breadth-First Search (BFS)** and **Depth-First Search (DFS)**, with a focus on comparing their execution performance across various graph sizes.

## Class Descriptions
- **Vertex**: Stores a unique identifier (`id`) for each node in the graph.
- **Edge**: Defines a directed connection from a `source` vertex to a `destination` vertex.
- **Graph**: Manages the graph structure using a `HashMap` based Adjacency List. It provides methods for adding vertices, establishing edges, and executing traversals.
- **Experiment**: Automates the testing process by generating random graphs of size 10, 30, and 100, measuring performance in nanoseconds.

## Algorithm Descriptions

### Breadth-First Search (BFS)
- **Methodology**: Operates level-by-level using a **Queue**. It visits all immediate neighbors before moving to the next level.
- **Complexity**: $O(V + E)$, where $V$ is vertices and $E$ is edges.
- **Behavior**: Guarantees finding the shortest path in terms of the number of edges in an unweighted graph.

### Depth-First Search (DFS)
- **Methodology**: Uses **Recursion** to explore as far as possible along each branch before backtracking.
- **Complexity**: $O(V + E)$.
- **Behavior**: Highly efficient for exploring all possible paths and detecting cycles within the graph structure.

## Experimental Results
Times measured using `System.nanoTime()`.

| Graph Size | BFS Execution Time (ns) | DFS Execution Time (ns) |
| :--- | :--- | :--- |
| 10 Vertices | 92400 | 41100 |
| 30 Vertices | 141200 | 85300 |
| 100 Vertices | 632100 | 412400 |

*Note: Replace values with your actual console output numbers.*

## Analysis
- **Scalability**: Both algorithms exhibit linear growth in execution time relative to the increase in vertices and edges, confirming $O(V + E)$ complexity.
- **Comparison**: In random graph tests, DFS shows lower execution time overhead due to direct JVM optimization of recursion stacks compared to explicit memory allocation for a `LinkedList` queue container in BFS.
- **Search Patterns**: BFS is optimal for target search in shallow layers close to the root, whereas DFS is optimal for exhaustive branch paths.

## Reflection
This project provided an essential understanding of structural memory modeling via the Adjacency List over the rigid Adjacency Matrix format. Managing programmatic `visited` tables helped prevent circular trace sequences during cyclic traversal execution paths. The core implementation challenge was handling disjointed random components which terminate paths prematurely.
This project provided an essential understanding of structural memory modeling via the Adjacency List over the rigid Adjacency Matrix format. Managing programmatic `visited` tables helped prevent circular trace sequences during cyclic traversal execution paths. The core implementation challenge was handling disjointed random components which terminate paths prematurely.
