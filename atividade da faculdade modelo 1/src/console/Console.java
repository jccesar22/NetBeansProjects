package console;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Console {
	  public static String read (String str) {
		  InputStream in = System.in;
		  InputStreamReader is = new InputStreamReader (in);
		  BufferedReader console = new BufferedReader (is);
		  System.out.print (str);
		  String name = null;
		  try {
		  name = console.readLine ();
		  }
		  catch (IOException e) {
			  System.out.println("erro");
		  }
		   return name;
		   }
}