package Classes.Rewards;

import Classes.iGameItem;
import Classes.itemGenerator;

public class GimFabric extends itemGenerator {

    @Override
    public iGameItem createItem() {
        return new Gem();
    }
    
}
