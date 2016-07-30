package com.script.parents;

import com.frc.frc_api2.node_framework.my_nodes.ParentNode;
import com.script.nodes.CutTree;
import com.script.util.Constants;
import com.script.util.CutTask;
import org.tbot.wrappers.Tile;

import java.util.Random;

/**
 * Created by Eric Vue on 7/29/2016.
 */
public class CutTaskParent extends ParentNode {
    @Override
    public void initChildren() {
        add(
                new CutTree(new CutTask("Tree", getRandom(Constants.LOG_TILES), 1, 15)),
                new CutTree(new CutTask("Oak", getRandom(Constants.OAK_LOGS), 15, 30)),
                new CutTree(new CutTask("Willow", getRandom(Constants.WILLOW_LOGS), 30, 60)),
                new CutTree(new CutTask("Yew", getRandom(Constants.YEW_LOGS), 60))
        );
    }

    public Tile getRandom(Tile[] array) {
        int random = new Random().nextInt(array.length);
        return array[random];
    }
}
