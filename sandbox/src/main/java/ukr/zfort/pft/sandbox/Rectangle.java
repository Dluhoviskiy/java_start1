package ukr.zfort.pft.sandbox;

public class Rectangle {

    public double a;
    public double b;

    public Rectangle(int a, int b) {
      this.a = a;
      this.b = b;
    }



    public double area(){
        return this.a*this.b;
    }

    public double area1(){
        return this.a+this.b;

    }
}
