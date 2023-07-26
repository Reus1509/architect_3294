package Classes.Rewards;

import Classes.iGameItem;
import Classes.itemGenerator;

public class WoodFabric extends itemGenerator{

    @Override
    public iGameItem createItem() {
        return new Wood();
    }
    
}
