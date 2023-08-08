package View;

import Controller.DataAdmin;
import Staff.Accounting;
import Staff.Director;
import Staff.WorkFlow;
import Staff.Worker;

public class ViewAdmin {
    private Director director = new Director("Сидоров Сидр Сидорович", 38, "Куликово поле 15");
    private Worker worker = new Worker("Иванов Иван Иванович", 22, "Маковая лужайка 3");
    private Accounting accounting = new Accounting("Тамарова Тамара Петровна", 65, "Карла Маркса 11");
    private WorkFlow workFlow = new WorkFlow();
    private DataAdmin dataAdmin = new DataAdmin();
    private Informator informator = new Informator();

    public void viewInformation(Informator informator){

    }
}
