package sand.collection.patternStructural.bridge;



public abstract class Programm {
    protected Developer developer;
    protected Programm(Developer developer) {
        this.developer = developer;

    }

    public abstract void developProgram();
}
