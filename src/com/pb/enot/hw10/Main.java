package com.pb.enot.hw10;

public class Main {
    public static void main(String[] args) {
        // 29, 68, 69, 8, 81, 63, 19, 62, 74, 4
        NumBox<Number> box = new NumBox<>(5);
        box.add(0, 63);
        box.add(1, 29);
        box.add(2, 68);
        box.add(3, 69);
        box.add(4, 8);
        box.add(5, 81);

        // print(box);   //показать масив
///////////////////////////////////////////
///////// System.out.println();///////////
/////////////////////////////////////////

        int index = (int) (Math.random() * box.length());  //
        System.out.println("Значение елемента " + (index + 1) + " равно " + box.get(index));//возвращающий число по индексу.
        System.out.println("Размер " + box.length()); // возвращает текущее количество элементов.
        System.out.println("Среднее значение " + box.average()); // подсчет среднего арифметического среди элементов массива.
        System.out.println("Сумма: " + box.sum());   // сумма всех элементов массива.
        System.out.println("Максимум " + box.max());  // - максимальный элемент массива.
    }
}
