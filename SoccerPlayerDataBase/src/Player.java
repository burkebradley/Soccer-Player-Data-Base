
public class Player
	{
		private String name;
		private String nationality;
		private String team;
		private String position;
		private int overall;
		private int pace;
		private int dribble;
		private int shot;
		private int defense;
		private int pass;
		private int physical;
		
		public Player(String n, String na, String t, String pos, int ovr, int pac, int dri, int sho, int def, int pas, int phy)
		{
			name = n;
			nationality = na; 
			team = t;
			position = pos;
			overall = ovr;
			pace = pac;
			dribble = dri;
			shot = sho;
			defense = def;
			pass = pas;
			physical = phy;
		}
		public String getName()
			{
				return name;
			}
		public void setName(String name)
			{
				this.name = name;
			}
		public String getNationality()
			{
				return nationality;
			}
		public void setNationality(String nationality)
			{
				this.nationality = nationality;
			}
		public String getTeam()
			{
				return team;
			}
		public void setTeam(String team)
			{
				this.team = team;
			}
		public String getPosition()
			{
				return position;
			}
		public void setPosition(String position)
			{
				this.position = position;
			}
		public int getOverall()
			{
				return overall;
			}
		public void setOverall(int overall)
			{
				this.overall = overall;
			}
		public int getPace()
			{
				return pace;
			}
		public void setPace(int pace)
			{
				this.pace = pace;
			}
		public int getDribble()
			{
				return dribble;
			}
		public void setDribble(int dribble)
			{
				this.dribble = dribble;
			}
		public int getShot()
			{
				return shot;
			}
		public void setShot(int shot)
			{
				this.shot = shot;
			}
		public int getDefense()
			{
				return defense;
			}
		public void setDefense(int defense)
			{
				this.defense = defense;
			}
		public int getPass()
			{
				return pass;
			}
		public void setPass(int pass)
			{
				this.pass = pass;
			}
		public int getPhysical()
			{
				return physical;
			}
		public void setPhysical(int physical)
			{
				this.physical = physical;
			}
	}
