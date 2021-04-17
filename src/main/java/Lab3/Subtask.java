package Lab3;

public class Subtask extends Task {
    String subtaskName;
    String getSubtaskName() {
        return null;
    }

    void SubtaskName(String subtaskName) {

    }

    @Override
    public String toString() {
        return "Subtask{" +
                "subtaskName='" + subtaskName + '\'' +
                '}';
    }



    public Subtask(String taskName, String taskDescription, TaskCategory taskCategory) {
        super(taskName, taskDescription, taskCategory);
        this.subtaskName = subtaskName;
    }

}