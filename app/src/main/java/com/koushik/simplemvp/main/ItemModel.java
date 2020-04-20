package com.koushik.simplemvp.main;

public class ItemModel {


    protected String itemName;

    public ItemModel(String itemName) {
        this.itemName = itemName;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }


}
