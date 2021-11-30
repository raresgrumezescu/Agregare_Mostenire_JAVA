package laborator4;

//import java.lang.Math

class Patrulater {
    public int latura1, latura2, latura3, latura4;
    public double unghi1, unghi2, unghi3, unghi4;
 
    public Patrulater() {
        this(0, 0, 0, 0);
    }
 
    public Patrulater(int latura1, int latura2, int latura3, int latura4) {
        this.latura1 = latura1;
        this.latura2 = latura2;
        this.latura3 = latura3;
        this.latura4 = latura4;
    }
 
    public Patrulater(double unghi1, double unghi2, double unghi3, double unghi4) {
        this(0, 0, 0, 0, unghi1, unghi2, unghi3, unghi4);
    }
 
    public Patrulater(int latura1, int latura2, int latura3, int latura4,
                      double unghi1, double unghi2, double unghi3, double unghi4) {
        this(latura1, latura2, latura3, latura4);
        this.unghi1 = unghi1;
        this.unghi2 = unghi2;
        this.unghi3 = unghi3;
        this.unghi4 = unghi4;
    }
 
    public int perimetru() {
        int result;
        result = latura1 + latura2 + latura3 + latura4;
        return result;
    }
}

class Paralelogram extends Patrulater{
	
	public Paralelogram(int laturaMica, int laturaMare,
            double unghiAscutit, double unghiObtuz) {
		super (laturaMica, laturaMare, laturaMica, laturaMare, unghiAscutit, unghiObtuz, unghiAscutit, unghiObtuz);
		
	}
	
	public double arie () {
		return super.latura1 * super.latura2 * Math.sin (super.unghi1); 
	}
}

class Romb extends Paralelogram{
	public double diagonala1;
	public double diagonala2;
	
	public Romb(int latura,
            double unghiAscutit, double unghiObtuz) {
		super (latura, latura, unghiAscutit, unghiObtuz);
		diagonala1 = Math.sqrt (2 * latura * latura * (1 - Math.cos (unghiObtuz)));
		diagonala2 = Math.sqrt (2 * latura * latura * (1 - Math.cos (unghiAscutit)));
	}
	
	public double arie () {
		return  (diagonala1 * diagonala2) / 2;
	}
}

class Dreptunghi extends Paralelogram{
	
	public Dreptunghi(int lungime, int latime) {
		super (lungime, latime, Math.PI / 2, Math.PI / 2);
	}
	
	public double arie () {
		return  super.latura1 * super.latura2;
	}
}

class Patrat extends Dreptunghi {
	
	public Patrat (int latura) {
		super (latura, latura);
	}
	
	public double arie () {
		return  super.latura1 * super.latura2;
	}
}

public class Problema1 {

	public static void main(String[] args) {
		Paralelogram p = new Paralelogram (4, 6, Math.PI / 6, 5 * Math.PI / 6);
		Romb romb = new Romb (4, Math.PI / 6, 5 * Math.PI / 6);
		Dreptunghi dreptunghi = new Dreptunghi (4, 6);
		Patrat patrat = new Patrat (5);
		System.out.println ("Aria paralelogramului considerat este: " + p.arie());
		System.out.println ("Aria rombului considerat este: " + romb.arie());
		System.out.println ("Aria dreptnghiului considerat este: " + dreptunghi.arie());
		System.out.println ("Aria patratului considerat este: " + patrat.arie());
	}

}
