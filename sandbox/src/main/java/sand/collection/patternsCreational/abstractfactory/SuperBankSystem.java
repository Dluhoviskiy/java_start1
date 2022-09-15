package sand.collection.patternsCreational.abstractfactory;

import sand.collection.patternsCreational.abstractfactory.banking.BankteamFactory;

public class SuperBankSystem {

    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankteamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Manager manager = projectTeamFactory.getManager();
        Tester tester = projectTeamFactory.getTester();

        System.out.println("Creating project = " );

        developer.writeCode();
        tester.runTests();
        manager.manageProject();
    }
}
