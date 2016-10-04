package com.Graph;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

/**
 * Created by user on 25.02.2016.
 */
public class Graph {

    private final int MAX_VERTS = 20;
    private Vertex vertexList[]; // Массив вершин
    private int adjMat[][]; // Матрица смежности
    private int nVerts; // Текущее количество вершин
    // -------------------------------------------------------------
    public Graph() // Конструктор
    {
        vertexList = new Vertex[MAX_VERTS];
        // Матрица смежности
        adjMat = new int[MAX_VERTS][MAX_VERTS];
        nVerts = 0;
        for(int j=0; j<MAX_VERTS; j++) // Матрица смежности
            for(int k=0; k<MAX_VERTS; k++) // заполняется нулями
                adjMat[j][k] = 0;
    }
    // -------------------------------------------------------------
    public void addVertex(char lab) // В аргументе передается метка
    {
        vertexList[nVerts++] = new Vertex(lab);
    }
    // -------------------------------------------------------------
    public void addEdge(int start, int end)
    {
        adjMat[start][end] = 1;
        adjMat[end][start] = 1;
    }
    // -------------------------------------------------------------
    public void displayVertex(int v)
    {
        System.out.print(vertexList[v].label);
    }

    // Метод возвращает непосещенную вершину, смежную по отношению к v
    public int getAdjUnvisitedVertex(int v)
    {
        for(int j=0; j<nVerts; j++)
            if(adjMat[v][j]==1 && vertexList[j].wasVisited==false)
                return j; // Возвращает первую найденную вершину
        return -1; // Таких вершин нет
    }

    public void dfs() // Обход в глубину
    { // Алгоритм начинает с вершины 0
        vertexList[0].wasVisited = true; // Пометка
        displayVertex(0); // Вывод
        Deque<Integer> theStack =new ArrayDeque<Integer>();
        theStack.push(0); // Занесение в стек
        while( !theStack.isEmpty() ) // Пока стек не опустеет
        {
            // Получение непосещенной вершины, смежной к текущей
            int v = getAdjUnvisitedVertex( theStack.peek() );
            if(v == -1) // Если такой вершины нет,
                theStack.pop(); // элемент извлекается из стека
            else // Если вершина найдена
            {
                vertexList[v].wasVisited = true; // Пометка
                displayVertex(v); // Вывод
                theStack.push(v); // Занесение в стек
            }
        }
        // Стек пуст, работа закончена
        for(int j=0; j<nVerts; j++) // Сброс флагов
            vertexList[j].wasVisited = false;
    }

    public void bfs() // Обход в ширину
    { // Алгоритм начинает с вершины 0
        vertexList[0].wasVisited = true; // Пометка
        displayVertex(0); // Вывод
        Queue<Integer> theQueue = new ArrayDeque<Integer>();
        theQueue.add(0); // Вставка в конец очереди
        int v2;
        while( !theQueue.isEmpty() ) // Пока очередь не опустеет
        {
            int v1 = theQueue.remove(); // Извлечение вершины в начале очереди
            // Пока остаются непосещенные соседи
            while( (v2=getAdjUnvisitedVertex(v1)) != -1 )
            { // Получение вершины
                vertexList[v2].wasVisited = true; // Пометка
                displayVertex(v2); // Вывод
                theQueue.add(v2); // Вставка
            }
        }
        // Очередь пуста, обход закончен
        for(int j=0; j<nVerts; j++) // Сброс флагов
            vertexList[j].wasVisited = false;
    }

    // -------------------------------------------------------------
    public void mst() // Построение минимального остовного дерева
    { //
        vertexList[0].wasVisited = true; // Пометка
        Deque<Integer> theStack =new ArrayDeque<Integer>();
        theStack.push(0); // Занесение в стек
        while( !theStack.isEmpty() ) // Пока стек не опустеет
        { // Извлечение элемента из стека
            int currentVertex = theStack.peek();
            // Получение следующего соседа
            int v = getAdjUnvisitedVertex(currentVertex);
            if(v == -1) // Если соседей больше нет,
                theStack.pop(); // извлечь элемент из стека
            else // Сосед существует
            {
                vertexList[v].wasVisited = true; // Пометка
                theStack.push(v); // Занесение в стек
                // Вывод ребра
                displayVertex(currentVertex); // От currentVertex
                displayVertex(v); // к v
                System.out.print(" ");
            }
        }
        // Стек пуст, работа закончена
        for(int j=0; j<nVerts; j++) // Сброс флагов
            vertexList[j].wasVisited = false;
    }



// -------------------------------------------------------------
}






