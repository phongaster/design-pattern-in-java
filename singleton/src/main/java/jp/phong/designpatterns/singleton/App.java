package jp.phong.designpatterns.singleton;

public class App {
  public static void main(String[] args) {
      // x変数によりシングルトンクラスを生成する
      Singleton x = Singleton.getInstance();

      // y変数によりシングルトンクラスを生成するX
      Singleton y = Singleton.getInstance();

      // z変数によりシングルトンクラスを生成する
      Singleton z = Singleton.getInstance();

      // xインスタンスの変数を大文字にする
      x.s = (x.s).toUpperCase();

      System.out.println("xからの文字列は" + x.s);
      System.out.println("yからの文字列は" + y.s);
      System.out.println("yからの文字列は" + z.s);

      // xインスタンスの変数を大文字にする
      z.s = (z.s).toLowerCase();

      System.out.println("xからの文字列は" + x.s);
      System.out.println("yからの文字列は" + y.s);
      System.out.println("yからの文字列は" + z.s);
  }
}
