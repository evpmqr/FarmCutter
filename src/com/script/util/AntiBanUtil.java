package com.script.util;

import org.tbot.methods.*;
import org.tbot.util.Condition;
import org.tbot.wrappers.Widget;
import org.tbot.wrappers.WidgetChild;

/**
 * Created by Eric Vue on 7/29/2016.
 */
public class AntiBanUtil {
    private static Widget skillWidgets = Widgets.getWidget(320);
    private static WidgetChild widgetChild;

    public static void hoverSkill(Skills.Skill skill) {
        if (!Widgets.isTabOpen(Widgets.TAB_STATS)) {
            openSkillTab();
        } else {
            switch (skill) {
                case ATTACK:
                    widgetChild = skillWidgets.getChild(1);
                    Mouse.move(widgetChild.getCenterLocation().x + Random.nextInt(10), widgetChild.getCenterLocation().y);
                    break;
                case STRENGTH:
                    widgetChild = skillWidgets.getChild(2);
                    Mouse.move(widgetChild.getCenterLocation().x + Random.nextInt(10), widgetChild.getCenterLocation().y);
                    break;
                case DEFENCE:
                    widgetChild = skillWidgets.getChild(3);
                    Mouse.move(widgetChild.getCenterLocation().x + Random.nextInt(10), widgetChild.getCenterLocation().y);
                    break;
                case RANGED:
                    widgetChild = skillWidgets.getChild(4);
                    Mouse.move(widgetChild.getCenterLocation().x + Random.nextInt(10), widgetChild.getCenterLocation().y);
                    break;
                case PRAYER:
                    widgetChild = skillWidgets.getChild(5);
                    Mouse.move(widgetChild.getCenterLocation().x + Random.nextInt(10), widgetChild.getCenterLocation().y);
                    break;
                case MAGIC:
                    widgetChild = skillWidgets.getChild(6);
                    Mouse.move(widgetChild.getCenterLocation().x + Random.nextInt(10), widgetChild.getCenterLocation().y);
                    break;
                case RUNECRAFT:
                    widgetChild = skillWidgets.getChild(7);
                    Mouse.move(widgetChild.getCenterLocation().x + Random.nextInt(10), widgetChild.getCenterLocation().y);
                    break;
                case CONSTRUCTION:
                    widgetChild = skillWidgets.getChild(8);
                    Mouse.move(widgetChild.getCenterLocation().x + Random.nextInt(10), widgetChild.getCenterLocation().y);
                    break;
                case HITPOINTS:
                    widgetChild = skillWidgets.getChild(9);
                    Mouse.move(widgetChild.getCenterLocation().x + Random.nextInt(10), widgetChild.getCenterLocation().y);
                    break;
                case AGILITY:
                    widgetChild = skillWidgets.getChild(10);
                    Mouse.move(widgetChild.getCenterLocation().x + Random.nextInt(10), widgetChild.getCenterLocation().y);
                    break;
                case HERBLORE:
                    widgetChild = skillWidgets.getChild(11);
                    Mouse.move(widgetChild.getCenterLocation().x + Random.nextInt(10), widgetChild.getCenterLocation().y);
                    break;
                case THIEVING:
                    widgetChild = skillWidgets.getChild(12);
                    Mouse.move(widgetChild.getCenterLocation().x + Random.nextInt(10), widgetChild.getCenterLocation().y);
                    break;
                case CRAFTING:
                    widgetChild = skillWidgets.getChild(13);
                    Mouse.move(widgetChild.getCenterLocation().x + Random.nextInt(10), widgetChild.getCenterLocation().y);
                    break;
                case FLETCHING:
                    widgetChild = skillWidgets.getChild(14);
                    Mouse.move(widgetChild.getCenterLocation().x + Random.nextInt(10), widgetChild.getCenterLocation().y);
                    break;
                case SLAYER:
                    widgetChild = skillWidgets.getChild(15);
                    Mouse.move(widgetChild.getCenterLocation().x + Random.nextInt(10), widgetChild.getCenterLocation().y);
                    break;
                case HUNTER:
                    widgetChild = skillWidgets.getChild(16);
                    Mouse.move(widgetChild.getCenterLocation().x + Random.nextInt(10), widgetChild.getCenterLocation().y);
                    break;
                case MINING:
                    widgetChild = skillWidgets.getChild(17);
                    Mouse.move(widgetChild.getCenterLocation().x + Random.nextInt(10), widgetChild.getCenterLocation().y);
                    break;
                case SMITHING:
                    widgetChild = skillWidgets.getChild(18);
                    Mouse.move(widgetChild.getCenterLocation().x + Random.nextInt(10), widgetChild.getCenterLocation().y);
                    break;
                case FISHING:
                    widgetChild = skillWidgets.getChild(19);
                    Mouse.move(widgetChild.getCenterLocation().x + Random.nextInt(10), widgetChild.getCenterLocation().y);
                    break;
                case COOKING:
                    widgetChild = skillWidgets.getChild(20);
                    Mouse.move(widgetChild.getCenterLocation().x + Random.nextInt(10), widgetChild.getCenterLocation().y);
                    break;
                case FIREMAKING:
                    widgetChild = skillWidgets.getChild(21);
                    Mouse.move(widgetChild.getCenterLocation().x + Random.nextInt(10), widgetChild.getCenterLocation().y);
                    break;
                case WOODCUTTING:
                    widgetChild = skillWidgets.getChild(22);
                    Mouse.move(widgetChild.getCenterLocation().x + Random.nextInt(10), widgetChild.getCenterLocation().y);
                    break;
                case FARMING:
                    widgetChild = skillWidgets.getChild(23);
                    Mouse.move(widgetChild.getCenterLocation().x + Random.nextInt(10), widgetChild.getCenterLocation().y);
                    break;
            }
        }
    }

    private static void openSkillTab() {
        Widgets.openTab(Widgets.TAB_STATS);
        Time.sleepUntil(new Condition() {
            @Override
            public boolean check() {
                return Widgets.isTabOpen(Widgets.TAB_STATS);
            }
        }, 500);
    }


}
