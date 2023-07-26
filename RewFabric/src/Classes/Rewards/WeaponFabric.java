package Classes.Rewards;

import Classes.iGameItem;
import Classes.itemGenerator;

public class WeaponFabric extends itemGenerator{

    @Override
    public iGameItem createItem() {
        return new Weapon();
    }
    
}
