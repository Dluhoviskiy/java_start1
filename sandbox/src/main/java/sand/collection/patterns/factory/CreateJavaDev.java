package sand.collection.patterns.factory;

public class CreateJavaDev implements DeveloperFactory{
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
