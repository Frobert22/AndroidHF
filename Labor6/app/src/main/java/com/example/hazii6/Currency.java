package com.example.hazii6;

public class Currency {
    private String code;
    private String buyPrice;
    private String sellPrice;
    private boolean isExpanded;

    public Currency(String code, String buyPrice, String sellPrice) {
        this.code = code;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.isExpanded = false;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(String buyPrice) {
        this.buyPrice = buyPrice;
    }

    public String getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(String sellPrice) {
        this.sellPrice = sellPrice;
    }

    public boolean isExpanded() {
        return isExpanded;
    }

    public void setExpanded(boolean expanded) {
        isExpanded = expanded;
    }
}
