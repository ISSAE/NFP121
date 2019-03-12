package question1.patron_commande;


public interface Command{
  public void execute();
  public void undo();
}
