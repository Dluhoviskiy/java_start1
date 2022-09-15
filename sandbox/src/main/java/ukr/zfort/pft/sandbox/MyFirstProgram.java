package ukr.zfort.pft.sandbox;

import static java.lang.System.*;

public class MyFirstProgram {

  public static void main (String[] args) {
      int a = 5;
      long b = 3;
//      hello("world");
//      hello("Alecs");
//      hello("again");
//      Square s = new Square(5);
//
//      System.out.println( "ПЛОЩАДЬ КВАДРАТА СО СТООНОЙ " + s.l + " = " + s.area());
      Rectangle r = new Rectangle(4, 9);
//        System.out.println( "ПЛОЩАДЬ Прямоугольника СО СТООНами " + r.a + " и " + r.b + " = " + r.area());


      System.out.println( "сумма равна " + r.a + " and " + r.b + " = " + r.area1());
  }
//  public static void hello(String somebody) {
//       System.out.println("Hello, " + somebody + "!");
//  }


}