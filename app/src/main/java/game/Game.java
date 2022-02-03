package game;

public class Game {

  private String wordToGuess;
  private Integer remainingAttempts = 10;
  
  public Game(WordChooser mockedWordChooser) {
    this.wordToGuess = mockedWordChooser.getRandomWordFromDictionary();
  }

  public String getWordToGuess() {
    StringBuilder hiddenWord = new StringBuilder(wordToGuess);
    for ( int i = 1; i < wordToGuess.length(); i ++ ) {
      hiddenWord.replace(i, i + 1, "_");
    }
    return hiddenWord.toString();
  }

  public Integer getRemainingAttempts() {
    return remainingAttempts;
  }
  
}
