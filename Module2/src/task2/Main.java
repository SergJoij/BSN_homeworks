package task2;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    static List<Book> listOfBooks = createBooks();
    static List<Student> listOfStudents = createStudents();


    public static void main(String[] args){
        distributeBooks();

        listOfStudents.stream()
                .peek(x -> System.out.println("������� " + x.toString()))
                .flatMap(x -> x.getBooks().stream())
                .sorted(Comparator.comparingInt(Book::getPages))
                .distinct()
                .filter(b -> b.getYear() > 2000)
                .limit(3)
                .peek(x -> System.out.println("��� " + x.getYear()))
                .collect(Collectors.toList()).stream()
                .findAny()
                .ifPresentOrElse(b -> System.out.println("��� ������� ��������� ����� " + b.getYear()),
                        () -> System.out.println("����� �����������"));
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
                new Book("��������� ������� ���������", (short) 1962, 264),
                new Book("�����", (short) 1999, 464),
                new Book("������ � ������� ���������� ������-����������� ����������", (short) 2002, 384),
                new Book("������������", (short) 2005, 400),
                new Book("������ ��������������� �� ����� �++. ����� 1", (short) 2008, 100),
                new Book("������ ��������������� �� ����� �++. ����� 2", (short) 2009, 100),
                new Book("��������-��������������� ��������", (short) 2014, 304),
                new Book("��� ��� ���� � �������������", (short) 1818, 736),
                new Book("�������� �� ��������, ��� ���� ����� ����������", (short) 1869, 580),
                new Book("����������� � �������", (short) 1985, 30),
                new Book( "��������", (short) 2008, 1440),
                new Book("������ ���� ������ �������, � ������ ������", (short) 2012, 544)));  // 12
    }

    public static List<Student> createStudents(){
        Student std1 = new Student("�������");
        Student std2 = new Student("�������");
        Student std3 = new Student("����������");
        Student std4 = new Student("�������");
        Student std5 = new Student("����");
        List<Student> list = new ArrayList(Arrays.asList(std1, std2, std3, std4, std5));
        return list;
    }
}
