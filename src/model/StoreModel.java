package model;

import java.util.ArrayList;

public class StoreModel extends Model
{
	public String name;
	public ArrayList<String> employeeNames;
	
	public StoreModel(String name, ArrayList<String> employeeNames)
	{
		this.name = name;
		this.employeeNames = employeeNames;
	}
	
	@Override
	// TODO - this is a "broken window"
	public String fieldToHtml(String modelTag) 
	{
		// TODO - this is a "broken window"
		String propertyName = modelTag.replace("${" + this.getClass().getSimpleName() + ".", "")
				.replace("}", "");
		
		// TODO - this is a "broken window"
		switch(propertyName)
		{
			case("name"):
				return this.name;
			case("employeeNames"):
				String empHtml = "";
				for (String employeeName : this.employeeNames)
				{
					empHtml += String.format("<button type='button'>%s</button>\n", employeeName);
				}
				return empHtml;
			default:
				break;
		}
		
		return "";
	}
}
