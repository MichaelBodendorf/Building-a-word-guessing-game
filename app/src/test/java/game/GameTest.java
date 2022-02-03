package game;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
import org.junit.Test;

public class GameTest {
  @Test public void testGetsWordToGuess() {
    // Game game = new Game("MAKERS");
    WordChooser mockedWordChooser = mock(WordChooser.class);
    when(mockedWordChooser.getRandomWordFromDictionary()).thenReturn("MAKERS");
    Game game = new Game(mockedWordChooser);

    assertEquals("M_____", game.getWordToGuess());
  }
  @Test public void testRemainingAttempts() {
    WordChooser mockedWordChooser = mock(WordChooser.class);
    when(mockedWordChooser.getRandomWordFromDictionary()).thenReturn("MAKERS");
    Game game = new Game(mockedWordChooser);

    assertEquals(Integer.valueOf(10), game.getRemainingAttempts());
  } 

}
