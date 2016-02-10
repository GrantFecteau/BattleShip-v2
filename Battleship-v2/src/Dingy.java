
public class Dingy extends Ship
	{
	
		public Dingy()
		{
			myAttacks = (AttackBehavior) new Missile();
			name = "Dinghy";
			length = 2;
			health = 2;
			ammo = 0;
			letter ="Dy";
		}


	}
