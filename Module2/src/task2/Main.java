package task2;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    static List<Book> listOfBooks = createBooks();
    static List<Student> listOfStudents = createStudents();


    public static void main(String[] args){
        distributeBooks();

        listOfStudents.stream()
                .peek(x -> System.out.println("Студент " + x.toString()))
                .flatMap(x -> x.getBooks().stream())
                .sorted(Comparator.comparingInt(Book::getPages))
                .distinct()
                .filter(b -> b.getYear() > 2000)
                .limit(3)
                .peek(x -> System.out.println("Год " + x.getYear()))
                .collect(Collectors.toList()).stream()
                .findAny()
                .ifPresentOrElse(b -> System.out.println("Год выпуска найденной книги " + b.getYear()),
                        () -> System.out.println("Книга отсутствует"));
    }

    public static void distributeBooks(){
        for (int i: new int[] {0, 1, 2, 3, 4})
            listOfStudents.get(0).getBooks().add(listOfBooks.get(i));
        for (int i: new int[] {12, 8, 5, 6, 2})
            listOfStudents.get(1).getBooks().add(listOfBooks.get(i));
        for (int i: new int[] {1, 7, 2, 9, 10})
            listOfStudents.get(2).getBooks().add(listOfBooks.get(i));
        for (int i: new int[] {5, 6, 11, 4, 8})
            listOfStudents.get(3).getBooks().add(listOfBooks.get(i));
        for (int i: new int[] {3, 4, 5, 10, 11})
            listOfStudents.get(4).getBooks().add(listOfBooks.get(i));
    }

    public static List<Book> createBooks() {
        return (List<Book>) new LinkedList(Arrays.asList(
                new Book("1984", (short) 1949, 328),
                new Book("Структура научных революций", (short) 1962, 264),
                new Book("Геном", (short) 1999, 464),
                new Book("Чтение и перевод английской научно-технической литературы", (short) 2002, 384),
                new Book("Антропология", (short) 2005, 400),
                new Book("Основы программиования на языке С++. Часть 1", (short) 2008, 100),
                new Book("Основы программиования на языке С++. Часть 2", (short) 2009, 100),
                new Book("Объектно-ориентированное мышление", (short) 2014, 304),
                new Book("Мир как воля и представление", (short) 1818, 736),
                new Book("Простаки за границей, или Путь новых паломников", (short) 1869, 580),
                new Book("Путешествие в Стамбул", (short) 1985, 30),
                new Book( "Биология", (short) 2008, 1440),
                new Book("Почему одни страны богатые, а другие бедные", (short) 2012, 544)));  // 12
    }

    public static List<Student> createStudents(){
        Student std1 = new Student("Василий");
        Student std2 = new Student("Валерий");
        Student std3 = new Student("Александра");
        Student std4 = new Student("Виталий");
        Student std5 = new Student("Семён");
        List<Student> list = new ArrayList(Arrays.asList(std1, std2, std3, std4, std5));
        return list;
    }
}
