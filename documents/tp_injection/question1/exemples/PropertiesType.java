package question1.exemples;



public class PropertiesType{
    private byte b;
    private short s;
    private int i;
    private long l;
    private float f;
    private double d;
    private boolean bool;
    private char c;
    private Void v;
    
    public void setB(byte b){this.b = b;}
    public void setB(Byte b){this.b = b;}
    public byte getB(){return this.b;}
    
    public void setI(int i){this.i = i;}
    public void setI(Integer i){this.i = i;}
    public int getI(){return this.i;}
    
    public void setS(short s){this.s = s;}
    public void setS(Short s){this.s = s;}
    public short getS(){return this.s;}
    
    public void setL(long l){this.l = l;}
    public void setL(Long l){this.l = l;}
    public long getL(){return this.l;}
    
    public void setF(float f){this.f = f;}
    public void setF(Float f){this.f = f;}
    public float getF(){return this.f;}
    
    public void setD(double d){this.d = d;}
    public void setD(Double d){this.d = d;}
    public double getD(){return this.d;}
    
    public void setBool(boolean bool){this.bool = bool;}
    public void setBool(Boolean bool){this.bool = bool;}
    public boolean getBool(){return this.bool;}
    
    public void setC(char c){ this.c = c;}
    public void setC(Character c){ this.c = c;}
    public char getC(){return this.c;}
    
    public void setV(Void v){this.v = v;}
    public Void getV(){ return v;}
    
    public int calcul(){
      int r =(bool?1:0);
      return r+(int)d+(int)f+(int)l+s+i+b;
    }
    
    private Table[] tables;
    public <T> void setTables(final Table<T>[] tables){
        this.tables = tables;
    }
    public <T> Table<T>[] getTables(){
        return this.tables;
    }
    
    private int[] tab;
    public void setTab(final int[] tab){
        this.tab = tab;
    }
    public int[] getTab(){
        return this.tab;
    }
    private Class<?> classe;
    public void setClasse(Class<?> classe) throws Exception{
       this.classe = classe;
       //System.out.println(this.classe.getClass().getName());
    }
    public Class<?> getClasse(){
        return this.classe;
    }
    public String toString(){
      return calcul() + Character.toString(getC());
    }
}