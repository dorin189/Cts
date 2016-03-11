package clase;

public class Caine
{
		private String nume;
		private int varsta;
		private double greutate;
		private String culoare;
		private int inaltime;
		
		
		private static Caine instance = null;

		private Caine()
		{
			this.nume = "Donald";
			this.varsta = 3;
			this.greutate = 19;
			this.culoare = "brun";
			this.inaltime = 40;
		}
		
		private Caine(String n, int v, double g, String c, int i) {
			this.nume = n;
			this.varsta = v;
			this.greutate = g;
			this.culoare = c;
			this.inaltime = i;
		}
		
		
		
		public static Caine getInstance(String n , int v, double g, String c, int i)
		{
			if(instance==null) {
				instance = new Caine(n, v, g, c, i);
			}
			return instance;
		}

		@Override
		public String toString()
		{
			return "nume= " + nume + ", varsta=" + varsta + ", greutate="
					+ greutate + ", culoare=" + culoare + ", inaltime="
					+ inaltime ;
		}
}




