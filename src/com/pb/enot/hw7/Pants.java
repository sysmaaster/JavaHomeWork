package com.pb.enot.hw7;

public class Pants extends Clothes implements ManClothes, dressWomen {
    public Pants(Sizes size, String color) {
        super(size, color);
    }
    public Pants(Sizes size, String color, double cost) {
        super(size, color, cost);
    }

    @Override
    public String toString() {
        return "Штаны{" +
                "размер = " + getSize() +
                ", цена = " + getCost() + " грн" +
                ", цвет = " + getColor() +
                "}";
    }
}
