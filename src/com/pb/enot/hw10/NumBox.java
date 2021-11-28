package com.pb.enot.hw10;

public class NumBox<T extends Number> {

    private final T[] numbers;

    @SuppressWarnings("unchecked")
    public NumBox(int size) {
        numbers = (T[]) new Number[size];
    }

    public void add(int index, T num) throws ArrayIndexOutOfBoundsException {
        try {

            if (index > numbers.length) {
                throw new ArrayIndexOutOfBoundsException();
            } else numbers[index] = num;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Массив переполнен! Длина массива  " + length());
        }
    }

    public T get(int index) {
        return numbers[index]; //  возвращающий число по индексу.
    }

    public double sum() {
        double sume = 0.0;
        for (T i : numbers) {
            if (i == null) {
                sume += 0;
            } else sume += i.doubleValue();
        }
        return sume;
    }

    public T max() {
        T maX = numbers[0];
        for (T number : numbers) {
            if (number.doubleValue() > maX.doubleValue()) {
                maX = number;
            }
        }
        return maX;
    }

    public double average() {
        return (sum() / length());
    }

    public double length() {
        double leng = 0;
        leng = numbers.length;
        return leng;
    }

}