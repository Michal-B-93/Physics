package physics;

import interfaces.MovableObject;

public class Ball implements MovableObject{

	private Vector position;
	private Vector speed;
	//private Vector previousForce;
	private double radius;
	
	public Ball(Vector position, Vector speed, double radius)
	{
		this.position = new Vector();
		this.speed = new Vector();
		if(position != null)
		{
			this.position.assign(position);
		}
		if(speed != null)
		{
			this.speed.assign(speed);
		}
		
		this.radius = radius;
		//previousForce = new Vector();
	}
	
	public void update(int time)
	{
		
	}
	
	public String toString()
	{
		String result = new String("Position: ");
		result += position.toString();
		result += ", speed: ";
		result += speed.toString();
		result += ", radius: ";
		result += radius;
		return result;
	}
}
