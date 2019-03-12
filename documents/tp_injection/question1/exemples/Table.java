
package question1.exemples;

import java.util.Collection;

public class Table<T>{
  private Collection<T> liste;
  private int capacite;
  
  public Table(){}
  public void setListe(Collection<T> liste){
    this.liste = liste;
  }
  public void setCapacite(int capacite){
    this.capacite = capacite;
  }
  public void ajouter(T t){
    if(liste.size()==capacite) throw new RuntimeException("capacity reached");
    liste.add(t);
  }
  public int taille(){
      return liste.size();
  }
  public String toString(){
    return liste.toString();
  }
}
