package Lab3;

public class main {

    public static void main(String[] args) {
        Task raz = new Task("Milość", "Sen", TaskCategory.IN_PROGRESS);
        Task dwa = new Task("śnieg", "Deszcz", TaskCategory.DONE);
        Task trzy = new Task("kaczkać", "Sedan", TaskCategory.NEW);
        Subtask cztery = new Subtask("pies", "kot", TaskCategory.DONE);
        Subtask pięc = new Subtask("kon", "zebra", TaskCategory.DONE);
        Subtask sześć= new Subtask("dom", "garaż", TaskCategory.DONE);
    }

    public void getDetailInfo(Object o) {

    }
}
