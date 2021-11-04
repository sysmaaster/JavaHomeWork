package com.pb.enot.hw6;

import java.util.Objects;

public abstract class Animal {
    private String food;
    private String location;

    public Animal() {    }
    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public String getFood() {   return food;    }
    public void setFood(String food) {   this.food = food;   }
    public String getLocation() {   return location;   }
    public void setLocation(String location) {
        this.location = location;
    }

    public abstract void eat();
    public abstract String makeNoise();

    public void sleep() { System.out.println("Животное спит. . .");    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Animal animal = (Animal) o;

        if (!Objects.equals(food, animal.food)) return false;
        return Objects.equals(location, animal.location);
    }

    @Override
    public int hashCode() {
        int result = food != null ? food.hashCode() : 0;
        result = 31 * result + (location != null ? location.hashCode() : 0);
        return result;
    }
}
