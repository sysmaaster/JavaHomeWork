package com.pb.enot.hw5;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Приключения" , "Иванов И. И.",2000);
        Book book2 = new Book("Энциклопедия ","Гусев К. В.",2010 );
        Book book3 = new Book("Словарь ","Сидоров А. В",1980 );
        Book book4 = new Book("Пофигизм","Енот О. В.",1999);
        Reader reader1 = new Reader("К. Р. Гончаров",1,"Гриффиндор","29-04-90","09794092");
        Reader reader2 = new Reader("Д. Т. Румянцев",2,"Пуффендуй","09-05-84","09794092");
        Reader reader3 = new Reader("М. А. Попова",3,"Когтевран","20-10-88", "09794092");
        Reader reader4 = new Reader("М. C. Петров",4,"Слизерин","12-01-89","09794092");


        System.out.println(reader1.getNumber());
         book1.takeBook(reader2.getFio(),5);
        System.out.println();

    }
}
