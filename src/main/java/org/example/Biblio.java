package org.example;

import java.util.ArrayList;
import java.util.List;

public class Biblio {

    private List<Book> bookList;

    public Biblio(){
        this.bookList = new ArrayList<>();
    }

    public List<Book> getBookList() {
        return this.bookList;
    }
}
