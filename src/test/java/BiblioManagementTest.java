import org.example.Biblio;
import org.example.BiblioManagement;
import org.example.Book;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BiblioManagementTest {

    @Test
    public void testBookListSizeAfterAddingBooks() {
        Biblio biblio = new Biblio();
        BiblioManagement.addBook(biblio, new Book("LOTR: The Fellowship of the Ring"));
        BiblioManagement.addBook(biblio, new Book("The Hobbit"));
        BiblioManagement.addBook(biblio, new Book("Sons of Gondor"));

        assertEquals(3, biblio.getBookList().size(), "The book list size should be 3.");
    }

    @Test
    public void testGetBookByIndex() {
        Biblio biblio = new Biblio();
        BiblioManagement.addBook(biblio, new Book("LOTR: The Fellowship of the Ring"));
        BiblioManagement.addBook(biblio, new Book("The Hobbit"));

        Book book = BiblioManagement.showBookByIndex(biblio, 1);
        assertEquals("The Hobbit", book.getTitle(), "The book at index 1 should be 'The Hobbit'.");
    }

    @Test
    public void testNoDuplicate() {
        Biblio biblio = new Biblio();
        BiblioManagement.addBook(biblio, new Book("1984"));
        BiblioManagement.addBook(biblio, new Book("1984"));

        assertEquals(1, biblio.getBookList().size(), "Duplicate titles should not be added.");
    }

    @Test
    public void testGetBookTitleByIndex() {
        Biblio biblio = new Biblio();
        BiblioManagement.addBook(biblio, new Book("LOTR"));

        Book book = BiblioManagement.showBookByIndex(biblio, 0);
        assertEquals("LOTR", book.getTitle(), "The title at index 0 should be 'LOTR'.");
    }

    @Test
    public void testReducesSizeAfterDeletion() {
        Biblio biblio = new Biblio();
        BiblioManagement.addBook(biblio, new Book("LOTR"));
        BiblioManagement.addBook(biblio, new Book("Saw"));

        BiblioManagement.deleteBook(biblio, "Saw");

        assertEquals(1, biblio.getBookList().size(), "The book list size should be reduced after deleting a book.");
    }

    @Test
    public void testBookListOrdered() {
        Biblio biblio = new Biblio();
        BiblioManagement.addBook(biblio, new Book("Troya"));
        BiblioManagement.addBook(biblio, new Book("1984"));
        BiblioManagement.addBook(biblio, new Book("LOTR"));

        assertEquals("1984", biblio.getBookList().get(0).getTitle(), "The first book should be '1984'.");
        assertEquals("LOTR", biblio.getBookList().get(1).getTitle(), "The second book should be 'LOTR'.");
        assertEquals("Troya", biblio.getBookList().get(2).getTitle(), "The third book should be 'Troya'.");
    }
}