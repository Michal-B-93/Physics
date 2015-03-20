package physics;

import java.util.LinkedList;
import interfaces.*;
public class Scene{

	private MovableObject movableObject;
	private LinkedList<ImmovableObject> immovableObjects;	
	private long elapsedTime;
	private final Vector gravity;
	
	public Scene(MovableObject movableobject, LinkedList<ImmovableObject> immovableObjects)
	{
		if(movableObject == null)
		{
			throw new IllegalArgumentException();
		}
		this.movableObject = movableObject;
		if(immovableObjects != null)
		{
			this.immovableObjects = immovableObjects;
		}
		elapsedTime = 0;
		gravity = new Vector(0, 0, -10);
	}
	
	public void update(int time)
	{
		movableObject.update(time);
		
	}
}
