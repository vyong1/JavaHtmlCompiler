package model;

import java.lang.reflect.*;
import java.util.ArrayList;

/*
 * Superclass for all models
 */
public abstract class Model implements IHtmlConvertible
{	
	public Iterable<String> getPossibleTags()
	{
		Field[] fields = this.getClass().getFields();
		ArrayList<String> tags = new ArrayList<String>();
		
		for (Field field : fields)
		{
			tags.add( String.format("${%s.%s}", this.getClass().getSimpleName() , field.getName()) );
		}
		
		return tags;
	}
}
