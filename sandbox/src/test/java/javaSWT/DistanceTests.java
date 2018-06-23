package javaSWT;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.Point.Point;


public class DistanceTests
{
  @Test
  public void testArea()
  {
    Point p1 = new Point (32, 41);
    Point p2 = new Point (59, 82);

    Assert.assertEquals(p1.distance(p2), 49.09175083453431);

    Point p3 = new Point (1.1, 2.2);
    Point p4 = new Point (2.2, 4.4);

    Assert.assertEquals(p3.distance(p4), 2.459674775249769);

    Point p5 = new Point (0, 0);
    Point p6 = new Point (0, 0);

    Assert.assertEquals(p5.distance(p6), 0.0);

  }

}
