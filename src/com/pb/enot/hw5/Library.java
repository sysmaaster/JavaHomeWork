package com.pb.enot.hw5;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Приключения" , "Иванов И. И.",2000);
        Book book2 = new Book("Энциклопедия ","Гусев К. В.",2010 );
        Book book3 = new Book("Словарь ","Сидоров А. В",1980 );
        Book book4 = new Book("Пофигизм","Енот О. В.",1999);
        Reader usr1 = new Reader("Гончаров К. Р.",1,"Гриффиндор","29-04-90","09794092");
        Reader usr2 = new Reader("Румянцев Д. Т.",2,"Пуффендуй","09-05-84","09794092");
        Reader usr3 = new Reader("Попова М. А.",3,"Когтевран","20-10-88", "09794092");
        Reader usr4 = new Reader("Петров М. C.",4,"Слизерин","12-01-89","09794092");



        book2.takeBook( usr2.getFio(),2);

        book2.takeBook( usr1.getFio(),book3.getBookAuthor(),book4.getBookAuthor(),book1.getBookAuthor());


    }
}
