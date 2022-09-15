package sand.collection.patternStructural.bridge;

public class StockMarket extends Programm{
    protected StockMarket(Developer developer) {
        super(developer);
    }

    @java.lang.Override
    public void developProgram() {
        System.out.println(" stock is working");
        developer.writeCode();
    }
}
