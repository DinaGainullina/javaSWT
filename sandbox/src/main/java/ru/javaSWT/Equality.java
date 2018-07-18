package ru.javaSWT;

public class Equality {

  public static void main (String[] agrs) {
    String s1 = "firefox";
    String s2 = new String (s1);

    System.out.println(s1 == s2);
    System.out.println(s1.equals(s2));
  }
}
