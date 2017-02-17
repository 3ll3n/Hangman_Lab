import java.util.Scanner;

public class Console{
  Scanner sc;
  String data;
  User user;
  char letter;
  Game game;

  public void start(){
    System.out.println("Please enter the word: ");
    sc = new Scanner(System.in);
    data = sc.nextLine();
    System.out.print("\033[H\033[2J");
    System.out.flush();
    Word hiddenWord = new Word(data);
    System.out.println(hiddenWord.hide());
    // sc.close();

    user = new User();
    game = new Game(user, data); 

    while (game.correctGuess.size() < data.length()){
    System.out.println("Guess a letter");
    sc = new Scanner(System.in);
    letter = sc.next().charAt(0);
    if(game.checkLetterInGuesses(letter)){
      game.checkLetterInWord(letter);
    }
   
  }
    System.out.println("The word is: " + data);
}
}