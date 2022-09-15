package sand.collection.patternsCreational.factory;

import static sand.collection.patternsCreational.factory.JavaType.JAVA;

public class Program {
    static DeveloperFactory developerBySpeciality(JavaType typeDeveloper) {
        switch (typeDeveloper) {
            case CPLUS:
                return new CreateCplusDev();
            case JAVA:
                return new CreateJavaDev();
            default:
                throw new RuntimeException("There is no such type of Developer = " + typeDeveloper);
        }

    }

    public static void main (String[] args) {
        
    DeveloperFactory developerFactory = developerBySpeciality(JAVA);

    Developer developer = developerFactory.createDeveloper();
    developer.writeCode();
    }


}
