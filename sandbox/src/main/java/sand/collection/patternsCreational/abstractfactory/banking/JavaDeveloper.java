package sand.collection.patternsCreational.abstractfactory.banking;

import sand.collection.patternsCreational.abstractfactory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {

        System.out.println("JavaDeveloper write java code = ");
    }
}
