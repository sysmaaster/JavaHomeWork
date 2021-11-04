package com.pb.enot.hw6;

public class VetClinic {
        public static void main(String[] args) throws Exception {

            Veterinarian veterinarian = new Veterinarian();
            Animal[] animals = new Animal[3];
            animals[0] = new Dog("Каша и кости", "Двор частного дома");
            animals[1] = new Horse("Сено", "Степь" ,2.8);
            animals[2] = new Cat("Молоко и рыба", "Квартира");

         for (Animal animal : animals) { veterinarian.treatAnimal(animal); }



   /*
    Class<?> c = Class.forName("com.pb.enot.hw6.Veterinarian");
            Object object = c.newInstance();
            Constructor<?> constr = c.getConstructor(new Class[] {String.class});
System.out.print(constr);
    public class ReflectionCheck {
// new ReflectionCheck();
        public void  s
            Class clazz = object.getClass();
            System.out.println(clazz.getName());
        }

*/
}}
