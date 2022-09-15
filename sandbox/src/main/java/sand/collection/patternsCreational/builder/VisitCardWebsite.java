package sand.collection.patternsCreational.builder;

public class VisitCardWebsite extends WebSiteBuilder{


    @java.lang.Override
    void buildName() {
        webSite.setName("VisitCard");
    }

    @java.lang.Override
    void buildCms() {
        webSite.setCms(Cms.WORDPRESS);

    }

    @java.lang.Override
    void buildPrice() {
        webSite.setPrice(500);

    }
}
