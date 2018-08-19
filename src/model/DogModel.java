package model;

public class DogModel extends Model
{
	public String name;
	public String breed;
	public int age;
	
	public DogModel(String name, String breed, int age)
	{
		this.name = name;
		this.breed = breed;
		this.age = age;
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
			case("breed"):
				return this.breed;
			case("age"):
				return Integer.toString(this.age);
			default:
				break;
		}
		
		return "";
	}
}
