package Classes.Rewards;

import Classes.iGameItem;
import Classes.itemGenerator;

public class EatFabric extends itemGenerator{

    @Override
    public iGameItem createItem() {
        return new Eat();
    }
    
}
