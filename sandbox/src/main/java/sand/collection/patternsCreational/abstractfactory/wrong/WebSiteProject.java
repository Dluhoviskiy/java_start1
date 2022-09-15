package sand.collection.patternsCreational.abstractfactory.wrong;

import sand.collection.patternsCreational.abstractfactory.banking.JavaDeveloper;

public class WebSiteProject {
    public static void main(String[] args) {
        PhpDeveloper phpDeveloper = new PhpDeveloper();
        ManualTester manualTester = new ManualTester();
        ProjectManager projectManager = new ProjectManager();
        JavaDeveloper javaDeveloper = new JavaDeveloper();

        System.out.println("creating Auction website " );


        phpDeveloper.createCode();
        manualTester.testCode();
        projectManager.ManageProject();
    }


}
