package physics;

public class main {

	static public void main(String[] args)
	{
		Vector vector = new Vector(3, 4, 15);
		Scene scene = new Scene(new Ball(null, vector, 0.01, 10), null);
		long prev = 0, curr = System.currentTimeMillis();
		int time;
		curr -= 200;
		while(true)
		{
			prev = curr;
			curr = System.currentTimeMillis();
			time = (int)(curr - prev);
			scene.update((double)time);
			System.out.println(scene.toString());
			if(scene.getTotalTime() >= 4000)
			{
				break;
			}
			try
			{
				Thread.sleep(200);
			}
			catch(Exception s){}
		}
		
		System.out.println("Time elapsed in milis:" + scene.getTotalTime());
		System.out.println(scene.toString());

	}
}
