package com.Graph;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

/**
 * Created by user on 25.02.2016.
 */
public class Graph {

    private final int MAX_VERTS = 20;
    private Vertex vertexList[]; // ������ ������
    private int adjMat[][]; // ������� ���������
    private int nVerts; // ������� ���������� ������
    // -------------------------------------------------------------
    public Graph() // �����������
    {
        vertexList = new Vertex[MAX_VERTS];
        // ������� ���������
        adjMat = new int[MAX_VERTS][MAX_VERTS];
        nVerts = 0;
        for(int j=0; j<MAX_VERTS; j++) // ������� ���������
            for(int k=0; k<MAX_VERTS; k++) // ����������� ������
                adjMat[j][k] = 0;
    }
    // -------------------------------------------------------------
    public void addVertex(char lab) // � ��������� ���������� �����
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

    // ����� ���������� ������������ �������, ������� �� ��������� � v
    public int getAdjUnvisitedVertex(int v)
    {
        for(int j=0; j<nVerts; j++)
            if(adjMat[v][j]==1 && vertexList[j].wasVisited==false)
                return j; // ���������� ������ ��������� �������
        return -1; // ����� ������ ���
    }

    public void dfs() // ����� � �������
    { // �������� �������� � ������� 0
        vertexList[0].wasVisited = true; // �������
        displayVertex(0); // �����
        Deque<Integer> theStack =new ArrayDeque<Integer>();
        theStack.push(0); // ��������� � ����
        while( !theStack.isEmpty() ) // ���� ���� �� ��������
        {
            // ��������� ������������ �������, ������� � �������
            int v = getAdjUnvisitedVertex( theStack.peek() );
            if(v == -1) // ���� ����� ������� ���,
                theStack.pop(); // ������� ����������� �� �����
            else // ���� ������� �������
            {
                vertexList[v].wasVisited = true; // �������
                displayVertex(v); // �����
                theStack.push(v); // ��������� � ����
            }
        }
        // ���� ����, ������ ���������
        for(int j=0; j<nVerts; j++) // ����� ������
            vertexList[j].wasVisited = false;
    }

    public void bfs() // ����� � ������
    { // �������� �������� � ������� 0
        vertexList[0].wasVisited = true; // �������
        displayVertex(0); // �����
        Queue<Integer> theQueue = new ArrayDeque<Integer>();
        theQueue.add(0); // ������� � ����� �������
        int v2;
        while( !theQueue.isEmpty() ) // ���� ������� �� ��������
        {
            int v1 = theQueue.remove(); // ���������� ������� � ������ �������
            // ���� �������� ������������ ������
            while( (v2=getAdjUnvisitedVertex(v1)) != -1 )
            { // ��������� �������
                vertexList[v2].wasVisited = true; // �������
                displayVertex(v2); // �����
                theQueue.add(v2); // �������
            }
        }
        // ������� �����, ����� ��������
        for(int j=0; j<nVerts; j++) // ����� ������
            vertexList[j].wasVisited = false;
    }

    // -------------------------------------------------------------
    public void mst() // ���������� ������������ ��������� ������
    { //
        vertexList[0].wasVisited = true; // �������
        Deque<Integer> theStack =new ArrayDeque<Integer>();
        theStack.push(0); // ��������� � ����
        while( !theStack.isEmpty() ) // ���� ���� �� ��������
        { // ���������� �������� �� �����
            int currentVertex = theStack.peek();
            // ��������� ���������� ������
            int v = getAdjUnvisitedVertex(currentVertex);
            if(v == -1) // ���� ������� ������ ���,
                theStack.pop(); // ������� ������� �� �����
            else // ����� ����������
            {
                vertexList[v].wasVisited = true; // �������
                theStack.push(v); // ��������� � ����
                // ����� �����
                displayVertex(currentVertex); // �� currentVertex
                displayVertex(v); // � v
                System.out.print(" ");
            }
        }
        // ���� ����, ������ ���������
        for(int j=0; j<nVerts; j++) // ����� ������
            vertexList[j].wasVisited = false;
    }



// -------------------------------------------------------------
}






