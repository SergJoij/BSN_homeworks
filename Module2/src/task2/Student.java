package task2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Student {
    private String fullName;
    private List<Book> books = new LinkedList<Book>();

    public Student(String name){
        this.fullName = name;
    }

    public List<Book> getBooks() {
        return this.books;
    }

    public List<String> getBookTitles(){
        List<String> list = new ArrayList<>();
        this.getBooks().stream().forEach(x -> list.add(x.getName()));
        return list;
    }

    public String getFullName(){
        return this.fullName;
    }

    @Override
    public String toString(){
        return this.getFullName();
    }

}
