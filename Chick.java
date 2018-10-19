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
	public Chick()
	{
		if (Math.random()*1<0.5){
			x =  mySound;
		}
		else{
			 z = mySound;
		}

	}
	public String getSound(){return mySound;}
	public String getType(){return myType;}
}
