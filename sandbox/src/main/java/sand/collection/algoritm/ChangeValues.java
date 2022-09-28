package sand.collection.algoritm;

public class ChangeValues {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;

        int tmp = a;
        a = b;
        b = tmp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a = a+b;
                b=a-b;
                        b=a-b;


        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

}


