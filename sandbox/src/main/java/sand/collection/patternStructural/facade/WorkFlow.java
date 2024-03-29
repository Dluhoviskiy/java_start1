package sand.collection.patternStructural.facade;

public class WorkFlow {
    Job job = new Job();
    BugTracker bugTracker = new BugTracker();
    Developer developer = new Developer();

    public void solveProblems(){

        job.doJob();
        bugTracker.startSprint();
        developer.doJobBeforeDeadline(bugTracker);

//        bugTracker.finishSprint();
//        developer.doJobBeforeDeadline(bugTracker);
    }
}
