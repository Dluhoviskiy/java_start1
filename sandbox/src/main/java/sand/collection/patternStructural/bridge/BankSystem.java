package sand.collection.patternStructural.bridge;

public class BankSystem extends Programm{
    protected BankSystem(Developer developer) {
        super(developer);
    }

    @java.lang.Override
    public void developProgram() {
        System.out.println(" bank system is working");
        developer.writeCode();
    }
}
