package sand.collection.patternsCreational.abstractfactory.banking;

import sand.collection.patternsCreational.abstractfactory.Developer;
import sand.collection.patternsCreational.abstractfactory.Manager;
import sand.collection.patternsCreational.abstractfactory.ProjectTeamFactory;
import sand.collection.patternsCreational.abstractfactory.Tester;

public class BankteamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new AQATester();
    }

    @Override
    public Manager getManager() {
        return new BankManager();
    }
}
