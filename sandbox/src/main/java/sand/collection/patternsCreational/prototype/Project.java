package sand.collection.patternsCreational.prototype;

public class Project implements Copyable{
    private String projectName;
    private String sourceCode;
    private int id;

    public Project(String projectName, String sourceCode, int id) {
        this.projectName = projectName;
        this.sourceCode = sourceCode;
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public String getSourceCode() {
        return sourceCode;
    }

    @Override
    public String toString() {
        return "Project{" +
                "projectName=" + projectName +
                ", sourceCode=" + sourceCode +
                ", id=" + id +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public void setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public Object copy() {
        Project copy = new Project(projectName, sourceCode, id);
        return copy;
    }
}
