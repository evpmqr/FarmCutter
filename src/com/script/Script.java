package com.script;

import com.frc.frc_api2.FrcScript;
import com.frc.frc_api2.node_framework.my_nodes.BaseNode;
import com.script.nodes.DropItems;
import com.script.nodes.EquipAxe;
import com.script.nodes.HandleRun;
import com.script.parents.CutTaskParent;
import org.tbot.internal.Manifest;
import org.tbot.internal.ScriptCategory;

/**
 * Created by Eric Vue on 7/29/2016.
 */
@Manifest(version = 1, name = "WoodCutter", description = "", category = ScriptCategory.MINIGAMES, openSource = false, authors = "Horror")
public class Script extends FrcScript {
    @Override
    public void initNodes(BaseNode nodeTree) {
        startLoop();
        nodeTree.add(new HandleRun(), new EquipAxe(), new DropItems(), new CutTaskParent());

    }
}
