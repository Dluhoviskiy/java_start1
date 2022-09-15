package sand.collection.patternsCreational.builder.wrong;


import sand.collection.patternsCreational.builder.Cms;
import sand.collection.patternsCreational.builder.WebSite;

public class WebSiteBuilder {


    public static void main(String[] args) {
        sand.collection.patternsCreational.builder.WebSite webSite = new WebSite();

        webSite.setName("new website Test");
        webSite.setCms(Cms.WORDPRESS);
        webSite.setPrice(500);

        System.out.println("webSite = " + webSite);
    }
}
