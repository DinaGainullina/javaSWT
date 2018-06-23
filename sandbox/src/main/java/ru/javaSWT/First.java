package ru.javaSWT.SWT;

import ru.javaSWT.Rectangle;
import ru.javaSWT.Square;

public class First
{

  public static void main(String[] args)
  {
    hello("world");
    hello("user");
    hello("Dina");

    Square s = new Square(5);
    Rectangle r = new Rectangle(4, 6);

    System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());
    System.out.println("Площадь прямоугольника со сторанами " + r.a + " и " + r.b + " = " + r.area());
  }


  public static void hello(String somebody)
  {
      System.out.println("Hello, " + somebody + "!");
  }
}