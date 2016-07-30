package com.script.nodes;

import com.frc.frc_api2.node_framework.my_nodes.ChildNode;
import com.script.util.Constants;
import org.tbot.bot.TBot;
import org.tbot.internal.event.events.InventoryEvent;
import org.tbot.internal.event.listeners.IgnoreListeners;
import org.tbot.internal.event.listeners.InventoryListener;
import org.tbot.methods.Time;
import org.tbot.methods.tabs.Inventory;
import org.tbot.util.Condition;
import org.tbot.wrappers.Item;

/**
 * Created by Eric Vue on 7/29/2016.
 */
@IgnoreListeners
public class DropItems extends ChildNode implements InventoryListener {
    public static boolean drop;
    private int[] logs = {1511, 1521, 1519};

    @Override
    public void execute() {
        if (Inventory.hasItemSelected() && Inventory.deselectItem()) ;
        for (Item item : Inventory.getItems()) {
            if (!isAxe(item.getID())) {
                item.interact("Drop");
                Time.sleep(500, 700);
            }
        }
    }

    @Override
    public boolean validate() {
        return Inventory.isFull() || (drop && Inventory.getCountExcept(Constants.AXES) != 0);
    }

    public DropItems() {
        TBot.getBot().getScriptHandler().getEventManager().addListener(this);
    }

    @Override
    public void itemsAdded(InventoryEvent inventoryEvent) {

    }

    @Override
    public void itemsRemoved(InventoryEvent inventoryEvent) {
        if (isLog(inventoryEvent.getItem().getID())) {
            drop = true;
        }
    }

    private boolean isAxe(int id) {
        for (int i : Constants.AXES) {
            if (id == i) {
                return true;
            }
        }
        return false;
    }

    private boolean isLog(int id) {
        for (int i : logs) {
            if (id == i) {
                return true;
            }
        }
        return false;
    }
}
