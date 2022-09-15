package sand.collection.patternStructural.bridge;

public class ProgramCreator {
    public static void main(String[] args) {



    Programm [] programms = {
            new BankSystem(new JavaDeveloper()),
            new StockMarket(new CPlusDeveloper())
    };

    for(Programm programm: programms){
        programm.developProgram();
    }
}}
