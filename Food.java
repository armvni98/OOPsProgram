public class Food 
{
	private String name;
	private int calories;
	
	Food(String a, int b)
	{
		name = a;
		calories = b;
	}
	
	public void setName(String a)
	{
		name = a;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setCalories(int b)
	{
		calories = b;
	}
	public int getCalories()
	{
		return calories;
	}
	
	@Override
	public String toString()
	{
		String str = String.format("Food - name: %10s | calories: %4d", name,calories);
		
		return str;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(obj instanceof Food)
		{
			Food other = (Food) obj;
			if(name == other.name)
			{
				if(calories == other.calories)
				{
					return true;
				}
			}
		}
		return false;
	}

}