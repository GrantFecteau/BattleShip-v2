
public class Frigate extends Ship
	{
		
		public Frigate()
		{
			attackName = "Missile";
			myAttacks = (AttackBehavior) new Missile();
			name = "Frigate";
			length = 4;
			health = 4;
			ammo = 1;
			letter ="Fr";
		}


	}
