package com.techelevator;

public class Chip extends Snack {

    public Chip() {
    }

    public Chip(String slot, String name, double purchasePrice) {
        super(slot, name, purchasePrice);
        this.slot = slot;
        this.name = name;
        this.purchasePrice = purchasePrice;
    }
    public String getSound()  {
        return "Crunch Crunch, Crunch!";
    }


    @Override
    public double getPurchasePrice() {
        return super.getPurchasePrice();
    }

    @Override
    public int getQuantity() {
        return super.getQuantity();
    }

    @Override
    public String getSlot() {
        return super.getSlot();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public boolean soldOut() {
        return super.soldOut();
    }

    @Override
    public boolean dispenseSnack() {
        return super.dispenseSnack();
    }
}

