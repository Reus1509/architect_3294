package Classes.Rewards;

import Classes.iGameItem;

public class Eat implements iGameItem{

    @Override
    public void open() {
        System.out.println("Eat!");
    }
}
