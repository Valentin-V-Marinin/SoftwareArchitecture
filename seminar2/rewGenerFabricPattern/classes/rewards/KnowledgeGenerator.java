package seminar2.rewGenerFabricPattern.classes.rewards;

import seminar2.rewGenerFabricPattern.classes.ItemFabric;
import seminar2.rewGenerFabricPattern.classes.iGameItem;

public class KnowledgeGenerator extends ItemFabric {
    @Override
    public iGameItem createItem() {
        return new KnowledgeReward();
    }
}
