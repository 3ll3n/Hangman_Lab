public class User{
  private int lives;

  public User(){
    this.lives = 6;
  }

  public int getLives(){
    return this.lives;
  }

  public void loseLife(){
    this.lives -= 1;
  }
}