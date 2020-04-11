package happynewproject;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashTest {

    @Test public void create_by_text() {
        assertEquals(new Cash(5), new Cash("€5"));
    }

}