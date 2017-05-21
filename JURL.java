// Juan Aguirre 

import java.net.*;
import java.io.*;


public class JURL
{
  public static void main(String[] args)
  {
    String output  = getUrlContents("http://www.123.com/");
    System.out.println(output);
  }

  
private static String getUrlContents(String tu)
  {
    StringBuilder Ucontent = new StringBuilder();

    
    try
    {
      
    
      
	URL ut = new URL(tu);

      
      URLConnection urlConnection = ut.openConnection();

      
      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));

      String Line;

     
      while ((Line = bufferedReader.readLine()) != null)
      {
        Ucontent.append(Line + "\n");
      }
      bufferedReader.close();
    }
    catch(Exception e)
    {
      e.printStackTrace();
    }
    return Ucontent.toString();
  }
}
