import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

import model.DogModel;
import model.StoreModel;

public class Main 
{
	public static void main(String[] args) throws IOException
	{
		// DogModel model = new DogModel("fido", "pomeranian", 1);
		
		ArrayList<String> strings = new ArrayList<String>();
		
		for (int i = 0; i < 100; i++)
		{
			strings.add(String.format("Person number %d", i));
		}
		
		
		StoreModel model = new StoreModel("MyStore", strings);
		String out = parser.Compiler.Compile("Template.html", model);
		  
  		System.out.println( out );
	}
}
