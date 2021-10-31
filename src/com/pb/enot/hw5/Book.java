package com.pb.enot.hw5;

public class Book {
    private String bookNames;
    private String bookAuthor;
    private int dateBy;

    public Book() {
    }

    /**
     * @param bookNames  Назва книги
     * @param bookAuthor Автор Книги
     * @param dateBy     Год издания
     */
    public Book(String bookNames, String bookAuthor, int dateBy) {
        this.bookNames = bookNames;
        this.bookAuthor = bookAuthor;
        this.dateBy = dateBy;
    }

    public String getBookNames() {
        return bookNames;
    }
    public String getBookAuthor() { return bookAuthor;  }
    public int getDateBy() {
        return dateBy;
    }
    /**
     * Взять Книгу
     * @param n число книг
     * @param names назва книги
     */
    public void takeBook(String names, int n) {
        System.out.println("[ " + names + " взял " + n + " книг ]");
    }

    /**
     * @param names назва книги
     * @param author книги
     */
    public void takeBook(String names, String... author) {
        System.out.print("[ " + names + " взял книги: ");
        for (String autors : author) {
            System.out.print(autors + ", ");
        }
        System.out.println(" ]");
    }
    public void takeBook(Book... book) {
        System.out.println("[ проводим інвентаризацію:  ");
        for (Book autors : book) {
            System.out.print(autors + ",");
        }
        System.out.println(" ]");
    }
    /**
     * Вернуl Книгу
     * @param n      кількість повернутих книг
     * @param names  назва книги
     */
    public void returnBook(String names, int n) {
        System.out.println("[" + names + " Вернул " + n + " книг]");
    }

    /**
     * Вернуl Книгу
     * @param names  назва книги, , ,
     * @param author Автор
     */
    public void returnBook(String names, String... author) {
        System.out.print("[ " + names + " Вернул книги: ");
        for (String autors : author) {
            System.out.print(autors + ", ");
        }
        System.out.println(" ]");
    }
    public void returnBook(Book... book) {
        System.out.println("[ проводим інвентаризацію:  ");
        for (Book autors : book) {
            System.out.print(autors + ",");
        }
        System.out.println(" ]");
    }
    /**
     * @return  назва книги,Автор,Год випуску
     */
    public String getInfo() {
        String info = "=> "+getBookNames()+" ("+getBookAuthor()+" "+getDateBy()+") ";
return info;
    }
}
