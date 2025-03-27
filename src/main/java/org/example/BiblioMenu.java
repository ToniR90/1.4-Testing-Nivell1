package org.example;

import java.util.Scanner;

public class BiblioMenu {

    public static int start(){
        int option = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select an option:\n" +
                "1. Add new book\n" +
                "2. View book list\n" +
                "3. View book by position\n" +
                "4. Add new book on an especific position\n" +
                "5. Delete book by title\n" +
                "0. Exit\n");
        option = scanner.nextInt();
        return option;
    }
}
