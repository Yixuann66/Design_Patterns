package com.dengyixuan.behavioral.command;/**
 * @Author 85067
 * @create 08/05/2023 18:49
 */

import java.util.HashMap;
import java.util.Map;

/**
 * @author 85067
 * @version 1.0
 * @description: TODO
 * @date 08/05/2023 18:49
 */
public class Order {
    private int diningTable;

    private Map<String, Integer> foodDir = new HashMap<>();

    public int getDiningTable() {
        return diningTable;
    }

    public void setDiningTable(int diningTable) {
        this.diningTable = diningTable;
    }

    public Map<String, Integer> getFoodDir() {
        return foodDir;
    }

    public void setFoodDir(Map<String, Integer> foodDir) {
        this.foodDir = foodDir;
    }

    public void setFoot(String name, int num) {
        foodDir.put(name, num);
    }


}
