package src;

import java.util.Random;

public class Experiment {

    public void runTraversals(Graph g, int startNode, boolean printOrder) {
        if (printOrder) {
            System.out.print("BFS Traversal: ");
            g.bfs(startNode);
            System.out.println();

            System.out.print("DFS Traversal: ");
            g.dfs(startNode);
            System.out.println();
        } else {
            g.bfs(startNode);
            g.dfs(startNode);
        }
    }

    public void runMultipleTests() {
        int[] sizes = {10, 30, 100};
        Random random = new Random();

        for (int size : sizes) {
            Graph g = new Graph();

            for (int i = 0; i < size; i++) {
                g.addVertex(new Vertex(i));
            }

            for (int i = 0; i < size * 2; i++) {
                g.addEdge(random.nextInt(size), random.nextInt(size));
            }

            System.out.println("=== Testing Graph Size: " + size + " ===");

            if (size == 10) {
                System.out.println("Graph Structure:");
                g.printGraph();
                runTraversals(g, 0, true);
            }

            long startBfs = System.nanoTime();
            g.bfs(0);
            long endBfs = System.nanoTime();

            long startDfs = System.nanoTime();
            g.dfs(0);
            long endDfs = System.nanoTime();

            System.out.println("BFS Execution Time: " + (endBfs - startBfs) + " ns");
            System.out.println("DFS Execution Time: " + (endDfs - startDfs) + " ns\n");
        }
    }
}