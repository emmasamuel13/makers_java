/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package game;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GameTest {
    @Test public void ShowsFirstLetter() {
        Game game = new Game("MAKERS");
        assertEquals("M-----", game.TakeYourTurn(""));
    }

    @Test public void GuessesMakersSuccessfully() {
        Game game = new Game("MAKERS");
        assertEquals("M-----", game.TakeYourTurn(""));
        assertEquals("MA----", game.TakeYourTurn("A"));
    }
}
