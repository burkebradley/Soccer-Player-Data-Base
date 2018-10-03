
public class Player
	{
		private String name;
		private String team;
		private int birthYear;
		private int height;
		private String position;
		
		
		public Player(String n, String t, int b, int h, String pOS)
		{
			name = n;
			team = t;
			birthYear = b;
			height = h;
			position = pOS;
			
		}
		public String getName()
			{
				return name;
			}
		public void setName(String name)
			{
				this.name = name;
			}
		public String getTeam()
			{
				return team;
			}
		public void setTeam(String team)
			{
				this.team = team;
			}
		public int getBirthYear() {
			return birthYear;
		}
		public void setBirthYear(int birthYear) {
			this.birthYear = birthYear;
		}
		public int getHeight() {
			return height;
		}
		public void setHeight(int height) {
			this.height = height;
		}
		public String getPosition()
			{
				return position;
			}
		public void setPosition(String position)
			{
				this.position = position;
			}
		
	}
