package ukr.zfort.pft.sandbox;

public class MyFirstProgram {

  public static void main (String[] args) {
      hello("world");
      hello("Alecs");
      hello("again");
      double l=5;
      System.out.println( "ПЛОЩАДЬ КВАДРАТА СО СТООНОЙ " + l + " = " + area(l));
      double a=4;
      double b=6;
      System.out.println( "ПЛОЩАДЬ Прямоугольника СО СТООНами " + a + " и " + b + " = " + area(a, b));
  }
  public static void hello(String somebody) {
       System.out.println("Hello, " + somebody + "!");
  }
  public static double area(double len){
    return len*len;
  }
  public static double area(double a, double b){
        return a*b;
  }
}