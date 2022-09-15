package sand.collection.patternsCreational.abstractfactory;

public interface ProjectTeamFactory {

    Developer getDeveloper();
    Tester getTester();
    Manager getManager();
}
