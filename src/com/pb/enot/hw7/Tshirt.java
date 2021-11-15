package com.pb.enot.hw7;

public class Tshirt extends Clothes implements ManClothes, dressWomen {
    public Tshirt(Sizes size, String color) {
        super(size, color);
    }
    public Tshirt(Sizes size, String color, double cost) {
        super(size, color, cost);
    }

    @Override
    public String toString() {
        return "Футболка{" +
                "размер = " + getSize() +
                ", цена = " + getCost() + " грн" +
                ", цвет = " + getColor() +
                "}";
    }
}