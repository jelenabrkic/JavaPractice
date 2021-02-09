package vezbaPlaninar;

public class Planina {

	private String ime;
	private String nazivDrzave;
	private double visinaPlanine;
	
	public Planina() {
		
	}

	public Planina(String ime, String nazivDrzave, double visinaPlanine) {
		super();
		this.ime = ime;
		this.nazivDrzave = nazivDrzave;
		this.visinaPlanine = visinaPlanine;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getNazivDrzave() {
		return nazivDrzave;
	}

	public void setNazivDrzave(String nazivDrzave) {
		this.nazivDrzave = nazivDrzave;
	}

	public double getVisinaPlanine() {
		return visinaPlanine;
	}

	public void setVisinaPlanine(double visinaPlanine) {
		this.visinaPlanine = visinaPlanine;
	}
	
	
}
