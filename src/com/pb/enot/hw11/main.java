package com.pb.enot.hw11;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;
import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

public class main {
    public static void main(String[] args) throws Exception {

        List<PhoneBook> sim1 = Collections.singletonList(
                new PhoneBook("Jack", "1233456", LocalDate.of(2000, 5, 2),"street")

        );
        ObjectMapper mapper = new ObjectMapper();
        // pretty printing (json с отступами)


        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        // для работы с полями типа LocalDate
        SimpleModule module = new SimpleModule();
        module.addSerializer(LocalDate.class, new LocalDateSerializer());
        module.addDeserializer(LocalDate.class, new LocalDateDeserializer());
        mapper.registerModule(module);

        String personsJson = mapper.writeValueAsString(sim1);
        System.out.println(personsJson);

        int n = 2;
        System.out.println("...Меню...");
        System.out.println(
                " 1 добавление элемента" +
                " 2 удаление элемента" +
                " 3 поиск элементов" +
                " 4 вывод всех записей с сортировкой"  +
                " 5 редактирование элемента" +
                " 6 запись в файл всех данных" +
                " 7 загрузка из файла всех данных");

        do {

            switch (n) {
                case 1:            // добавление элемента
                    System.out.println(1);
                    break;
                case 2:           // удаление элемента
                    System.out.println(2);
                    break;
                case 3:           // поиск элементов
                    System.out.println(3);
                    break;
                case 4:           // вывод всех записей с сортировкой по указанному полю
                    System.out.println(4);

                    break;
                case 5:           // редактирование элемента
                    System.out.println(5);

                    break;
                case 6:           // запись в файл всех данных
                    System.out.println(6);

                    break;
                case 7:           // загрузка из файла всех данных
                    System.out.println(7);

                    break;
                case 0:          // qex
                    System.out.println("exit! ");
                    n = 0;
                    break;
            }
        }while (n == 0);



    }

}
