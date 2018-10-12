import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class SoccerPlayerDataBase
	{
		 static Scanner playerList;
		 static Scanner userInputOne;
		 static Scanner userInputTwo;
		 static String playerSearched; 
		 static String name;
		 static String team;
		 static String birthYear;
		 static String height;
		 static String position;
		 static String playerFound;
		 static String userSearchAgain;
		 static int beginSearch;
		 static boolean playerMatches;
		 static boolean continueSearch;
		 static ArrayList<Player>database = new ArrayList<Player>();

		
		public static void soccerPlayers() throws IOException
		{
	
			playerList = new Scanner(new File("BPLPlayers.txt"));
			while (playerList.hasNext())
				{
					name = playerList.next();
					team = playerList.next();
					birthYear = playerList.next();
					position = playerList.next();
					database.add(new Player(name,team,birthYear,position));	
				}
		}
		

		public static void promptUser() throws IOException
		{
			System.out.println("Welcome!");
			System.out.println("This is a database of all the players currently on a Premier League team roster.");
			System.out.println("Enter '1' to begin your search");
			userInputTwo = new Scanner(System.in);
			beginSearch = userInputTwo.nextInt();		
			if (beginSearch == 1)
				{
					
					playerSearch();
				}
			else 
				{
					System.out.println("Please use the correct input.");
				}
		}
		
		
		public static void playerSearch() throws IOException
			{
				System.out.println("Enter in a players name with a '_' in all the spaces.");
				userInputOne = new Scanner(System.in);
				playerSearched = userInputOne.nextLine();

						for (int i = 0; i <database.size(); i++)
							{
								if (database.get(i).getName().equals(playerSearched))
									{
										System.out.println(database.get(i).getName() + " " + database.get(i).getTeam() + " "+ database.get(i).getBirthYear() +" "+ database.get(i).getPosition());
									}
							}
						continueSearch();
						
			}
		
		
		public static void continueSearch() throws IOException
		{
			System.out.println(" ");
			System.out.println("Would you like to search for another player");
			userInputOne = new Scanner(System.in);
			 userSearchAgain = userInputOne.nextLine();
			 continueSearch = true; 
			
			 	if (userSearchAgain.equals("yes"))
			 		{
			 			playerSearch();
			 		}
				else if (userSearchAgain.equals("no"))
					{
						System.out.println("Come back soon!");
						continueSearch = false;
						System.exit(0);
					}
		}
	}
