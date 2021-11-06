package com.pb.enot.hw6;

import java.lang.reflect.Constructor;

public class VetClinic {

    public static void main(String[] args) throws Exception {

        Animal[] animals = new Animal[3];

        animals[0] = new Horse("Герта", "Сено", "Ферма", 2.8);
        animals[1] = new Dog("Зуфра","Каша и корм", "Двор частного дома");
        animals[2] = new Cat("Саймон", "Молоко и рыба", "Квартира");

        Class<?> vetClazz = Class.forName("com.pb.enot.hw6.Veterinarian");
        Constructor<?> constr = vetClazz.getConstructor();
        Object obj = constr.newInstance();
        for (Animal animal : animals) {
            if (obj instanceof Veterinarian) {
                Veterinarian.treatAnimal(animal);
            }
        }

        System.out.println("\n"+ "   |\\_/| \n" +"  / @ @ \\ \n" + " ( > * < ) \n'>>>>X<<<<'\n" + "/    O    \\ \n" + "by SysMaaster");
    }
}

