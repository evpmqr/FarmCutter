package com.script.util;

import org.tbot.wrappers.Tile;

/**
 * Created by Eric Vue on 7/29/2016.
 */
public class CutTask {
    private String treeName;
    private Tile tile;
    private int minLevel, maxlevel;

    public CutTask(String treeName, Tile tile, int minLevel) {
        this.treeName = treeName;
        this.tile = tile;
        this.minLevel = minLevel;
        this.maxlevel = 99;
    }

    public CutTask(String treeName, Tile tile, int minLevel, int maxLevel) {
        this.treeName = treeName;
        this.tile = tile;
        this.minLevel = minLevel;
        this.maxlevel = maxLevel;
    }

    public String getTreeName() {
        return treeName;
    }

    public void setTreeName(String treeName) {
        this.treeName = treeName;
    }

    public Tile getTile() {
        return tile;
    }

    public void setTile(Tile tile) {
        this.tile = tile;
    }

    public int getMinLevel() {
        return minLevel;
    }

    public void setMinLevel(int minLevel) {
        this.minLevel = minLevel;
    }

    public int getMaxlevel() {
        return maxlevel;
    }

    public void setMaxlevel(int maxlevel) {
        this.maxlevel = maxlevel;
    }
}
