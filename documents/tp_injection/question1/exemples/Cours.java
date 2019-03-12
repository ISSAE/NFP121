package question1.exemples;
import java.util.List;

public class Cours{
    private List<Auditeur> inscrits;

    public void setService(ServiceI service){
        this.inscrits = service.lesInscrits();
    }
    
    public List<Auditeur> getInscrits(){
        return inscrits;
    }

}
