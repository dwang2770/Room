
public class TrapRoom extends Room {



	public TrapRoom(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void enterRoom(Person x) 
	{
		// TODO Auto-generated method stub
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
		double y = Math.random();// the chances of spawning a certain trap room
		
		if (y >.3)//very common trap room

		{
			double z = Math.random();
			
			if (z >.2)// high chance of making it out alive
			{
			System.out.println("you heard a shot of an arrow coming from behind you! You dodged just in time");
			}
			else  //very low chance of dying
			{
				System.out.println("You were shot by an arrow from behind, Game Over");
				Runner.gameOff();
			}
		}
		
		if(y<.2)//rare chance of this trap room appearing
		{
			double t = Math.random();
			
			if (t >.2)// high chance of dying
			{
				System.out.println("The floor opened up and you feel onto a bunch of spikes, Game Over");
				Runner.gameOff();
			}
			else  //very low chance of surviving
			{
				System.out.println("the floor opened up to reveal spikes on the bottom! You grabbed onto the edge and barely made it out alive!");
			}
			
		}
		
	
	}
	

}