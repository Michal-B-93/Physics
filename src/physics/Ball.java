package physics;

import interfaces.MovableObject;

public class Ball implements MovableObject{

	static final double CD = 0.45;
	
	//needs to multiplied by speed squared and crossSectionArea
	static final double DRAG_COEFFICIENT = 0.5 * AIR_DENSITY * CD; 
	
	private Vector position;
	private Vector speed;
	//private Vector previousForce;
	private double radius;
	private double mass;
	private double crossSectionArea;
	
	
	public Ball(Vector position, Vector speed, double radius, double mass)
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
		this.mass = mass;
		this.crossSectionArea = radius * radius * PI;
		//previousForce = new Vector();
	}
	
	public void update(double time)//time in milis
	{
		time /= 1000;
		System.out.println("time: " + time);
		//adding gravity's pull
		speed.setZ(speed.getZ() - 10 * time);
		//counting speed decrease as the result of drag
		speed.substract(aerodynamicDrag(time));
		
		Vector speedAux = new Vector(speed);
		speedAux.multiply(time);
		position.add(speedAux);
	}
	
	private Vector aerodynamicDrag(double time)//time in seconds
	{
		Vector speedDecrease = new Vector();
		double d;
		d = speed.getX();
		d *= d;
		d *= crossSectionArea * DRAG_COEFFICIENT;
		speedDecrease.setX(((d / mass) * time));
		d = speed.getY();
		d *= d;
		d *= crossSectionArea * DRAG_COEFFICIENT;
		speedDecrease.setY(((d / mass) * time));
		d = speed.getZ();
		d *= d;
		d *= crossSectionArea * DRAG_COEFFICIENT;
		speedDecrease.setZ(((d / mass) * time));
		System.out.println(speedDecrease.toString());
		return speedDecrease;
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
