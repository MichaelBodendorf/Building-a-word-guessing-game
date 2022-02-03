package game;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WordChooserTest {
  @Test public void getRandomWordFromDictionary() {
    WordChooser game = new WordChooser();
    assertEquals(false, game.getRandomWordFromDictionary().isEmpty());
  }
  
}
