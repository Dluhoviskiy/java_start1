package sand.collection.patternsCreational.abstractfactory.website;

import sand.collection.patternsCreational.abstractfactory.Manager;

public class WebManager implements Manager {
    @Override
    public void manageProject() {
        System.out.println("Web manage = ");
    }
}
