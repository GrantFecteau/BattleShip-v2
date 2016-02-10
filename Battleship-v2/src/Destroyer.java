
public class Destroyer extends Ship
	{
		public Destroyer()
		{
			myAttacks = (AttackBehavior) new Missile();
			name = "Destroyer";
			length = 5;
			health = 5;
			ammo = 1;
			letter ="De";
		}
		

		
	}
