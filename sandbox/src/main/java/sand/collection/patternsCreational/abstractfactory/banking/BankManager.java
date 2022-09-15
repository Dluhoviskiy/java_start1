package sand.collection.patternsCreational.abstractfactory.banking;

import sand.collection.patternsCreational.abstractfactory.Manager;

public class BankManager implements Manager {
    @Override
    public void manageProject() {
        System.out.println("BankManager manage bank = ");
    }
}
