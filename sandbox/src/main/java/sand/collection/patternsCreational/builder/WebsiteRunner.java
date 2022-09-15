package sand.collection.patternsCreational.builder;

public class WebsiteRunner {
    public static void main(String[] args) {

        Director director = new Director();
        director.setBuilder(new VisitCardWebsite());
        WebSite webSite = director.buildWebsite();

        System.out.println(webSite);

    }
}
