package sand.collection.patternStructural.composite;

public class Project {

    public static void main(String[] args) {
        Team team = new Team();

        Developer developer = new JavaDeveloper();
        Developer secondDeveloper = new JavaDeveloper();
        Developer cppDeveloper = new CppDeveloper();

        team.addDeveloper(developer);
        team.addDeveloper(secondDeveloper);
        team.addDeveloper(cppDeveloper);

        team.createProject();
    }
}
