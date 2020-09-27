package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book[] library = new Book[4];

        library[0] = new Book("Clean code", 600);
        library[1] = new Book("Core Java", 1200);
        library[2] = new Book("Java. The Complete Reference", 1100);
        library[3] = new Book("Clean Architecture", 700);

        for (Book book : library) {
            System.out.println(book.getName() + " - " + book.getPagesNumber());
        }

        Book temp = library[0];
        library[0] = library[3];
        library[3] = temp;

        System.out.println();
        for (Book book : library) {
            System.out.println(book.getName() + " - " + book.getPagesNumber());
        }

        System.out.println();
        for (Book book : library) {
            if (book.getName().equals("Clean code")) {
                System.out.println(book.getName() + " - " + book.getPagesNumber());
            }
        }

    }
}
