package sand.collection.patterns.factory;

public class CreateCplusDev implements DeveloperFactory{
    @Override
    public Developer createDeveloper() {
        return new CplusDeveloper();
    }
}
