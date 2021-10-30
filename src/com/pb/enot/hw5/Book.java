package com.pb.enot.hw5;

public class Book {
    private String bookNames;
    private String bookAuthor;
    private int dateBy;

    public Book(){}

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

    public void takeBook(String names, int n) {
        System.out.println(names + " взял " + n + " книги ]");
    }
    public void takeBook(String names, String... author) {

        System.out.println(names + " взял книги :");
        for (String autors : author) {
            System.out.println(autors);
        }
    }
//    public void takeBook(String names, String... dateBy) {
//
//        System.out.println(names + " // : ");
//        for (String dateB : dateBy) {
//            System.out.println(dateB);
//        }
//    }

    public void returnBook(String names, int n) {
        System.out.println("[ " + names + " вернул " + n + " книги ]");
    }
    public void returnBook(String names, String... author) {

        System.out.println("[ " + names + " вернул книги:");
        for (String autors : author) {
            System.out.println(autors);
        }
        System.out.println(" ]");
    }


}
