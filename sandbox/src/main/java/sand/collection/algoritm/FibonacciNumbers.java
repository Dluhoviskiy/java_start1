package sand.collection.algoritm;

public class FibonachiNumbers {

    public static void main(String[] args) {

    long recursive (int n) {
       if (n <= 1) {
                return n;
            }
       return recursive(n - 2) + recursive(n - 1);
    }


    }
}
