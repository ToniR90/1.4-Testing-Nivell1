package org.example;

import java.util.Comparator;
import java.util.List;

public class BiblioManagement {

public static void addBook(Biblio biblio , Book book){
    List<Book> books = biblio.getBookList();
    if(!books.contains(book)){
        books.add(book);
        System.out.println("The book has been added");
        sortBooks(biblio);
    }
}
public static void sortBooks(Biblio biblio){
    List<Book> books = biblio.getBookList();
    books.sort(Comparator.comparing(Book::getTitle , String.CASE_INSENSITIVE_ORDER));
}
public static void showBookList(Biblio biblio){
    List<Book> books = biblio.getBookList();
    if(books.isEmpty()){
        System.out.println("There are no books in your biblio!!\n");
    }else{
        System.out.println("Book List:");
        for(Book book : books){
            System.out.println(book.getTitle());
        }
    }
}
public static Book showBookByIndex(Biblio biblio , int index){
    List<Book> books = biblio.getBookList();

    if(index >= 0 && index <= books.size()){
        return books.get(index);
    }else{
        throw new IndexOutOfBoundsException("Index not valid");
    }
}
public static void addBookByPosition(Biblio biblio , int index , Book book){
    List<Book> books = biblio.getBookList();
    if(index >= 0 && index <= books.size()){
        books.add(index , book);
    }else{
        throw new IndexOutOfBoundsException("Index not valid");
    }
}
public static void deleteBook(Biblio biblio , String title){
    boolean found = false;
    List<Book> books = biblio.getBookList();

    for(int i = 0 ; i < books.size() ; i++){
        if(books.get(i).getTitle().equalsIgnoreCase(title)){
            books.remove(i);
            found = true;
            break;
        }
    }
    if(found){
        System.out.println("The book has been deleted");
    }else{
        System.out.println("Book not found");
    }
}
}
