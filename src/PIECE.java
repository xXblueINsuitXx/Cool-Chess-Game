
public abstract class PIECE 
{

	/* Definition von zwei Aufzählungstypen (enumeration types) */
	protected String color;
	protected String kind;	
	
	/* Attribut-Definitionen */
	
	protected TUPEL pos;
	protected int number;
	protected PIECE sf;
	
	public PIECE (KIND kindNeu, COLOR colorNeu, int xNeu, int yNeu)
	{
		kind = kindNeu;
		color = colorNeu;
		pos = new TUPEL(xNeu, yNeu);
		
	}
	
	
	public COLOR getColor()
	{
		return color;
	}
	
	public KIND getKind()
	{
		return kind;
	}
	
	public int getNumber()
	{
		return number;
	}
	
	public TUPEL getPos()
	{
		return pos;
	}
}
