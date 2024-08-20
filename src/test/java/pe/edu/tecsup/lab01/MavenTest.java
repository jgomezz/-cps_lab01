package pe.edu.tecsup.lab01;

import static org.junit.jupiter.api.Assertions.*;

class MavenTest {

    @org.junit.jupiter.api.Test
    void reverseString() {

        Maven app = new Maven();
        final String EXPECTED = "!aloH";
        String actual = app.reverseString("Hola!");
        //validate
        assertEquals(EXPECTED,actual);
    }

}