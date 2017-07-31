package com.backupapi.bfs;

import java.util.List;
import java.util.ArrayList;

public class Vertex {
  private String checksum;
  private boolean visited;
  private List<Vertex> neighbourList;

  public Vertex (String checksum) {
    this.checksum = checksum;
    this.neighbourList = new ArrayList<Vertex>();
  }

  public String getChecksum () {
    return checksum;
  }

  public void setChecksum (String checksum) {
    this.checksum = checksum;
  }

  public boolean getVisited () {
    return visited;
  }

  public void setVisited (boolean visited) {
    this.visited = visited;
  }

  public List<Vertex> getNeighbourList () {
    return neighbourList;
  }

  public void setNeighbourList (List<Vertex> neighbourList) {
    this.neighbourList = neighbourList;
  }
}