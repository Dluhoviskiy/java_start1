package sand.collection.patternStructural.decorator;

public class SeniorJavaDeveloper extends DeveloperDecorator{
    public SeniorJavaDeveloper(Developer developer) {
        super(developer);
    }

    public String makeReview(){
        return "make review";
    }

    @Override
    public String makeJob() {
        return super.makeJob()+makeReview();
    }


}
