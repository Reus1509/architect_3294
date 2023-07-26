package Classes.Rewards;

import Classes.iGameItem;
import Classes.itemGenerator;

public class ClothesFabric extends itemGenerator{

    @Override
    public iGameItem createItem() {
        return new Clothes();
    }
    
}
