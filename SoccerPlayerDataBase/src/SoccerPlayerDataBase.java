import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class SoccerPlayerDataBase
	{
// Create an array list of players
// Import text file of the all BPL players and their individual fifa stats
// User will be able to search up player by name 
// Will output all the players fifa stats and their nationality and professional game
		
		private static Scanner playerList;
		private static Scanner userInputOne;
		private static Scanner userInputTwo;
		private static String playerSearched;
		private static int beginSearch;

		public static void main(String[] args) throws IOException
		{
			soccerPlayers();
			playerSearch();
		}
		
		public static void soccerPlayers() throws IOException
		{
			ArrayList<Player>database = new ArrayList<Player>();
			playerList = new Scanner(new File("BPLPlayers.txt"));
			while (playerList.hasNext())
				{
					database.add(new Player(playerList.next(),playerList.next(),playerList.next(),playerList.next(),playerList.next()));	
				}
			for (int i = 0; i <database.size(); i++)
				{
					System.out.println(database.get(i));
				}
//			System.out.println(playerList);
//			String n = BPLPlayers.txt.next();
		}
		
		public static void playerSearch() throws IOException
		{
			userInputOne = new Scanner(System.in);
			playerSearched = userInputOne.nextLine();
		}
		
		public static void promptUser() throws IOException
		{
			System.out.println("Welcome!");
			System.out.println("This is a database of all the players currently on a Premier League team roster.");
			System.out.println("Enter '1' to begin your search");
			beginSearch = userInputTwo.nextInt();			
			if (beginSearch == 1)
				{
					playerSearch();
				}
		}
	}
