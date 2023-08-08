package View;

import Controller.DataAdmin;

public class Informator {
    private String info;
    private DataAdmin dataAdmin = new DataAdmin();

    public String getViewInformation(DataAdmin dataAdmin){
        return info;
    }
}
