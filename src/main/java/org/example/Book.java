package org.example;

import java.util.Objects;

public class Book {

    private String title;

    public Book(String title){
        this.title = title;
    }

    public String getTitle(){
        return this.title;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj == null || getClass() != obj.getClass()){
            return false;
        }
        Book book = (Book) obj;
        return this.getTitle().equalsIgnoreCase(book.title);
    }

    @Override
    public int hashCode() {
        return title.toLowerCase().hashCode();
    }

    @Override
    public String toString(){
        return title;
    }
}
