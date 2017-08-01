package com.backupapi.bfs;

import java.util.List;
import java.util.ArrayList;

public class Vertex {
  private String filepath;
  private String checksum;
  private boolean visited;
  private List<Vertex> neighbourList;

  public Vertex (String filepath, String checksum) {
    this.checksum = checksum;
    this.filepath = filepath;
    this.neighbourList = new ArrayList<Vertex>();
  }

  public String getFilepath () {
    return filepath;
  }

  public void setFilepath (String filepath) {
    this.filepath = filepath;
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