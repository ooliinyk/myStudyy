package com.Graph;

/**
 * Created by user on 25.02.2016.
 */
public class Vertex {
        public char label; // ����� (��������, �A�)
        public boolean wasVisited;

        public Vertex(char lab) // �����������
        {
            label = lab;
            wasVisited = false;
        }
} // ����� ������ Vertex
