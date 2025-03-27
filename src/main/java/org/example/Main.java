package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int option;
        String title;
        int index;

        Biblio biblio = new Biblio();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to your biblio!!");

        do{
            option = BiblioMenu.start();

            switch (option){
                case 1:
                    System.out.println("Insert the title of the book");
                    title = scanner.nextLine();
                    BiblioManagement.addBook(biblio , new Book(title));
                    break;
                case 2:
                    BiblioManagement.showBookList(biblio);
                    break;
                case 3:
                    try{
                        System.out.println("What position do you want to get?");
                        index = scanner.nextInt();
                        scanner.nextLine();
                        BiblioManagement.showBookByIndex(biblio , index);
                    }catch(IndexOutOfBoundsException e){
                        System.out.println("Invalid position");
                    }
                    break;
                case 4:
                    try{
                        System.out.println("Insert the title of the book");
                        title = scanner.nextLine();
                        System.out.println("Insert the position where it will be");
                        index = scanner.nextInt();
                        scanner.nextLine();
                        BiblioManagement.addBookByPosition(biblio , index , new Book(title));
                    }catch(IndexOutOfBoundsException e){
                        System.out.println("Invalid position");
                    }
                    break;
                case 5:
                    System.out.println("Insert the title of the book");
                    title = scanner.nextLine();
                    BiblioManagement.deleteBook(biblio , title);
                    break;
                case 0:
                    System.out.println("See you again!!");
                    break;
                default:
                    System.out.println("Select an option between 1 - 5");
            }
        }while(option != 0);
    }
}
