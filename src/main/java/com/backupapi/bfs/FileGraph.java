package com.backupapi.bfs;

import java.util.Queue;
import java.util.LinkedList;

public class FileGraph {
  Queue<Vertex> queue;

  public FileGraph () {
    this.queue = new LinkedList<Vertex>();
  }

  public void traverse (Vertex rootVertex) {
    rootVertex.setVisited(true);
    this.queue.add(rootVertex);

    while (!queue.isEmpty()) {
      Vertex vertex = queue.remove();
      System.out.println(String.format("%s : %s", vertex.getFilepath(), vertex.getChecksum()));

      for (Vertex v: vertex.getNeighbourList()) {
        if (!v.getVisited()) {
          v.setVisited(true);
          this.queue.add(v);
        }
      }
    }
  }
}