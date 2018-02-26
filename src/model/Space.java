package model;

import java.util.Random;

/**
 * A single space in the 101x101 map, contains booleans for visited, revealed and blocked.<br>
 * There's a 30% chance the space is blocked, 70% chance it's not. This is decided when the Space()
 * constructor is called.
 * 
 * @author Jason Holley
 *
 */
public class Space implements Comparable<Space> {

  private boolean visited, revealed, blocked, onPath, start, goal;

  private final int x, y;

  public Space previous;

  /*
   * g = distance from start to current cell h = distance from current cell to goal f = g + h
   */

  double f, g, h;

  Space(int x, int y) {
    this.x = x;
    this.y = y;
    this.setVisited(false);
    this.setRevealed(false);
    this.setOnPath(false);
    Random rand = new Random();
    int n = rand.nextInt(10) + 1;
    if (n <= 3)
      this.setBlocked(true);
    else
      this.setBlocked(false);
  }

  public double getF() {
    return f;
  }

  public void setF(double newf) {
    this.f = newf;
  }

  public double getG() {
    return g;
  }

  public void setG(double newg) {
    this.g = newg;
  }

  public double getH() {
    return h;
  }

  public void setH(double newh) {
    this.h = newh;
  }

  public int getX() {
    return this.x;
  }

  public int getY() {
    return this.y;
  }

  public boolean isVisited() {
    return visited;
  }

  public void setVisited(boolean visited) {
    this.visited = visited;
  }

  public boolean isRevealed() {
    return revealed;
  }

  public void setRevealed(boolean revealed) {
    this.revealed = revealed;
  }

  public boolean isBlocked() {
    return blocked;
  }

  public void setBlocked(boolean blocked) {
    this.blocked = blocked;
  }

  public boolean isOnPath() {
    return onPath;
  }

  public void setOnPath(boolean onPath) {
    this.onPath = onPath;
  }

  public boolean isStart() {
    return start;
  }

  public void setStart(boolean start) {
    this.start = start;
  }

  public boolean isGoal() {
    return goal;
  }

  public void setGoal(boolean goal) {
    this.goal = goal;
  }

  @Override
  public int compareTo(Space o) {
    if (o instanceof Space) {
      Space input = (Space) o;
      return Double.compare(this.getF(), input.getF());
    }
    return 0;
  }


}
