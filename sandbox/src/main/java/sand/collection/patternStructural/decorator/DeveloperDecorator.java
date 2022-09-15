package sand.collection.patternStructural.decorator;

public class DeveloperDecorator implements Developer{
    Developer developer;

    public DeveloperDecorator(Developer developer) {
        this.developer = developer;
    }


    @java.lang.Override
    public java.lang.String makeJob() {
        return developer.makeJob();
    }
}
