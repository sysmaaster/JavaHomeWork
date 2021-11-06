package com.pb.enot.hw6;

import java.util.Objects;

public class Cat extends Animal {
    private String color;

    public Cat() {
    }

    public Cat(String name ,String food, String location) {
        super(name,food, location);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void eat() {
        System.out.println("Кошка ест.");
    }

    @Override
    public String makeNoise() {
        return "Мя-я-я-я-я-я-у!!!!";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat)) return false;
        if (!super.equals(o)) return false;
        Cat cat = (Cat) o;
        return Objects.equals(color, cat.color);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (color != null ? color.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Cat { " +  "name='" + getNames()+ '\'' +
                " food='" + getFood() + '\'' +
                ", location='" + getLocation() + '\'' +
                " }";
    }
}
