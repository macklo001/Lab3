package Lab3;

import lombok.*;




public class Subtask extends Task {
    private final String subtaskName;
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



    public Subtask(String taskName, String taskDescription, TaskCategory taskCategory, String taskDateTimeStop, String subtaskName) {
        super(taskName, taskDescription, taskCategory);
        this.subtaskName = subtaskName;
    }

}