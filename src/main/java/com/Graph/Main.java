package com.Graph;

/**
 * Created by user on 25.02.2016.
 */
public class Main {

    public static void main(String[] args) {

        Graph theGraph = new Graph();

        Graph graph1= new Graph();
        Graph graph2;


        theGraph.addVertex('A'); // 0 (исходная вершина)
        theGraph.addVertex('B'); // 1
        theGraph.addVertex('C'); // 2
        theGraph.addVertex('D'); // 3
        theGraph.addVertex('E'); // 4
        theGraph.addEdge(0, 1); // AB
        theGraph.addEdge(1, 2); // BC
        theGraph.addEdge(0, 3); // AD
        theGraph.addEdge(3, 4); // DE
        System.out.print("Visit dfss: ");
        theGraph.dfs(); // Обход в глубину
        System.out.println();
        System.out.print("Visits bfs: ");
        theGraph.bfs(); // Обход в глубину
    }
}