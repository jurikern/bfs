package com.backupapi.bfs;

public class Application {
  public static void main (String[] args) {
    Vertex v1 = new Vertex("/", "sha256:");
    Vertex v2 = new Vertex("/var", "sha256:");
    Vertex v3 = new Vertex("/var/app", "sha256:");
    Vertex v4 = new Vertex("/home", "sha256:");

    v1.getNeighbourList().add(v2);
    v2.getNeighbourList().add(v4);
    v2.getNeighbourList().add(v3);

    FileGraph fileGraph = new FileGraph();
    fileGraph.traverse(v1);
  }
}
