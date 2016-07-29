package com.script.nodes;

import com.frc.frc_api2.node_framework.my_nodes.ChildNode;
import org.tbot.methods.Time;
import org.tbot.methods.tabs.Inventory;
import org.tbot.util.Condition;

/**
 * Created by Eric Vue on 7/29/2016.
 */
public class EquipAxe extends ChildNode {
    @Override
    public void execute() {
        Inventory.getItemClosestToMouse(1351).click();
        Time.sleepUntil(new Condition() {
            @Override
            public boolean check() {
                return !Inventory.contains(1351);
            }
        }, 1000);
    }

    @Override
    public boolean validate() {
        return Inventory.contains(1351);
    }
}
