package sand.collection.state;


public class DeveloperRunner {
    public static void main(String[] args) {

        Sleeping activity = new Sleeping();
        Developer developer = new Developer();

        developer.setActivity(activity);

        for (int i = 0; i< 10; i++){
            developer.justDoIt();
            developer.changeActivity();

        }

        }

}
