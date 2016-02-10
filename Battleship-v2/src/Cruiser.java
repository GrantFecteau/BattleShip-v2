
public class Cruiser extends Ship
	{ 
		public Cruiser()
		{
			myAttacks = (AttackBehavior) new Missile();
			name = "Cruiser";
			length = 3;
			health = 3;
			ammo = 0;
			letter ="Cs";
		}

		
	}
