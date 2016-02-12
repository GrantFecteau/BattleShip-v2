import java.util.ArrayList;

public class Player 
	{
		private String name;
		
		private String[][] playerShipBoard;
		
		private String[][] playerHitMissBoard;
		
		private ArrayList<Ship> ships;
		
		private ArrayList<Ship> placeShip;
		
		private int fleetHealth;
		
		public Player(String n)
		{
		name = n;
		playerShipBoard = new String[10][10];	
		playerHitMissBoard = new String [10][10];
		ships = new ArrayList<Ship>();
		placeShip = ships;
		}

		public int getFleetHealth()
			{
				return fleetHealth;
			}

		public void setFleetHealth(int fleetHealth)
			{
				this.fleetHealth = fleetHealth;
			}

		public String getName()
			{
				return name;
			}

		public void setName(String name)
			{
				this.name = name;
			}

		public String[][] getPlayerShipBoard()
			{
				return playerShipBoard;
			}

		public void setPlayerShipBoard(String[][] playerShipBoard)
			{
				this.playerShipBoard = playerShipBoard;
			}

		public String[][] getPlayerHitMissBoard()
			{
				return playerHitMissBoard;
			}

		public void setPlayerHitMissBoard(String[][] playerHitMissBoard)
			{
				this.playerHitMissBoard = playerHitMissBoard;
			}

		public ArrayList<Ship> getShips()
			{
				return ships;
			}

		public void setShips(ArrayList<Ship> ships)
			{
				this.ships = ships;
			}

		public ArrayList<Ship> getPlaceShip()
			{
				return placeShip;
			}

		public void setPlaceShip(ArrayList<Ship> placeShip)
			{
				this.placeShip = placeShip;
			}

	}
