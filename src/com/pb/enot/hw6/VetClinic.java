package com.pb.enot.hw6;
import java.lang.reflect.*;
public class VetClinic {
        public static void main(String[] args) {
            Veterinarian veterinarian = new Veterinarian();
            Animal[] animals = new Animal[3];
            animals[0] = new Dog("Каша и кости", "Двор частного дома");
            animals[1] = new Horse("Сено", "Степь" ,66.8);
            animals[2] = new Cat("Молоко и рыба", "Квартира");



            for (Animal animal : animals) {
                veterinarian.treatAnimal(animal);
            }
        }



   /* public class ReflectionCheck {
// new ReflectionCheck();
        public void  s
            Class clazz = object.getClass();
            System.out.println(clazz.getName());
        }

*/
}
