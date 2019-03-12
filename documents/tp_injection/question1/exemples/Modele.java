package question1.exemples;


public class Modele{
  private Vue vue;
  public void setVue(Vue v){
    this.vue = v;
  }
  public void change(){
    vue.update();
  }
}
