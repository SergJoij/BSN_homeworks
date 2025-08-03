package task2;

import java.util.HashSet;

public class Book {
    private String name;
    private int pages;
    private HashSet<String> authors = new HashSet<>();
    private short yearOfPublication;

    public Book(String name, short year, int pages){
        this.name = name;
        this.yearOfPublication = year;
        this.pages = pages;
    }

    public int getPages() {
        return this.pages;
    }

    public HashSet<String> getAuthors(){
        return this.authors;
    }

    public short getYear(){
        return this.yearOfPublication;
    }

    public String getName(){
        return this.name;
    }
}
