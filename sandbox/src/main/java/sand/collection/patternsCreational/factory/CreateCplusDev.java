package sand.collection.patternsCreational.factory;

public class CreateCplusDev implements DeveloperFactory{
    @Override
    public Developer createDeveloper() {
        return new CplusDeveloper();
    }
}
