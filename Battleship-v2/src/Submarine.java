
public class Submarine extends Ship
	{

		public Submarine()
		{
			attackName = "Torpedo";
			myAttacks = (AttackBehavior) new Torpedo();
			name = "Submarine";
			length = 3;
			health = 3;
			ammo = 1;
			letter ="Sb";
		}
		
	}
