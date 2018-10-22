class NamedCow extends Cow
{
	private String myName;
	public NamedCow(String x, String y, String z)
	{
		myType = x;
		myName = y;
		mySound = z;
	}
	public String getName(){return myName;}
}