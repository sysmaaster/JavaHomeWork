package com.pb.enot.hw10;

import java.util.Arrays;
import java.util.List;

public class NumBox<T extends Number> {
    private final T[] nams;

    public NumBox(T[] nams) {
        this.nams = nams;
    }

//  возвращающий число по индексу.
    public T get(int index) {
        return nams[index];
    }

    public static void main(String[] args) {
        List<?> box = Arrays.asList(29, 68, 69, 8, 81, 63, 19, 62, 74, 4);
        print(box);
///////////////////////////////////////////
///////// System.out.println();///////////
/////////////////////////////////////////

        int index = (int) (Math.random()*5);  //*box.length()
        System.out.println("Значение елемента "+(index+1)+" равно "+box.get(index));//возвращающий число по индексу.

//  System.out.println("Размер "+box.length());  возвращает текущее количество элементов.
//  System.out.println("Среднее значение " +box.average()); // подсчет среднего арифметического среди элементов массива.
//  System.out.println("Сумма: "+box.sum());   // сумма всех элементов массива.
//  System.out.println("Максимум "+box.max());  // - максимальный элемент массива.
}







    private static void print(List<?> list) {
        for (Object obj: list) {
            System.out.print(obj + ". ");
        }
    }

}