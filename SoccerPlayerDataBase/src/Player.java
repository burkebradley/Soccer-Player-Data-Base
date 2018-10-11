
public class Player
	{
		private String name;
		private String team;
		private String birthYear;
		private String height;
		private String position;
		
		
		public Player(String n, String t, String b, String h, String pOS)
		{
			name = n;
			team = t;
			birthYear = b;
			height = h;
			position = pOS;
			
		}
		public String getHeight()
			{
				return height;
			}
		public void setHeight(String height)
			{
				this.height = height;
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
		public String getBirthYear() {
			return birthYear;
		}
		public void setBirthYear(String birthYear) {
			this.birthYear = birthYear;
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
