package com.script.util;

import org.tbot.wrappers.Tile;

/**
 * Created by Eric Vue on 7/29/2016.
 */
public class Constants {
    public static int[] AXES = {1351, 1359, 1349, 1361, 1353, 1355, 1357};
    public static Tile LUMBRIDGE_NORMAL_LOGS = new Tile(3199, 3244, 0);
    public static Tile PORT_SARIM_LOGS = new Tile(3039, 3269);

    public static Tile[] LOG_TILES = {LUMBRIDGE_NORMAL_LOGS, PORT_SARIM_LOGS};
    /**
     * Oak logs tiles
     */
    public static Tile LUMBRIDGE_OAK_LOGS = new Tile(3205, 3244, 0);
    public static Tile VARROCK_OAKS = new Tile(3165, 3419);

    public static Tile[] OAK_LOGS = {LUMBRIDGE_OAK_LOGS, VARROCK_OAKS};
    /**
     * Willow logs Tiles
     */
    public static Tile LUMBRIDGE_WILLOW_LOGS = new Tile(3165, 3272, 0);
    public static Tile DRAYNOR_WILLOW_LOGS = new Tile(3090, 3232);
    public static Tile PORT_SARIM_WILLOW_LOGS = new Tile(3060, 3252);

    public static Tile[] WILLOW_LOGS = {LUMBRIDGE_WILLOW_LOGS, PORT_SARIM_WILLOW_LOGS};

    /**
     * Yew Logs Tiles
     */
    public static Tile VARROCK_CASTLE_YEWS = new Tile(3207, 3502);//VARROCK
    public static Tile PORT_SARIM_YEW_LOGS = new Tile(3056, 3272);
    public static Tile EDGEVILLE_YEW_LOGS = new Tile(3518, 2415);
    public static Tile VARROCK_CHURCH_YEWS = new Tile(3247, 3470);
    public static Tile SECRET_YEWS = new Tile(3256, 3366);
    public static Tile SAW_MILL_TILE = new Tile(3268, 3496);//SAWMILL

    public static Tile[] YEW_LOGS = {SAW_MILL_TILE, SECRET_YEWS, VARROCK_CHURCH_YEWS};

}
