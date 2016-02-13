
public abstract class Ship
	{
		protected String attackName = "";
		public String getAttackName() {
			return attackName;
		}
		public void setAttackName(String attackName) {
			this.attackName = attackName;
		}
		public AttackBehavior getMyAttacks() {
			return myAttacks;
		}
		public void setMyAttacks(AttackBehavior myAttacks) {
			this.myAttacks = myAttacks;
		}
		protected String name;
		protected AttackBehavior myAttacks;
		protected int length;
		protected int health;
		protected int ammo;
		protected String letter;
		public int getLength()
			{
				return length;
			}
		public void setLength(int length)
			{
				this.length = length;
			}
		public int getHealth()
			{
				return health;
			}
		public void setHealth(int health)
			{
				this.health = health;
			}
		public int getAmmo()
			{
				return ammo;
			}
		public void setAmmo(int ammo)
			{
				this.ammo = ammo;
			}
		public String getLetter()
			{
				return letter;
			}
		public void setLetter(String letter)
			{
				this.letter = letter;
			}
		public String getName()
			{
				return name;
			}
		public void setName(String name)
			{
				this.name = name;
			}
		

	}
