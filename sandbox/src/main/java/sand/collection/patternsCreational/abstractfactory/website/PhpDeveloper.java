package sand.collection.patternsCreational.abstractfactory.website;

import sand.collection.patternsCreational.abstractfactory.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("write php web code = ");
    }
}
