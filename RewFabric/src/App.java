import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import Classes.itemGenerator;
import Classes.Rewards.ClothesFabric;
import Classes.Rewards.EatFabric;
import Classes.Rewards.GimFabric;
import Classes.Rewards.GoldFabric;
import Classes.Rewards.PoitionFabric;
import Classes.Rewards.WeaponFabric;
import Classes.Rewards.WoodFabric;

public class App {
    public static void main(String[] args) throws Exception {
        itemGenerator goldFab = new GoldFabric();
        itemGenerator gimFab = new GimFabric();
        itemGenerator woodFab = new WoodFabric();
        itemGenerator eatFab = new EatFabric();
        itemGenerator clothesFab = new ClothesFabric();
        itemGenerator weaponFab = new WeaponFabric();
        itemGenerator poitionFab = new PoitionFabric();

        Singleton singleton = Singleton.getInstance();
        // goldFab.openReward();
        // gimFab.openReward();

        Random rnd = ThreadLocalRandom.current();
        List<itemGenerator> fabricList = new ArrayList<>();
        fabricList.add(goldFab);
        fabricList.add(gimFab);
        fabricList.add(woodFab);
        fabricList.add(eatFab);
        fabricList.add(clothesFab);
        fabricList.add(gimFab);
        fabricList.add(weaponFab);
        fabricList.add(poitionFab);

        for (int i = 0; i < 20; i++) {
            int index = Math.abs(rnd.nextInt(0, fabricList.size()));
            fabricList.get(index).openReward();
        }
    }
}
