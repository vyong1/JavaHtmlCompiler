package parser;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

import model.Model;

public class Compiler 
{
	public static String Compile(String filename, Model model)
	{
		String text = "";
		try
		{
			byte[] encoded = Files.readAllBytes(Paths.get(filename));
			text = new String(encoded, Charset.defaultCharset());
		}
		catch (IOException e)
		{
			System.out.println("Error in reading file: " + filename);
		}
		
		Iterable<String> possibleTags = model.getPossibleTags();
		
		for (String tag : possibleTags)
		{
			text = text.replace(tag, model.fieldToHtml(tag));
		}
		
		return text;
	}
}
