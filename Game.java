import java.util.ArrayList;

public class Game{

  private User user;
  private String word;
  private ArrayList<Integer> indexs; 

  public Game(User user, String word){
    this.user = user;
    this.word = word;
    this.indexs = new ArrayList<Integer>();
  }

  public void checkLetterInWord(char letter){
    int position = 1;
    for (char c : word.toCharArray()) {
      if(c == letter){
        System.out.println("Letter found at position: " + position);
      }
      position++;
    }
  }
}