package physics;

import java.util.LinkedList;
import interfaces.*;
public class Scene{

	private MovableObject movableObject;
	private LinkedList<ImmovableObject> immovableObjects;	
	private long elapsedTime;
	
	public Scene(MovableObject movableObject, LinkedList<ImmovableObject> immovableObjects)
	{
		this.movableObject = movableObject;
		if(movableObject == null)
		{
			throw new IllegalArgumentException();
		}
		if(immovableObjects != null)
		{
			this.immovableObjects = immovableObjects;
		}
		elapsedTime = 0;
	}
	
	public void update(double time)
	{
		movableObject.update(time);
		elapsedTime += time;
	}
	
	public String toString()
	{
		return movableObject.toString();
	}
	
	public long getTotalTime()
	{
		return elapsedTime;
	}
}
