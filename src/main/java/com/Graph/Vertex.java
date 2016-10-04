package com.Graph;

/**
 * Created by user on 25.02.2016.
 */
public class Vertex {
        public char label; // Метка (например, ‘A’)
        public boolean wasVisited;

        public Vertex(char lab) // Конструктор
        {
            label = lab;
            wasVisited = false;
        }
} // Конец класса Vertex
