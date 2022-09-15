package sand.collection.patternStructural.decorator;

public class Task {
    public static void main(String[] args) {
        Developer developer = new TeamLeadJavaDeveloper( (new JavaDeveloper()));
        System.out.println(developer.makeJob());
    }
}
