package com.script.nodes;

import com.frc.frc_api2.node_framework.my_nodes.ChildNode;
import com.script.util.Constants;
import org.tbot.bot.TBot;
import org.tbot.internal.event.events.InventoryEvent;
import org.tbot.internal.event.listeners.IgnoreListeners;
import org.tbot.internal.event.listeners.InventoryListener;
import org.tbot.methods.Time;
import org.tbot.methods.tabs.Inventory;

/**
 * Created by Eric Vue on 7/29/2016.
 */
@IgnoreListeners
public class DropItems extends ChildNode implements InventoryListener {
    public static boolean drop;
    @Override
    public void execute() {
        if (Inventory.hasItemSelected() && Inventory.deselectItem());
        Inventory.getFirst(1511, 1521, 1519).interact("Drop");
        Time.sleep(500, 700);
    }

    @Override
    public boolean validate() {
        return Inventory.isFull() || (drop && Inventory.getCountExcept(Constants.AXES) != 0);
    }

    public DropItems(){
        TBot.getBot().getScriptHandler().getEventManager().addListener(this);
    }

    @Override
    public void itemsAdded(InventoryEvent inventoryEvent) {

    }

    @Override
    public void itemsRemoved(InventoryEvent inventoryEvent) {
        drop = true;
    }
}
