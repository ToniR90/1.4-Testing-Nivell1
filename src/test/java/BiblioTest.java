import org.example.Biblio;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BiblioTest {

    @Test
    public void testBookListIsNotNull() {
        Biblio biblio = new Biblio();
        assertNotNull(biblio.getBookList(), "The book list should not be null.");
    }
}