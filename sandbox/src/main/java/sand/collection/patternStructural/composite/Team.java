package sand.collection.patternStructural.composite;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private List<Developer> developersList = new ArrayList<>();


    public void addDeveloper(Developer developer) {
        developersList.add(developer);
    }

    public void removeDeveloper(Developer developer) {
        developersList.remove(developer);
    }

    public void createProject() {
        System.out.println(" Team create project ");
        for (Developer developer: developersList){
            developer.writeCode();
        }
    }
}
