import java.util.*;
public class Runner
	{
		public static ArrayList<Ship> ships = new ArrayList<Ship>();
		
		public static void main(String[] args)
			{
				
				ships.add(new Destroyer());
				ships.add(new Submarine());
				ships.add(new Frigate());
				ships.add(new Cruiser());
				ships.add(new Dingy());

				for (int i = 0; i < 5; i ++)
				System.out.println(ships.get(i).getLetter());
				
			}

	}
