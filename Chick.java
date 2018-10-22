class Chick implements Animal 
{   
	private String myType;
	private String mySound;
	public Chick(String type, String sound)
	{
		myType = type; 
		mySound = sound;
	}
	public Chick() 
	{
		myType = "unknown";
		mySound = "unknown";
	}
	public Chick(String x, String y, String z)
	{
		myType = x;
		if (Math.random()<0.5){
			mySound = y;
		}
		else{
			mySound = z;
		}

	}
	public String getSound(){return mySound;}
	public String getType(){return myType;}
}
