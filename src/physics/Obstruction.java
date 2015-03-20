package physics;

import interfaces.ImmovableObject;

public class Obstruction implements ImmovableObject {

	private double lowerX, higherX;
	private double lowerY, higherY;
	private double lowerZ, higherZ;
	
	public Obstruction(Vector position, double a)
	{
		if(position == null)
		{
			throw new IllegalArgumentException();
		}
		a = a/2;
		
		lowerX = position.getX() - a;
		higherX = position.getX() + a;
		lowerY = position.getY() - a;
		higherY = position.getY() + a;
		lowerZ = position.getZ() - a;
		higherZ = position.getZ() + a;
	}
	
	public Obstruction(int lowerX,int higherX,int lowerY,int higherY,int lowerZ,int higherZ)
	{		
		this.lowerX = lowerX;
		this.higherX = higherX;
		this.lowerY = lowerX;
		this.higherY = higherY;
		this.lowerZ = lowerZ;
		this.higherZ = higherZ;
	}
}
