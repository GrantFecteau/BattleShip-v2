import java.util.*;
import java.util.concurrent.TimeUnit;
public class BattleShip
	{
		
		

		public static void greetPlayer1(Player p)
		{
			System.out.println("Hello Captains! Welcome to Battleship. These waters are harsh, and your objective to to completely demolish your enemy captain.");
			System.out.println("Let the game begin! Player 1 will place their ships first, followed by Player 2. When you're ready player 1, feel free to begin.");
			System.out.println();;
			printBoards(p);
		}
		
		public static void createShipBoardForCaptain(Player p)
		{
			
			String space = "  ";
			
			for (int row = 0; row < 10; row ++)
			{
				
				for (int col = 0; col < 10; col ++)
				{
					
					p.getPlayerShipBoard()[row][col] = space;
					
				}
					
			}
		}
		
		public static void createHitMissBoardForCaptain(Player p)
		{
			
			String space = "  ";
			
			for (int row = 0; row < 10; row ++)
			{
				
				for (int col = 0; col < 10; col ++)
				{
					
					p.getPlayerHitMissBoard()[row][col] = space;
					
				}
					
			}
		}
		
		public static void printBoards(Player p)
		{
			
			System.out.println("     Here are your current boards, " + p.getName() + ".");
			
			
			System.out.println("             "+p.getName()+" Ship Board            ");
			System.out.println("    1    2    3    4    5    6    7    8    9    10");
			System.out.println("                                           ");
			System.out.println("-----------------------------------------------------");
			System.out.println("A | " + p.getPlayerShipBoard()[0][0] + " | " + p.getPlayerShipBoard()[0][1] + " | " + p.getPlayerShipBoard()[0][2] + " | " + p.getPlayerShipBoard()[0][3] + " | " + p.getPlayerShipBoard()[0][4] + " | " + p.getPlayerShipBoard()[0][5] + " | " + p.getPlayerShipBoard()[0][6] + " | " + p.getPlayerShipBoard()[0][7] + " | " + p.getPlayerShipBoard()[0][8] + " | " + p.getPlayerShipBoard()[0][9] + " |");
			System.out.println("-----------------------------------------------------");
			System.out.println("B | " + p.getPlayerShipBoard()[1][0] + " | " + p.getPlayerShipBoard()[1][1] + " | " + p.getPlayerShipBoard()[1][2] + " | " + p.getPlayerShipBoard()[1][3] + " | " + p.getPlayerShipBoard()[1][4] + " | " + p.getPlayerShipBoard()[1][5] + " | " + p.getPlayerShipBoard()[1][6] + " | " + p.getPlayerShipBoard()[1][7] + " | " + p.getPlayerShipBoard()[1][8] + " | " + p.getPlayerShipBoard()[1][9] + " |");
			System.out.println("-----------------------------------------------------");
			System.out.println("C | " + p.getPlayerShipBoard()[2][0] + " | " + p.getPlayerShipBoard()[2][1] + " | " + p.getPlayerShipBoard()[2][2] + " | " + p.getPlayerShipBoard()[2][3] + " | " + p.getPlayerShipBoard()[2][4] + " | " + p.getPlayerShipBoard()[2][5] + " | " + p.getPlayerShipBoard()[2][6] + " | " + p.getPlayerShipBoard()[2][7] + " | " + p.getPlayerShipBoard()[2][8] + " | " + p.getPlayerShipBoard()[2][9] + " |");
			System.out.println("-----------------------------------------------------");
			System.out.println("D | " + p.getPlayerShipBoard()[3][0] + " | " + p.getPlayerShipBoard()[3][1] + " | " + p.getPlayerShipBoard()[3][2] + " | " + p.getPlayerShipBoard()[3][3] + " | " + p.getPlayerShipBoard()[3][4] + " | " + p.getPlayerShipBoard()[3][5] + " | " + p.getPlayerShipBoard()[3][6] + " | " + p.getPlayerShipBoard()[3][7] + " | " + p.getPlayerShipBoard()[3][8] + " | " + p.getPlayerShipBoard()[3][9] + " |");
			System.out.println("-----------------------------------------------------");
			System.out.println("E | " + p.getPlayerShipBoard()[4][0] + " | " + p.getPlayerShipBoard()[4][1] + " | " + p.getPlayerShipBoard()[4][2] + " | " + p.getPlayerShipBoard()[4][3] + " | " + p.getPlayerShipBoard()[4][4] + " | " + p.getPlayerShipBoard()[4][5] + " | " + p.getPlayerShipBoard()[4][6] + " | " + p.getPlayerShipBoard()[4][7] + " | " + p.getPlayerShipBoard()[4][8] + " | " + p.getPlayerShipBoard()[4][9] + " |");
			System.out.println("-----------------------------------------------------");
			System.out.println("F | " + p.getPlayerShipBoard()[5][0] + " | " + p.getPlayerShipBoard()[5][1] + " | " + p.getPlayerShipBoard()[5][2] + " | " + p.getPlayerShipBoard()[5][3] + " | " + p.getPlayerShipBoard()[5][4] + " | " + p.getPlayerShipBoard()[5][5] + " | " + p.getPlayerShipBoard()[5][6] + " | " + p.getPlayerShipBoard()[5][7] + " | " + p.getPlayerShipBoard()[5][8] + " | " + p.getPlayerShipBoard()[5][9] + " |");
			System.out.println("-----------------------------------------------------");
			System.out.println("G | " + p.getPlayerShipBoard()[6][0] + " | " + p.getPlayerShipBoard()[6][1] + " | " + p.getPlayerShipBoard()[6][2] + " | " + p.getPlayerShipBoard()[6][3] + " | " + p.getPlayerShipBoard()[6][4] + " | " + p.getPlayerShipBoard()[6][5] + " | " + p.getPlayerShipBoard()[6][6] + " | " + p.getPlayerShipBoard()[6][7] + " | " + p.getPlayerShipBoard()[6][8] + " | " + p.getPlayerShipBoard()[6][9] + " |");
			System.out.println("-----------------------------------------------------");
			System.out.println("H | " + p.getPlayerShipBoard()[7][0] + " | " + p.getPlayerShipBoard()[7][1] + " | " + p.getPlayerShipBoard()[7][2] + " | " + p.getPlayerShipBoard()[7][3] + " | " + p.getPlayerShipBoard()[7][4] + " | " + p.getPlayerShipBoard()[7][5] + " | " + p.getPlayerShipBoard()[7][6] + " | " + p.getPlayerShipBoard()[7][7] + " | " + p.getPlayerShipBoard()[7][8] + " | " + p.getPlayerShipBoard()[7][9] + " |");
			System.out.println("-----------------------------------------------------");
			System.out.println("I | " + p.getPlayerShipBoard()[8][0] + " | " + p.getPlayerShipBoard()[8][1] + " | " + p.getPlayerShipBoard()[8][2] + " | " + p.getPlayerShipBoard()[8][3] + " | " + p.getPlayerShipBoard()[8][4] + " | " + p.getPlayerShipBoard()[8][5] + " | " + p.getPlayerShipBoard()[8][6] + " | " + p.getPlayerShipBoard()[8][7] + " | " + p.getPlayerShipBoard()[8][8] + " | " + p.getPlayerShipBoard()[8][9] + " |");
			System.out.println("-----------------------------------------------------");
			System.out.println("J | " + p.getPlayerShipBoard()[9][0] + " | " + p.getPlayerShipBoard()[9][1] + " | " + p.getPlayerShipBoard()[9][2] + " | " + p.getPlayerShipBoard()[9][3] + " | " + p.getPlayerShipBoard()[9][4] + " | " + p.getPlayerShipBoard()[9][5] + " | " + p.getPlayerShipBoard()[9][6] + " | " + p.getPlayerShipBoard()[9][7] + " | " + p.getPlayerShipBoard()[9][8] + " | " + p.getPlayerShipBoard()[9][9] + " |");
			System.out.println("-----------------------------------------------------");
			
			


			System.out.println("            " +p.getName() +" Hit/Miss Board            ");
			System.out.println("    1    2    3    4    5    6    7    8    9    10");
			System.out.println("                                           ");
			System.out.println("-----------------------------------------------------");
			System.out.println("A | " + p.getPlayerHitMissBoard()[0][0] + " | " + p.getPlayerHitMissBoard()[0][1] + " | " + p.getPlayerHitMissBoard()[0][2] + " | " + p.getPlayerHitMissBoard()[0][3] + " | " + p.getPlayerHitMissBoard()[0][4] + " | " + p.getPlayerHitMissBoard()[0][5] + " | " + p.getPlayerHitMissBoard()[0][6] + " | " + p.getPlayerHitMissBoard()[0][7] + " | " + p.getPlayerHitMissBoard()[0][8] + " | " + p.getPlayerHitMissBoard()[0][9] + " |");
			System.out.println("-----------------------------------------------------");
			System.out.println("B | " + p.getPlayerHitMissBoard()[1][0] + " | " + p.getPlayerHitMissBoard()[1][1] + " | " + p.getPlayerHitMissBoard()[1][2] + " | " + p.getPlayerHitMissBoard()[1][3] + " | " + p.getPlayerHitMissBoard()[1][4] + " | " + p.getPlayerHitMissBoard()[1][5] + " | " + p.getPlayerHitMissBoard()[1][6] + " | " + p.getPlayerHitMissBoard()[1][7] + " | " + p.getPlayerHitMissBoard()[1][8] + " | " + p.getPlayerHitMissBoard()[1][9] + " |");
			System.out.println("-----------------------------------------------------");
			System.out.println("C | " + p.getPlayerHitMissBoard()[2][0] + " | " + p.getPlayerHitMissBoard()[2][1] + " | " + p.getPlayerHitMissBoard()[2][2] + " | " + p.getPlayerHitMissBoard()[2][3] + " | " + p.getPlayerHitMissBoard()[2][4] + " | " + p.getPlayerHitMissBoard()[2][5] + " | " + p.getPlayerHitMissBoard()[2][6] + " | " + p.getPlayerHitMissBoard()[2][7] + " | " + p.getPlayerHitMissBoard()[2][8] + " | " + p.getPlayerHitMissBoard()[2][9] + " |");
			System.out.println("-----------------------------------------------------");
			System.out.println("D | " + p.getPlayerHitMissBoard()[3][0] + " | " + p.getPlayerHitMissBoard()[3][1] + " | " + p.getPlayerHitMissBoard()[3][2] + " | " + p.getPlayerHitMissBoard()[3][3] + " | " + p.getPlayerHitMissBoard()[3][4] + " | " + p.getPlayerHitMissBoard()[3][5] + " | " + p.getPlayerHitMissBoard()[3][6] + " | " + p.getPlayerHitMissBoard()[3][7] + " | " + p.getPlayerHitMissBoard()[3][8] + " | " + p.getPlayerHitMissBoard()[3][9] + " |");
			System.out.println("-----------------------------------------------------");
			System.out.println("E | " + p.getPlayerHitMissBoard()[4][0] + " | " + p.getPlayerHitMissBoard()[4][1] + " | " + p.getPlayerHitMissBoard()[4][2] + " | " + p.getPlayerHitMissBoard()[4][3] + " | " + p.getPlayerHitMissBoard()[4][4] + " | " + p.getPlayerHitMissBoard()[4][5] + " | " + p.getPlayerHitMissBoard()[4][6] + " | " + p.getPlayerHitMissBoard()[4][7] + " | " + p.getPlayerHitMissBoard()[4][8] + " | " + p.getPlayerHitMissBoard()[4][9] + " |");
			System.out.println("-----------------------------------------------------");
			System.out.println("F | " + p.getPlayerHitMissBoard()[5][0] + " | " + p.getPlayerHitMissBoard()[5][1] + " | " + p.getPlayerHitMissBoard()[5][2] + " | " + p.getPlayerHitMissBoard()[5][3] + " | " + p.getPlayerHitMissBoard()[5][4] + " | " + p.getPlayerHitMissBoard()[5][5] + " | " + p.getPlayerHitMissBoard()[5][6] + " | " + p.getPlayerHitMissBoard()[5][7] + " | " + p.getPlayerHitMissBoard()[5][8] + " | " + p.getPlayerHitMissBoard()[5][9] + " |");
			System.out.println("-----------------------------------------------------");
			System.out.println("G | " + p.getPlayerHitMissBoard()[6][0] + " | " + p.getPlayerHitMissBoard()[6][1] + " | " + p.getPlayerHitMissBoard()[6][2] + " | " + p.getPlayerHitMissBoard()[6][3] + " | " + p.getPlayerHitMissBoard()[6][4] + " | " + p.getPlayerHitMissBoard()[6][5] + " | " + p.getPlayerHitMissBoard()[6][6] + " | " + p.getPlayerHitMissBoard()[6][7] + " | " + p.getPlayerHitMissBoard()[6][8] + " | " + p.getPlayerHitMissBoard()[6][9] + " |");
			System.out.println("-----------------------------------------------------");
			System.out.println("H | " + p.getPlayerHitMissBoard()[7][0] + " | " + p.getPlayerHitMissBoard()[7][1] + " | " + p.getPlayerHitMissBoard()[7][2] + " | " + p.getPlayerHitMissBoard()[7][3] + " | " + p.getPlayerHitMissBoard()[7][4] + " | " + p.getPlayerHitMissBoard()[7][5] + " | " + p.getPlayerHitMissBoard()[7][6] + " | " + p.getPlayerHitMissBoard()[7][7] + " | " + p.getPlayerHitMissBoard()[7][8] + " | " + p.getPlayerHitMissBoard()[7][9] + " |");
			System.out.println("-----------------------------------------------------");
			System.out.println("I | " + p.getPlayerHitMissBoard()[8][0] + " | " + p.getPlayerHitMissBoard()[8][1] + " | " + p.getPlayerHitMissBoard()[8][2] + " | " + p.getPlayerHitMissBoard()[8][3] + " | " + p.getPlayerHitMissBoard()[8][4] + " | " + p.getPlayerHitMissBoard()[8][5] + " | " + p.getPlayerHitMissBoard()[8][6] + " | " + p.getPlayerHitMissBoard()[8][7] + " | " + p.getPlayerHitMissBoard()[8][8] + " | " + p.getPlayerHitMissBoard()[8][9] + " |");
			System.out.println("-----------------------------------------------------");
			System.out.println("J | " + p.getPlayerHitMissBoard()[9][0] + " | " + p.getPlayerHitMissBoard()[9][1] + " | " + p.getPlayerHitMissBoard()[9][2] + " | " + p.getPlayerHitMissBoard()[9][3] + " | " + p.getPlayerHitMissBoard()[9][4] + " | " + p.getPlayerHitMissBoard()[9][5] + " | " + p.getPlayerHitMissBoard()[9][6] + " | " + p.getPlayerHitMissBoard()[9][7] + " | " + p.getPlayerHitMissBoard()[9][8] + " | " + p.getPlayerHitMissBoard()[9][9] + " |");
			System.out.println("-----------------------------------------------------");
			
		
		}
		
		public static void addShip(Player p)
			{
				p.getShips().add(new Destroyer());
				p.getShips().add(new Submarine());
				p.getShips().add(new Frigate());
				p.getShips().add(new Cruiser());
				p.getShips().add(new Dingy());
				for (int i = 0; i < p.getShips().size(); i++)
					{
						p.setFleetHealth(p.getFleetHealth() + p.getShips().get(i).getHealth());
					}
				
			}
		
		public static void placeShips(Player p)
		{
			if (p.getPlaceShip().size()>0)
			{
			Scanner userInput = new Scanner(System.in);	
			System.out.println("Would you like to place your ship (1) horizontally or (2) vertically.");
			int placement = userInput.nextInt();
			if (placement == 1)
				{
					placeHorizontal(p);
				}
			
			else if (placement == 2)
				{
					placeVertical(p);
				}
			
			else
				{
					System.out.println("That's not a valid option, try again.");
					placeShips(p);
				}
			}
		}
			
		public static void placeHorizontal(Player p)
		{
			Scanner userInput = new Scanner(System.in);
			Scanner userInput2 = new Scanner(System.in);
			System.out.println("What ship would you like to start with?");
			for (int i = 0; i<p.getPlaceShip().size(); i++)
				{
					System.out.println(i +1 +") "+p.getPlaceShip().get(i).getName() + " Length : " + p.getPlaceShip().get(i).getLength());
				}
			int ans = userInput.nextInt();
			
			System.out.println("You chose to place the " + p.getPlaceShip().get(ans-1).getName() + ".");
			
			printBoards(p);
			System.out.println("Where would you like to start?");
			Scanner userInput1 = new Scanner (System.in); 
			String startP = userInput1.nextLine();
			if (startP.length() < 2)
				{
					System.out.println("Sorry that's not valid, try again!");
					placeShips(p);
					return;
				}
			int column = Integer.parseInt(startP.substring(1)) - 1;
			int row = convertRow(startP,p);
			if (column > 9)
				{
					System.out.println("Sorry that's not valid, try again.");
					placeShips(p);
					return;
				}
			System.out.println("Now enter the end point, remember, it needs to the length of the ship away from the starting point.");
			String endP = userInput2.nextLine();
			int column2 = Integer.parseInt(endP.substring(1)) - 1;
			int row2 = convertRow(endP,p);
			if (column2 > 9 || row != row2)
			{
				System.out.println("Sorry that's not valid, try again.");
				placeShips(p);
				return;
			}
			else if (Math.abs(column - column2) != p.getPlaceShip().get(ans-1).getLength()-1)
			{
				System.out.println("Sorry, that's not valid, try again.");
				placeShips(p);
				return;
			}
		if (column > column2)
		{
			
			for (int i = column2; i < column+1; i++)
				{
					if (p.getPlayerShipBoard()[row][i] != "  ")
						{
							System.out.println("Sorry, you already have a ship there... cheater.");
							placeShips(p);
							return;
						}
				}
			
			for (int x = column2; x < column+1; x++)
				{
					p.getPlayerShipBoard()[row][x] = p.getPlaceShip().get(ans-1).getLetter();
				}
		}
		
		else if (column2 > column)
		{
			for (int i = column; i < column2+1; i++)
				{
					if (p.getPlayerShipBoard()[row][i] != "  ")
						{
							System.out.println("Sorry, you already have a ship there... cheater.");					
							placeShips(p);
							return;
						}
				}
			
			
			for (int x = column; x < column2+1; x++)
				{
					p.getPlayerShipBoard()[row][x] = p.getPlaceShip().get(ans-1).getLetter();
				}
			
		}
		printBoards(p);
		p.getPlaceShip().remove(ans-1);
		if(p.getPlaceShip().size()>0)
		{
			placeShips(p);
		}
		
		
		}
			
		public static void placeVertical(Player p)
		{
		Scanner userInput = new Scanner(System.in);
		Scanner userInput2 = new Scanner(System.in);
		System.out.println("What ship would you like to start with?");
		for (int i = 0; i<p.getPlaceShip().size(); i++)
			{
				System.out.println(i +1 +") "+p.getPlaceShip().get(i).getName() + " Length : " + p.getPlaceShip().get(i).getLength());
			}
		int ans = userInput.nextInt();
		
		System.out.println("You chose to place the " + p.getPlaceShip().get(ans-1).getName() + ".");
		
		printBoards(p);
		System.out.println("Where would you like to start?");
		Scanner userInput1 = new Scanner (System.in); 
		String startP = userInput1.nextLine();
		if (startP.length() < 2)
			{
				System.out.println("Sorry that's not valid, try again!");
				placeShips(p); return;
			}
		int column = Integer.parseInt(startP.substring(1)) - 1;
		int row = convertRow(startP, p);
		if (column > 9)
			{
				System.out.println("Sorry that's not valid, try again.");
				placeShips(p); return;
			}
		System.out.println("Now enter the end point, remember, it needs to the length of the ship away from the starting point.");
		String endP = userInput2.nextLine();
		int column2 = Integer.parseInt(endP.substring(1)) - 1;
		int row2 = convertRow(endP,p);
		if (column > 9 || column != column2)
		{
			System.out.println("Sorry that's not valid, try again.");
			placeShips(p); return;
		}
		else if (Math.abs(row - row2) != p.getPlaceShip().get(ans-1).getLength()-1)
		{
			System.out.println("Sorry, that's not valid, try again.");
			placeShips(p); return;
		}
		if (row > row2)
			{
				for (int i = row2; i < row+1; i++)
					{
						if (p.getPlayerShipBoard()[i][column] != "  ")
							{
								System.out.println("Sorry, there's already a ship there... scum.");
								placeShips(p); return;
							}
					}
				for (int x = row2; x < row+1; x++)
					{
						p.getPlayerShipBoard()[x][column] = p.getPlaceShip().get(ans-1).getLetter();
					}
			}
		
	else if (row2 > row)
	{
		for (int i = row; i < row2+1; i++)
			{
				if (p.getPlayerShipBoard()[i][column] != "  ")
					{
						System.out.println("Sorry, there's already a ship there... scum.");
						placeShips(p); return;
					}
			}
		
		
		for (int x = row; x < row2+1; x++)
			{
				p.getPlayerShipBoard()[x][column] = p.getPlaceShip().get(ans-1).getLetter();
			}
	}
	printBoards(p);
	p.getPlaceShip().remove(ans-1);
	if(p.getPlaceShip().size()>0)
	{
		placeShips(p);
	}
	}
		
		public static int convertRow(String s, Player p)
		{
			int row=0;
			
			switch (s.substring(0,1))
			{
		case "a":
		case "A":	
			{
			row = 0;
			break;	
			}
		case "b":
		case "B":
			{
			row = 1;
			break;
			}
		case "c":
		case "C":
			{
			row = 2;
			break;
			}
		case "d":
		case "D":
			{
			row = 3;
			break;
			}
		case "e":
		case "E":
			{
		    row = 4;
		    break;
			}
		case "f":
		case "F":
			{
			row = 5;
			break;
			}
		case "g":
		case "G":
			{
			row = 6;
			break;
			}
		case "h":
		case "H":
			{
			row = 7;
			break;
			}
		case "i":
		case "I":
			{
			row = 8;
			break;
			}
		case "j":
		case "J":
			{
			row = 9;
			break;
			}
			default:
			{
				System.out.println("Sorry that's not valid, try again!");
				placeShips(p);
			}
		
		
		}
		
		
			return row;
		}
		
		public static void pAttack(Player p, Player p2)
		{
			Scanner userInput = new Scanner(System.in);
			System.out.println(p.getName() + "'s turn to attack, what would you like to do.");
			System.out.println();
			System.out.println("1. Attack Normally");
			System.out.println("2. Use a special Attack");
			System.out.println();
			int ans = userInput.nextInt();
			printBoards(p);
			if (ans == 1)
				{
				Scanner userInput1 = new Scanner (System.in);	
				System.out.println("Which square would you like to hit?");
				String attack = userInput1.nextLine();
				int row = convertRow(attack, p);
				int column = Integer.parseInt(attack.substring(1)) - 1;
				if (p2.getPlayerShipBoard()[row][column].equals("  "))
					{
						System.out.println("Miss!");
						p2.getPlayerShipBoard()[row][column] = "Mi";
						p.getPlayerHitMissBoard()[row][column] ="Mi";
					}
				
				else if (p2.getPlayerShipBoard()[row][column].equals("Mi") || p2.getPlayerShipBoard()[row][column].equals("Hi"))
					{
						System.out.println("You've already hit this spot.");
						pAttack(p,p2);
					}
				
				else
					{
						System.out.println("Hit!");
						p2.getPlayerShipBoard()[row][column] = "Hi";
						p.getPlayerHitMissBoard()[row][column] ="Hi";
						p2.setFleetHealth(p2.getFleetHealth() -1);
					}
				}
			
			else if (ans == 2)
				{
					Scanner userInput2= new Scanner (System.in);
					System.out.println("Which ship would you like to attack with?");
					for (int i = 0; i < p.getShips().size(); i++)
						{
							boolean isFound = false;
							for (int row = 0; row < 10; row++)
								{
									for (int col = 0; col <10; col++)
										{
											if (p.getShips().get(i).getLetter().equals(p.getPlayerShipBoard()[row][col]))
												{
													isFound = true;
												}
										}
								}
							if (isFound == true)
								{
									p.getAttacks().add(p.getShips().get(i));
								}
						}
					for (int x = 0; x < p.getAttacks().size();x++)
					{
						if (p.getAttacks().get(x).getAmmo()==0)
						{
							p.getAttacks().remove(x);
						}
					}
					
					for (int q = 0; q < p.getAttacks().size(); q++)
					{
						System.out.println(p.getAttacks().get(q).getName() + " - Special Attack : " +p.getAttacks().get(q).getAttackName());
					}
					int shipans = userInput2.nextInt();
					
				}
			
			else
				{
					System.out.println("That's not valid.");
					pAttack(p,p2);
				}
			
			printBoards(p);
			
			
		}
			
		public static void printSpace()
				{
					try
						{
							TimeUnit.SECONDS.sleep(1);
						} catch (InterruptedException e)
						{
							
							e.printStackTrace();
						}
					
					for (int i = 0; i < 100000; i++)
					System.out.println();
				}
		
		public static void determineWin(Player p,Player p2)
		{
			if (p.getFleetHealth() > p2.getFleetHealth())
			{
				System.out.println("PLAYER 1 WINS!");
			}
			else if (p.getFleetHealth() < p2.getFleetHealth())
			{
				System.out.println("PLAYER 2 WINS!");
			}
					
		}
		
		public static void run()
			{
				ArrayList <Player> players = new ArrayList<Player>();
				players.add(new Player("Player 1"));
				players.add(new Player("Player 2"));
				createShipBoardForCaptain(players.get(0));
				createShipBoardForCaptain(players.get(1));
				createHitMissBoardForCaptain(players.get(0));
				createHitMissBoardForCaptain(players.get(1));
				addShip(players.get(0));
				addShip(players.get(1));
				greetPlayer1(players.get(0));
				players.get(0).setPlaceShip(players.get(0).getShips());
				players.get(1).setPlaceShip(players.get(1).getShips());
				placeShips(players.get(0));
				printSpace();
				placeShips(players.get(1));
				while (players.get(0).getFleetHealth() > 0 && players.get(1).getFleetHealth() > 0)
					{
						//printSpace();
						pAttack(players.get(0), players.get(1));
					//	printSpace();
						pAttack(players.get(1), players.get(0));
					}
				determineWin(players.get(0), players.get(1));
			}

		
	}
