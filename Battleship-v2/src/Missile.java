import java.util.Scanner;
public class Missile implements AttackBehavior
	{
		@Override
		public void doSpecial(Player p, Player p2)
			{
				System.out.println("The missile Special Attack will hit a 3x3 area surrounding the square you input. You cannot call a missile strike on the edges of the board.");
				Scanner userInput1 = new Scanner (System.in);	
				String attack = userInput1.nextLine();
				int row = BattleShip.convertRow(attack, p);
				int column = Integer.parseInt(attack.substring(1)) - 1;
				if (row > 0 && row < 9 && column > 0 && column < 9)
				{
					for (int row1 = row-1; row1<row+2; row1++)
					{
						for (int col1 = column-1; col1 < column+2; col1++)
						{
							if (p2.getPlayerShipBoard()[row1][col1].equals("  ")|| p2.getPlayerShipBoard()[row1][col1].equals("Mi"))
							{
								System.out.println("Miss!");
								p2.getPlayerShipBoard()[row1][col1] = "Mi";
								p.getPlayerHitMissBoard()[row1][col1] ="Mi";
							}
							else if (p2.getPlayerShipBoard()[row1][col1].equals("Hi"))
							{
								
							}
							else
							{
								System.out.println("Hit!");
								p2.getPlayerShipBoard()[row1][col1] = "Hi";
								p.getPlayerHitMissBoard()[row1][col1] ="Hi";
								p2.setFleetHealth(p2.getFleetHealth() -1);
							}
						}
					}
					
				}
				else
				{
					System.out.println("Sorry, that's not valid.");
					doSpecial(p,p2);
				}
				
			}
		
		
	}
