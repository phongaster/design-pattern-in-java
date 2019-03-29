package jp.phong.designpatterns.singleton;

public class Singleton {
  private static Singleton singleInstance = new Singleton();

  public String s;

  public static Singleton getInstance() {
    return singleInstance;
  }

  private Singleton() {
    s = "Hello I'm a string part of Singleton class";
  }
}
