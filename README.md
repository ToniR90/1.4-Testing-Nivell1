Library Book Management System 📚
📄 Description
This project is designed to manage a collection of books in a library. The implementation enables the following functionalities:

The program ensures that book titles remain unique and that the list is maintained in alphabetical order after any addition or removal of books. The implementation is thoroughly tested using JUnit to verify its correctness and robustness.

💻 Technologies Used

- Java
- JUnit 5 for testing


📋 Requirements

-Java JDK 11 or higher
-A Java IDE such as IntelliJ or Eclipse


🛠️ Installation

Clone this repositori: 


🚀 Features

-Add books to the library.
-Retrieve and display the entire list of books.
-Obtain the title of a book by its position.
-Insert a book into a specific position.
-Remove books by their title.
-Automatically maintain alphabetical order of the book list.


✅ Testing
This project is verified using JUnit 5, with the following test cases implemented:
1. Non-null book list: Ensures that the book list is not null upon initialization.
2. Correct list size: Confirms the list size after adding multiple books.
3. Book retrieval by position: Verifies that a book can be accessed correctly by its position.
4. No duplicate titles: Ensures that duplicate titles cannot be added to the list.
5. Retrieve book title by position: Confirms that the correct title can be retrieved from a given position.
6. List modification: Verifies that adding and removing books correctly updates the list.
7. Alphabetical order: Ensures that the list remains alphabetically sorted after any addition or removal.


