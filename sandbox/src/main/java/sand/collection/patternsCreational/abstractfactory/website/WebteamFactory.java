package sand.collection.patternsCreational.abstractfactory.website;

import sand.collection.patternsCreational.abstractfactory.Developer;
import sand.collection.patternsCreational.abstractfactory.Manager;
import sand.collection.patternsCreational.abstractfactory.ProjectTeamFactory;
import sand.collection.patternsCreational.abstractfactory.Tester;

public class WebteamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new AQATesterWeb();
    }

    @Override
    public Manager getManager() {
        return new WebManager();
    }
}
