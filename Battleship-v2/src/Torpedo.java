import java.util.*;
public class Torpedo implements AttackBehavior
	{

		@Override
		public void doSpecial(Player p, Player p2)
			{
			try 
			{
				Scanner userInput1 = new Scanner (System.in);
				System.out.println("Enter the square you would like to aim for. The Torpedo will come from the bottom of the board and move in a straight lining hitting anything in its path.");
				String attack = userInput1.nextLine();
				int row = BattleShip.convertRow(attack, p);
				int column = Integer.parseInt(attack.substring(1)) - 1;
				for (int row1 = 9; row1 > row; row1--)
				{
					if (p2.getPlayerShipBoard()[row1][column].equals("  ")|| p2.getPlayerShipBoard()[row1][column].equals("Mi"))
					{
						System.out.println("Miss!");
						p2.getPlayerShipBoard()[row1][column] = "Mi";
						p.getPlayerHitMissBoard()[row1][column] ="Mi";
					}
					else if (p2.getPlayerShipBoard()[row1][column].equals("Hi"))
					{
						
					}
					else
					{
						System.out.println("Hit!");
						p2.getPlayerShipBoard()[row1][column] = "Hi";
						p.getPlayerHitMissBoard()[row1][column] ="Hi";
						p2.setFleetHealth(p2.getFleetHealth() -1);
					}
				}
				
				if (p2.getPlayerShipBoard()[row][column].equals("  ")|| p2.getPlayerShipBoard()[row][column].equals("Mi"))
				{
					System.out.println("Miss!");
					p2.getPlayerShipBoard()[row][column] = "Mi";
					p.getPlayerHitMissBoard()[row][column] ="Mi";
				}
				else if (p2.getPlayerShipBoard()[row][column].equals("Hi"))
				{
					
				}
				else
				{
					System.out.println("Hit!");
					p2.getPlayerShipBoard()[row][column] = "Hi";
					p.getPlayerHitMissBoard()[row][column] ="Hi";
					p2.setFleetHealth(p2.getFleetHealth() -1);
				}
			}
			catch (InputMismatchException e)
			{
				System.out.println("Sorry, that's invalid!");
				doSpecial(p,p2);
			}
				
				
				
			}
				
			}

	
