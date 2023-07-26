package Classes.Rewards;

import Classes.iGameItem;
import Classes.itemGenerator;

public class PoitionFabric extends itemGenerator {

    @Override
    public iGameItem createItem() {
        return new Poition();
    }
    
}
