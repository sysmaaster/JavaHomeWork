package com.pb.enot.hw5;

public class Book {
    private String bookNames;
    private String bookAuthor;
    private int dateBy;

    public Book(){}

    /**
     * @param bookNames Назва книги
     * @param bookAuthor Автор Книги
     * @param dateBy Год издания
     */
    public Book (String bookNames,String bookAuthor,int dateBy)
    {
        this.bookNames = bookNames;
        this.bookAuthor = bookAuthor;
        this.dateBy = dateBy;
    }


    public void setBookNames(String names) {
        this.bookNames = names;
    }
    public void setBookAuthor(String author) {
        this.bookAuthor = author;
    }
    public void setDateBy(int dateBy) {
        this.dateBy = dateBy;
    }

    public String getBookNames() {
        return bookNames;
    }
    public String getBookAuthor() {
        return bookAuthor;
    }
    public int getDateBy() {
        return dateBy;
    }


    /**
     * Взять Книгу
     * @param names  назва книги
     */
    public void takeBook(String names, int n) {
        System.out.println("[ " + names + " взял " + n + " книг ]");
    }
    public void takeBook( String names, String... author) {
        System.out.print("[ " + names + " взял книги :");
        for (String autors : author) {
            System.out.print(autors + ", ");
        }System.out.println(" ]");
    }

    /**
     * Вернут Книгу
     * @param names  назва книги
     */
    public void returnBook(String names, int n) {
        System.out.println("[ " + names + " вернул " + n + " книги ]");
    }


    /**
     * Вернут Книгу
     * @param names  назва книги
     * @param author Автор
     */
    public void returnBook(String names, String... author) {

        System.out.println("[ " + names + " вернул книги:");
        for (String autors : author) {
            System.out.print(autors);
        }
        System.out.print(" ]");
    }


}
