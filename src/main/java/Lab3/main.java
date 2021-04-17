package Lab3;

public class main {

    public static void main(String[] args) {
        Task raz = new Task("Milość", "Sen", TaskCategory.IN_PROGRESS);
        Task dwa = new Task("eeeć", "Sren", TaskCategory.DONE);
        Task trzy = new Task("sć", "Sdaen", TaskCategory.NEW);
        Subtask zad2 = new SubTask("Trening", "Pojsc na silownie", TaskCategory.DONE);


    }

    public void getDetailInfo(Object o) {

    }
}
