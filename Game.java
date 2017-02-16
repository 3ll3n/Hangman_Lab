public class Game{

  private User user;
  private String word;

  public Game(User user, String word){
    this.user = user;
    this.word = word;
  }

  public int checkLetterInWord(String letter){
    return word.indexOf(letter);
  }
  //   for (char character : word.toCharArray()){
  //     if character.equals(letter){

  //     }
  //   }
  // }
}