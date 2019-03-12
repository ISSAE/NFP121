package question1.patron_commande;


public class Light implements Receiver{
  private String state="Off";
  
  public void on(){state = "On";}
  public void off(){state = "Off";}
  public String getState(){return state;}
}
