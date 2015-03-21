package physics;

public class Vector {

	private double x;
	private double y;
	private double z;
	
	public Vector(double x, double y, double z)
	{
		setValues(x, y ,z);
	}
	
	public Vector()
	{
		setValues(0, 0 ,0);
	}
	
	public Vector(Vector vector)
	{
		assign(vector);
	}
	
	public void add(Vector vector)
	{
		if(vector == null)
		{
			throw new IllegalArgumentException();
		}
		this.x += vector.x;
		this.y += vector.y;
		this.z += vector.z;
	}
	
	public void substract(Vector vector)
	{
		if(vector == null)
		{
			throw new IllegalArgumentException();
		}
		this.x -= vector.x;
		this.y -= vector.y;
		this.z -= vector.z;		
	}
	
	public void multiply(double d)
	{
		x *= d;
		y *= d;
		z *= d;
	}
	
	public void setValues(double x, double y, double z)
	{
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public void assign(Vector vector)throws IllegalArgumentException
	{
		if(vector == null)
		{
			throw new IllegalArgumentException();
		}
		this.x = vector.x;
		this.y = vector.y;
		this.z = vector.z;
	}
	
	public String toString()
	{
		String result = new String();
		result += x + ", ";
		result += y + ", ";
		result += z;
		return result;
	}
	
	public void setX(double x)
	{
		this.x = x;
	}
	public void setY(double y)
	{
		this.y = y;
	}
	public void setZ(double z)
	{
		this.z = z;
	}
	public double getX()
	{
		return x;
	}
	public double getY()
	{
		return y;
	}
	public double getZ()
	{
		return z;
	}
}
