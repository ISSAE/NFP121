package question1.exemples;
import java.util.*;

public class ListeEnXML implements  ServiceI{

   public List<Auditeur> lesInscrits(){
     return new java.util.ArrayList<Auditeur>();
    }
    
   public String toString(){
     return this.getClass().getName();
   }
}
