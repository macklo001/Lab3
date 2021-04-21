package Lab3;

import java.time.LocalDateTime;

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

    public Subtask(){}
    public Subtask(String taskName, String taskDescription, TaskCategory taskCategory) {
        super(taskName, taskDescription, taskCategory);
        this.subtaskName = subtaskName;

    }


}
