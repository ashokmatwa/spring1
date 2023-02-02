package com.example.test;

import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    Repository repository;
    public void addBook(Book book){
        repository.addBook(book);
    }

    public void addAuthor(Author author){
       repository.addAuthor(author);
    }

    public int findMaxPagesBook(){
        return repository.findMaxPagesBook();
    }

    public String highestNofPagesByAuthor(){
        return repository.highestNofPagesByAuthor();
    }

    public void updateBook(String name, int pages){
        repository.updateBook(name, pages);
    }
}
