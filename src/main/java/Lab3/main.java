package Lab3;

public class Main {

    public static void main(String[] args) {
        Task raz = new Task("Milość", "Sen", TaskCategory.IN_PROGRESS);
        Subtask dwa = (Subtask) new Task("Liscie", "opadają", TaskCategory.DONE);


        Task cztery = (Task) new Object();
        Subtask pięć = (Subtask) new Object();

    }

    public void getDetailInfo(Object o) {

    }
}
