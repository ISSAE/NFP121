package container;

import java.io.*;

public class FileSystemJSONApplicationContext extends AbstractApplicationContext{
  private static final boolean T = false; //true; // T comme Trace
   public String getContainerName(){
      return this.getClass().getSimpleName() + " a terminer";
  }
  public FileSystemJSONApplicationContext(InputStream inputStream){
    super();
    try{
      // � compl�ter
      
      
    }catch(Exception e){
      throw new RuntimeException(e.getMessage());
    }
  }
}
