package sand.collection.patternsCreational.prototype;

public class VersionControlRunner {

    public static void main(String[] args) {
        Project master = new Project("Adidas", "Intel code = new sourceCode();\n", 5);
        System.out.println("master = " + master);

//        Project masterClone = (Project) master.copy();
//        System.out.println("\n = = = = = = = = = = = = = = = = = = \n");
//        System.out.println("masterClone = " + masterClone);

        ProjectFactory factory = new ProjectFactory(master);
        Project masterClone = factory.cloneProject();
        System.out.println("\n = = = = = = = = = = = = = = = = = = \n");
        System.out.println("masterClone = " + masterClone);
    }
}
