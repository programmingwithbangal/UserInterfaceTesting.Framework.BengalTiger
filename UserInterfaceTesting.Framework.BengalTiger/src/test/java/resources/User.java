package resources;

public class User 
{
	private String FirstName;

    private String LastName;

    private Gender GenderType;
    
	public User() 
	{
	}

    public User(String firstName, String lastName) 
    {
		FirstName = firstName;
		LastName = lastName;
	}

    public User(String firstName, String lastName, Gender genderType) 
    {
		FirstName = firstName;
		LastName = lastName;
		GenderType = genderType;
	}

	public String getFirstName() 
	{
		return FirstName;
	}

	public String getLastName() 
	{
		return LastName;
	}

	public Gender getGenderType() 
	{
		return GenderType;
	}

	public void setGenderType(Gender genderType) 
	{
		GenderType = genderType;
	}
}