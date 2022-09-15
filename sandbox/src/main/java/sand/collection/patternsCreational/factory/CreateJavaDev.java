package sand.collection.patternsCreational.factory;

public class CreateJavaDev implements DeveloperFactory{
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
