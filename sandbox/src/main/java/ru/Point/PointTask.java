package ru.Point;

public class PointTask
{
  public static void main(String[] args)
  {
    double x1 = 32;
    double x2 = 59;
    double y1 = 41;
    double y2 = 82;

    Point p1 = new Point (x1, y1);
    Point p2 = new Point (x2, y2);

    System.out.println (distance(p1, p2));
    System.out.println (p1.distance(p2));
  }


  public static double distance (Point p1, Point p2)
  {
    return Math.sqrt(Math.pow((p2.x-p1.x), 2) + Math.pow((p2.y-p1.y), 2));
  }


}
