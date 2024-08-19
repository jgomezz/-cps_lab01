package pe.edu.tecsup.lab01;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void reverseString() {

        Main app = new Main();
        final String EXPECTED = "!aloH";
        String actual = app.reverseString("Hola!");
        //validate
        assertEquals(EXPECTED,actual);
    }

}