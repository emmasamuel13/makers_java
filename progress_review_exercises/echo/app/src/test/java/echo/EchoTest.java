/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package echo;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class EchoTest {
    @Test public void FirstResponseIsExit() {
        Echo Echo = new Echo();
        ArrayList<String> TextInput = new ArrayList<String>();
        TextInput.add("exit");
        assertEquals("Goodbye", EchoUser(TextInput));
    }
}
