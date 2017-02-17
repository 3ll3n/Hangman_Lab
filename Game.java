import java.util.ArrayList;

public class Game{

  private User user;
  private String word;
  public ArrayList<Character> correctGuess; 

  public Game(User user, String word){
    this.user = user;
    this.word = word;
    this.correctGuess = new ArrayList<Character>();
  }

  public void checkLetterInWord(char letter){
    int position = 1;
    for (char c : word.toCharArray()) {
      if(c == letter){
        correctGuess.add(c);
        System.out.println("Letter found at position: " + position);
      }
      position++;
    }
  }
  public boolean checkLetterInGuesses(char letter){
    if(correctGuess.indexOf(letter) == -1){
      return true;
    }
    return false;
  }
}