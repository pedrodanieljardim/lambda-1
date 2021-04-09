package com.br.pedro.lambda;

import com.br.pedro.lambda.entities.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Book> bookList = new ArrayList<>();

        bookList.add(new Book(1, "Livro 1", "Autor 1", 100.00));
        bookList.add(new Book(2, "Livro 2", "Autor 2", 200.00));
        bookList.add(new Book(3, "Livro 3", "Autor 3", 49.99));
        bookList.add(new Book(4, "Livro 4", "Autor 4", 21.00));

        List<Book> filterList1 = new ArrayList<>();
        filterList1 = bookList.stream().filter(book -> book.getId() < 3).collect(Collectors.toList());

        System.out.println("FilterList 1 = ");
        filterList1.forEach(consumer -> {
            System.out.println(consumer.showAttributes());
        });

        List<Book> filterList2 = new ArrayList<>();
        filterList2 = bookList.stream().filter(book -> book.getPrice() < 200).collect(Collectors.toList());

        System.out.println("FilterList 2 = ");
        filterList2.forEach(consumer -> {
            System.out.println(consumer.showAttributes());
        });

        List<Book> agregateList = new ArrayList<>();
        agregateList = bookList.stream().map(book -> { return new Book(book.getId(), book.getName(), book.getAuthor(), book.getPrice() * 2);}).collect(Collectors.toList());

        System.out.println("AgregateList 1 = ");
        agregateList.forEach(consumer -> {
            System.out.println(consumer.showAttributes());
        });

        List<String> agregateList2 = new ArrayList<>();
        agregateList2 = bookList.stream().map(Book::getName).collect(Collectors.toList());

        System.out.println("AgregateList 2 = ");
        agregateList2.forEach(consumer -> {
            System.out.println(consumer.toString());
        });

        bookList.stream().filter(book -> book.getName().contains("1")).forEach(book -> {
            System.out.println(book.showAttributes());
        });

    }
}
