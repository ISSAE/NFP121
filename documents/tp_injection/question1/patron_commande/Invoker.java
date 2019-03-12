package question1.patron_commande;


public class Invoker{
  private Command cmd;
  
  public void setCmd(Command cmd){
    this.cmd = cmd;
  }
  
  public void on(){
    cmd.execute();
  }
  
  public void off(){
    cmd.undo();
  }
  
}
