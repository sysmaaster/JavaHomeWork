package com.pb.enot.hw6;

import java.util.Objects;

public class Dog extends Animal {
    private String name;

    public Dog() {    }
    public Dog(String name ,String food, String location) {
        super(name,food, location);
    }

    public void setName(String name) {  this.name = name;   }

    @Override
    public void eat() { System.out.println("Собака ест.");  }

    @Override
    public String makeNoise() {
        return "Гав-гав-гав!!!";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dog)) return false;
        if (!super.equals(o)) return false;
        Dog dog = (Dog) o;
        return Objects.equals(name, dog.name);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Dog { " + "name='" + getNames()+ '\'' +
                " food='" + getFood() + '\'' +
                ", location='" + getLocation() + '\'' +
                " }";
    }
}