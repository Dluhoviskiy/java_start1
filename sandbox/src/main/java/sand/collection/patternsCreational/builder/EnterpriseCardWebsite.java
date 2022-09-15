package sand.collection.patternsCreational.builder;

public class EnterpriseCardWebsite extends WebSiteBuilder{


    @java.lang.Override
    void buildName() {
        webSite.setName("EnterCard");
    }

    @java.lang.Override
    void buildCms() {
        webSite.setCms(Cms.ALIFRESCO);

    }

    @java.lang.Override
    void buildPrice() {
        webSite.setPrice(1000);

    }
}
