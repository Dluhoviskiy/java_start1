package ukr.zfort.pft.sandbox;

public class MyFirstProgram {

  public static void main (String[] args) {
      hello("world");
      hello("Alecs");
      hello("again");
      Square s = new Square(5);

      System.out.println( "ПЛОЩАДЬ КВАДРАТА СО СТООНОЙ " + s.l + " = " + s.area());
      Rectangle r = new Rectangle(4, 6);
        System.out.println( "ПЛОЩАДЬ Прямоугольника СО СТООНами " + r.a + " и " + r.b + " = " + r.area());
  }
  public static void hello(String somebody) {
       System.out.println("Hello, " + somebody + "!");
  }


}