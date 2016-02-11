import java.util.*;
import java.util.concurrent.TimeUnit;
public class BattleShip
	{
		
		

		public static void greetPlayer1(String n, String arr1[][], String arr2[][])
		{
			System.out.println("Hello Captains! Welcome to Battleship. These waters are harsh, and your objective to to completely demolish your enemy captain.");
			System.out.println("Let the game begin! Player 1 will place their ships first, followed by Player 2. When you're ready player 1, feel free to begin.");
			System.out.println();;
			printBoards(n, arr1, arr2);
		}
		
		public static String[][] createShipBoardForCaptain(String arr[][])
		{
			
			String space = "  ";
			
			for (int row = 0; row < 10; row ++)
			{
				
				for (int col = 0; col < 10; col ++)
				{
					
					arr[row][col] = space;
					
				}
					
			}
			return arr;
		}
		
		
		public static void printBoards(String name, String arr1[][], String arr2[][])
		{
			
			System.out.println("     Here are your current boards, " + name + ".");
			
			
			System.out.println("             "+name+" Ship Board            ");
			System.out.println("    1    2    3    4    5    6    7    8    9    0");
			System.out.println("                                           ");
			System.out.println("-----------------------------------------------------");
			System.out.println("A | " + arr1[0][0] + " | " + arr1[0][1] + " | " + arr1[0][2] + " | " + arr1[0][3] + " | " + arr1[0][4] + " | " + arr1[0][5] + " | " + arr1[0][6] + " | " + arr1[0][7] + " | " + arr1[0][8] + " | " + arr1[0][9] + " |");
			System.out.println("-----------------------------------------------------");
			System.out.println("B | " + arr1[1][0] + " | " + arr1[1][1] + " | " + arr1[1][2] + " | " + arr1[1][3] + " | " + arr1[1][4] + " | " + arr1[1][5] + " | " + arr1[1][6] + " | " + arr1[1][7] + " | " + arr1[1][8] + " | " + arr1[1][9] + " |");
			System.out.println("-----------------------------------------------------");
			System.out.println("C | " + arr1[2][0] + " | " + arr1[2][1] + " | " + arr1[2][2] + " | " + arr1[2][3] + " | " + arr1[2][4] + " | " + arr1[2][5] + " | " + arr1[2][6] + " | " + arr1[2][7] + " | " + arr1[2][8] + " | " + arr1[2][9] + " |");
			System.out.println("-----------------------------------------------------");
			System.out.println("D | " + arr1[3][0] + " | " + arr1[3][1] + " | " + arr1[3][2] + " | " + arr1[3][3] + " | " + arr1[3][4] + " | " + arr1[3][5] + " | " + arr1[3][6] + " | " + arr1[3][7] + " | " + arr1[3][8] + " | " + arr1[3][9] + " |");
			System.out.println("-----------------------------------------------------");
			System.out.println("E | " + arr1[4][0] + " | " + arr1[4][1] + " | " + arr1[4][2] + " | " + arr1[4][3] + " | " + arr1[4][4] + " | " + arr1[4][5] + " | " + arr1[4][6] + " | " + arr1[4][7] + " | " + arr1[4][8] + " | " + arr1[4][9] + " |");
			System.out.println("-----------------------------------------------------");
			System.out.println("F | " + arr1[5][0] + " | " + arr1[5][1] + " | " + arr1[5][2] + " | " + arr1[5][3] + " | " + arr1[5][4] + " | " + arr1[5][5] + " | " + arr1[5][6] + " | " + arr1[5][7] + " | " + arr1[5][8] + " | " + arr1[5][9] + " |");
			System.out.println("-----------------------------------------------------");
			System.out.println("G | " + arr1[6][0] + " | " + arr1[6][1] + " | " + arr1[6][2] + " | " + arr1[6][3] + " | " + arr1[6][4] + " | " + arr1[6][5] + " | " + arr1[6][6] + " | " + arr1[6][7] + " | " + arr1[6][8] + " | " + arr1[6][9] + " |");
			System.out.println("-----------------------------------------------------");
			System.out.println("H | " + arr1[7][0] + " | " + arr1[7][1] + " | " + arr1[7][2] + " | " + arr1[7][3] + " | " + arr1[7][4] + " | " + arr1[7][5] + " | " + arr1[7][6] + " | " + arr1[7][7] + " | " + arr1[7][8] + " | " + arr1[7][9] + " |");
			System.out.println("-----------------------------------------------------");
			System.out.println("I | " + arr1[8][0] + " | " + arr1[8][1] + " | " + arr1[8][2] + " | " + arr1[8][3] + " | " + arr1[8][4] + " | " + arr1[8][5] + " | " + arr1[8][6] + " | " + arr1[8][7] + " | " + arr1[8][8] + " | " + arr1[8][9] + " |");
			System.out.println("-----------------------------------------------------");
			System.out.println("J | " + arr1[9][0] + " | " + arr1[9][1] + " | " + arr1[9][2] + " | " + arr1[9][3] + " | " + arr1[9][4] + " | " + arr1[9][5] + " | " + arr1[9][6] + " | " + arr1[9][7] + " | " + arr1[9][8] + " | " + arr1[9][9] + " |");
			System.out.println("-----------------------------------------------------");
			
			


			System.out.println("            " +name +"Hit/Miss Board            ");
			System.out.println("    1    2    3    4    5    6    7    8    9    0");
			System.out.println("                                           ");
			System.out.println("-----------------------------------------------------");
			System.out.println("A | " + arr2[0][0] + " | " + arr2[0][1] + " | " + arr2[0][2] + " | " + arr2[0][3] + " | " + arr2[0][4] + " | " + arr2[0][5] + " | " + arr2[0][6] + " | " + arr2[0][7] + " | " + arr2[0][8] + " | " + arr2[0][9] + " |");
			System.out.println("-----------------------------------------------------");
			System.out.println("B | " + arr2[1][0] + " | " + arr2[1][1] + " | " + arr2[1][2] + " | " + arr2[1][3] + " | " + arr2[1][4] + " | " + arr2[1][5] + " | " + arr2[1][6] + " | " + arr2[1][7] + " | " + arr2[1][8] + " | " + arr2[1][9] + " |");
			System.out.println("-----------------------------------------------------");
			System.out.println("C | " + arr2[2][0] + " | " + arr2[2][1] + " | " + arr2[2][2] + " | " + arr2[2][3] + " | " + arr2[2][4] + " | " + arr2[2][5] + " | " + arr2[2][6] + " | " + arr2[2][7] + " | " + arr2[2][8] + " | " + arr2[2][9] + " |");
			System.out.println("-----------------------------------------------------");
			System.out.println("D | " + arr2[3][0] + " | " + arr2[3][1] + " | " + arr2[3][2] + " | " + arr2[3][3] + " | " + arr2[3][4] + " | " + arr2[3][5] + " | " + arr2[3][6] + " | " + arr2[3][7] + " | " + arr2[3][8] + " | " + arr2[3][9] + " |");
			System.out.println("-----------------------------------------------------");
			System.out.println("E | " + arr2[4][0] + " | " + arr2[4][1] + " | " + arr2[4][2] + " | " + arr2[4][3] + " | " + arr2[4][4] + " | " + arr2[4][5] + " | " + arr2[4][6] + " | " + arr2[4][7] + " | " + arr2[4][8] + " | " + arr2[4][9] + " |");
			System.out.println("-----------------------------------------------------");
			System.out.println("F | " + arr2[5][0] + " | " + arr2[5][1] + " | " + arr2[5][2] + " | " + arr2[5][3] + " | " + arr2[5][4] + " | " + arr2[5][5] + " | " + arr2[5][6] + " | " + arr2[5][7] + " | " + arr2[5][8] + " | " + arr2[5][9] + " |");
			System.out.println("-----------------------------------------------------");
			System.out.println("G | " + arr2[6][0] + " | " + arr2[6][1] + " | " + arr2[6][2] + " | " + arr2[6][3] + " | " + arr2[6][4] + " | " + arr2[6][5] + " | " + arr2[6][6] + " | " + arr2[6][7] + " | " + arr2[6][8] + " | " + arr2[6][9] + " |");
			System.out.println("-----------------------------------------------------");
			System.out.println("H | " + arr2[7][0] + " | " + arr2[7][1] + " | " + arr2[7][2] + " | " + arr2[7][3] + " | " + arr2[7][4] + " | " + arr2[7][5] + " | " + arr2[7][6] + " | " + arr2[7][7] + " | " + arr2[7][8] + " | " + arr2[7][9] + " |");
			System.out.println("-----------------------------------------------------");
			System.out.println("I | " + arr2[8][0] + " | " + arr2[8][1] + " | " + arr2[8][2] + " | " + arr2[8][3] + " | " + arr2[8][4] + " | " + arr2[8][5] + " | " + arr2[8][6] + " | " + arr2[8][7] + " | " + arr2[8][8] + " | " + arr2[8][9] + " |");
			System.out.println("-----------------------------------------------------");
			System.out.println("J | " + arr2[9][0] + " | " + arr2[9][1] + " | " + arr2[9][2] + " | " + arr2[9][3] + " | " + arr2[9][4] + " | " + arr2[9][5] + " | " + arr2[9][6] + " | " + arr2[9][7] + " | " + arr2[9][8] + " | " + arr2[9][9] + " |");
			System.out.println("-----------------------------------------------------");
			
		
		}
		
		public static ArrayList addShip(ArrayList<Ship> x)
			{
				x.add(new Destroyer());
				x.add(new Submarine());
				x.add(new Frigate());
				x.add(new Cruiser());
				x.add(new Dingy());
				
				return x;
			}
		
		public static String[][] placeShips(String name, ArrayList<Ship> arr1, String arrS[][], String arrH[][])
		{
			Scanner userInput = new Scanner(System.in);	
			System.out.println("Would you like to place your ship (1) horizontally or (2) vertically.");
			int placement = userInput.nextInt();
			if (placement == 1)
				{
					placeHorizontal(name, arr1, arrS, arrH);
				}
			
			else if (placement == 2)
				{
					placeVertical(name, arr1,arrS,arrH);
				}
			
			else
				{
					System.out.println("That's not a valid option, try again.");
					placeShips(name, arr1, arrS, arrH);
				}
		}
		
			
		public static void placeHorizontal(String name, ArrayList<Ship> arr1, String arrS[][],String arrH[][])
		{
			Scanner userInput = new Scanner(System.in);
			Scanner userInput2 = new Scanner(System.in);
			System.out.println("What ship would you like to start with?");
			for (int i = 0; i<arr1.size(); i++)
				{
					System.out.println(i +1 +") "+arr1.get(i).getName() + " Length : " + arr1.get(i).getLength());
				}
			int ans = userInput.nextInt();
			
			System.out.println("You chose to place the " + arr1.get(ans-1).getName() + ".");
			
			printBoards(name,arrS, arrH);
			System.out.println("Where would you like to start?");
			Scanner userInput1 = new Scanner (System.in); 
			String startP = userInput1.nextLine();
			if (startP.length() < 2)
				{
					System.out.println("Sorry that's not valid, try again!");
					placeHorizontal(name, arr1, arrS,arrH);
				}
			int column = Integer.parseInt(startP.substring(1)) - 1;
			int row = convertRow(startP,name,arr1,arrS,arrH);
			if (column > 9)
				{
					System.out.println("Sorry that's not valid, try again.");
					placeHorizontal(name,arr1,arrS,arrH);
				}
			System.out.println("Now enter the end point, remember, it needs to the length of the ship away from the starting point.");
			String endP = userInput2.nextLine();
			int column2 = Integer.parseInt(endP.substring(1)) - 1;
			int row2 = convertRow(endP,name, arr1,arrS,arrH);
			if (column > 9 || row != row2)
			{
				System.out.println("Sorry that's not valid, try again.");
				placeHorizontal(name,arr1,arrS,arrH);
			}
			else if (Math.abs(column - column2) >= arr1.get(ans-1).getLength())
			{
				System.out.println("Sorry, that's not valid, try again.");
				placeHorizontal(name,arr1,arrS,arrH);
			}
		if (column > column2)
		{
			for (int x = column2; x < column+1; x++)
			{
				arrS[row][x] = arr1.get(ans-1).getLetter();
			}
		}
		
		else if (column2 > column)
		{
			for (int x = column; x < column2+1; x++)
			{
				arrS[row][x] = arr1.get(ans-1).getLetter();
			}
		}
		printBoards(name,arrS,arrH);
		arr1.remove(ans-1);
		if(arr1.size()>0)
		{
			placeShips(name, arr1, arrS, arrH);
		}
		
		
		
		}
		
		
		
		public static void placeVertical(String name, ArrayList<Ship> arr1, String arrS[][],String arrH[][])
		{
		Scanner userInput = new Scanner(System.in);
		Scanner userInput2 = new Scanner(System.in);
		System.out.println("What ship would you like to start with?");
		for (int i = 0; i<arr1.size(); i++)
			{
				System.out.println(i +1 +") "+arr1.get(i).getName() + " Length : " + arr1.get(i).getLength());
			}
		int ans = userInput.nextInt();
		
		System.out.println("You chose to place the " + arr1.get(ans-1).getName() + ".");
		
		printBoards(name, arrS, arrH);
		System.out.println("Where would you like to start?");
		Scanner userInput1 = new Scanner (System.in); 
		String startP = userInput1.nextLine();
		if (startP.length() < 2)
			{
				System.out.println("Sorry that's not valid, try again!");
				placeVertical(name, arr1, arrS, arrH);
			}
		int column = Integer.parseInt(startP.substring(1)) - 1;
		int row = convertRow(startP, name, arr1,arrS,arrH);
		if (column > 9)
			{
				System.out.println("Sorry that's not valid, try again.");
				placeVertical(name, arr1, arrS, arrH);
			}
		System.out.println("Now enter the end point, remember, it needs to the length of the ship away from the starting point.");
		String endP = userInput2.nextLine();
		int column2 = Integer.parseInt(endP.substring(1)) - 1;
		int row2 = convertRow(endP, name, arr1,arrS,arrH);
		if (column > 9 || column != column2)
		{
			System.out.println("Sorry that's not valid, try again.");
			placeVertical(name, arr1, arrS, arrH);
		}
		else if (Math.abs(row - row2) >= arr1.get(ans-1).getLength())
		{
			System.out.println("Sorry, that's not valid, try again.");
			placeVertical(name, arr1, arrS,arrH);
		}
		if (row > row2)
			{
			for (int x = row2; x < row+1; x++)
			{
			arrS[x][column] = arr1.get(ans-1).getLetter();
			}
	}
	
	else if (row2 > row)
	{
		for (int x = row; x < row2+1; x++)
		{
			arrS[x][column] = arr1.get(ans-1).getLetter();
		}
	}
	printBoards(name, arrS, arrH);
	arr1.remove(ans-1);
	if(arr1.size()>0)
	{
		placeShips(name, arr1, arrS,arrH);
	}
	}
		
		
		public static int convertRow(String s,String name, ArrayList<Ship> arr1, String arrS[][],String arrH[][])
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
				placeShips(name, arr1, arrS,arrH);
			}
		
		
		}
		
		
			return row;
		}
		
		public static void p1Attack(String name, String arrH[][], String arrS[][], String arrS2[][])
		{
			Scanner userInput = new Scanner(System.in);
			System.out.println(name + "'s turn to attack, what would you like to do.");
			System.out.println();
			System.out.println("1. Attack Normally");
			System.out.println("2. Use a special Attack");
			System.out.println();
			int ans = userInput.nextInt();
			
			if (ans == 1)
				{
				Scanner userInput1 = new Scanner (System.in);	
				System.out.println("Which square would you like to hit?");
				String attack = userInput1.nextLine();
				int row = convertRow(attack);
				int column = Integer.parseInt(attack.substring(1)) - 1;
				if (arrS[row][column].equals(" "))
					{
						System.out.println("Miss!");
						arrS[row][column] = "Mi";
						arrH[row][column] ="Mi";
					}
				
				else if (arrS[row][column].equals("Mi") || arrS[row][column].equals("Hi"))
					{
						System.out.println("You've already hit this spot.");
						p1Attack(name, arrH, arrS, arrS2);
					}
				
				else
					{
						System.out.println("Hit!");
						arrS[row][column] = "Hi";
						arrH[row][column] ="Hi";
					}
				}
			
			printBoards(name,arrS2,arrH);
			
			
		}
		
		public static void p2Attack()
		{
			
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
		
		public static void run()
			{
				ArrayList <Player> players = new ArrayList<Player>();
				players.add(new Player("Player 1"));
				players.add(new Player("Player 2"));
				players.get(0).setPlayerShipBoard(createShipBoardForCaptain(players.get(0).getPlayerShipBoard()));
				players.get(1).setPlayerShipBoard(createShipBoardForCaptain(players.get(1).getPlayerShipBoard()));
				players.get(0).setPlayerHitMissBoard(createShipBoardForCaptain(players.get(0).getPlayerHitMissBoard()));
				players.get(1).setPlayerHitMissBoard(createShipBoardForCaptain(players.get(1).getPlayerHitMissBoard()));
				players.get(0).setShips(addShip(players.get(0).getShips()));
				players.get(1).setShips(addShip(players.get(1).getShips()));
				greetPlayer1(players.get(0).getName(), players.get(0).getPlayerShipBoard(), players.get(0).getPlayerHitMissBoard());
				players.get(0).setPlaceShip(players.get(0).getShips());
				players.get(1).setPlaceShip(players.get(1).getShips());
				placeShips();
				placeShips();
				printSpace();
				
			}

		
	}
