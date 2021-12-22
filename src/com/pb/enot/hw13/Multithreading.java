package com.pb.enot.hw13;

import java.util.LinkedList;

public class Multithreading {
    public static void main(String[] args) throws InterruptedException {
        // Обєкт класу який має producer()
        // і метод consumer().
        final PC pc = new PC();

        // Створімо виробнику поток
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Створімо споживчу поток
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        // Почнім обидва потоки

        t1.start();        t2.start();
        t1.join();         t2.join();
    }
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_CYAN = "\u001B[36m";

     // Цей клас має список, виробник (додає елементи до списку
    // і споживач (вилучає предмети).
    public static class PC {
         // Створити список, яким спільно користуються виробник і споживач
        // Розмір списку 2.
        LinkedList<Integer> list = new LinkedList<>();
        int capacity = 2;

         // Функція виклика потоку виробника
        public void produce() throws InterruptedException {
            int value = 0;
            while (true) {
                synchronized (this) {
                    // Потік виробника чекає, поки список
                    // повний
                    while (list.size() == capacity){
                        wait();
                        System.out.println(ANSI_RED + "Потік споживач чекає"+  ANSI_RESET );
                    }
                    System.out.println(ANSI_GREEN + "Виробник Вnіс -->" + value + ANSI_RESET );
                    // вносим  і виводим  масив
                    list.add(value++);System.out.print(ANSI_CYAN + " масив> " + list + ANSI_RESET + "\n");

                    // Пробудим  споживача  і спати
                    notify();
                    Thread.sleep(1000);
                }
            }
        }
         // Функція виклика потоку виробника
        public void consume() throws InterruptedException {
            while (true) {
                synchronized (this) {
                    // Потік споживача чекає, поки список
                    // пустий
                    while (list.size() == 0) {
                        wait();
                        System.out.println(ANSI_RED + "Потік виробник чекає"+  ANSI_RESET);
                    }
                    //
                    int val = list.removeFirst();
                    System.out.println(ANSI_YELLOW + "Cпоживач купує -->"
                            + val + ANSI_RESET );
                    System.out.print(ANSI_CYAN + " масив> " + list + ANSI_RESET  + "\n");
                    // Пробудим  продюсера  і спати
                    notify();
                    Thread.sleep(1000);
                }
            }
        }
    }
}
