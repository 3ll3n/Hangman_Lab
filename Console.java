import java.util.Scanner;

public class Console{
  Scanner sc;
  String data;
  User user;
  String guess;
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
    System.out.println("Guess a letter");
    sc = new Scanner(System.in);
    guess = sc.nextLine();
    System.out.println(data);
    System.out.println(guess); 
  
    System.out.println(game.checkLetterInWord(guess));

  }
}