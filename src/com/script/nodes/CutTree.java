package com.script.nodes;

import com.frc.frc_api2.game.util.game.SleepUtil;
import com.frc.frc_api2.game.wrappers.qurie_wrapper.FGameObjects;
import com.frc.frc_api2.node_framework.my_nodes.ChildNode;
import com.script.util.Constants;
import com.script.util.CutTask;
import org.tbot.methods.Players;
import org.tbot.methods.Random;
import org.tbot.methods.Skills;
import org.tbot.methods.Time;
import org.tbot.methods.tabs.Equipment;
import org.tbot.methods.tabs.Inventory;
import org.tbot.util.Condition;

/**
 * Created by Eric Vue on 7/29/2016.
 */
public class CutTree extends ChildNode {
    private CutTask cutTask;
    private int random = Random.nextInt(1,2);

    public CutTree(CutTask cutTask) {
        this.cutTask = cutTask;
    }

    @Override
    public void execute() {
        DropItems.drop = false;
        if (!isChopping()) {
            if (random == 1){
                FGameObjects.getNearest(cutTask.getTreeName()).inRadius(cutTask.getTile(), 10).interact("Chop down");
                Time.sleepUntil(new Condition() {
                    @Override
                    public boolean check() {
                        return isChopping();
                    }
                }, 2000);
                random = Random.nextInt(1,2);
            }else{
                FGameObjects.getNearest(cutTask.getTreeName()).inRadius(cutTask.getTile(), 10).click();
                Time.sleepUntil(new Condition() {
                    @Override
                    public boolean check() {
                        return isChopping();
                    }
                }, 2000);
                random = Random.nextInt(1,2);
            }
        }
    }
    private boolean isChopping(){
        int ani = Players.getLocal().getAnimation();
        return ani == 879 || ani == 867;
    }

    @Override
    public boolean validate() {
        return !Inventory.isFull() && (Inventory.containsOneOf(Constants.AXES) || Equipment.containsOneOf(Constants.AXES))
                && Skills.getCurrentLevel(Skills.Skill.WOODCUTTING) >= cutTask.getMinLevel() && Skills.getCurrentLevel(Skills.Skill.WOODCUTTING) < cutTask.getMaxlevel();
    }
}
