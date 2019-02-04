---
titre: id&eacute;e java imp&eacute;ratif ED00
---

<table border cellpading="2">
<tr>
<td width="25%"><BIG><BIG><BIG><BIG>a<SUP>b</SUP></BIG></BIG></BIG></BIG> :
      &nbsp;<BIG>application Java de l'exponentiation de 2 entiers 'a' et 'b' quand on ne connaît que les op&eacute;rateurs * et &#171;-1&#187;.</BIG></TD>
<td>

  ```java  
  public class ExponentiationDe2Entiers{

  public static void main(String [] args){
    int a = 2;int b = 3;
    if (args.length == 2){
      a = Integer.parseInt(args[0]);
      b = Integer.parseInt(args[1]);
    }
    //Assert.setVerbose(true);
    System.out.println( a + " expo " + b + " = " + exponentiation(a,b));
  }

  public static int exponentiation(int a, int b){
    int s = 0; int i = 0;
    int r = b; 
    int power = 1;
    while(r > 0){
      r = r - 1;
      power = power * a;
    }
    return power;
  }
}
```
</TD></TR>
<tr>
<td><BIG>Construire l'application Java de la recherche de l'indice de la
      plus grande valeur dans un tableau &nbsp;de n entiers naturels (&gt;=0) .</BIG></TD>
<td>

```java
public class TableauIMax{

  public static void main(String [] args){

    Assert.setVerbose(true);
    //int[] t = { 23,56,89,54,32,1,9,7,6};
    int[] t ={2,5,9}; 
    System.out.println("le max de t est en "  + max(t));
  }

  private static int imax;
  private static int i;
  public static int max(final int[] tab){
    i    = 0; 
    imax = 0;
    int n = tab.length-1;
    while(i < n){
      int k1 = n-i;

      i++;
      if(tab[i] &gt; tab[imax]) imax = i;

    }        
    return imax;
  }
}
```
</td></tr>
</table>

[retour](.)

