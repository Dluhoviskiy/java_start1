package sand.collection.patternStructural.decorator;

public class TeamLeadJavaDeveloper extends DeveloperDecorator{
    public TeamLeadJavaDeveloper(Developer developer) {
        super(developer);
    }

    public String makeReport(){
        return "make report";
    }

    @Override
    public String makeJob() {
        return super.makeJob()+makeReport();
    }


}
