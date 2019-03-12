package question1.exemples;
import java.util.*;

public class ListeEnCSV implements ServiceI{

   public List<Auditeur> lesInscrits(){
     return new java.util.LinkedList<Auditeur>();
    }
    
   public String toString(){
     return this.getClass().getName();
   }
}