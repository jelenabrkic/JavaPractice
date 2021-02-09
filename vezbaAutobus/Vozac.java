package vezbaAutobus;

public class Vozac extends Covek {
	
	private String zvanje;

	public Vozac(String ime, String prezime) {
		super(ime, prezime);
		this.zvanje = "sofer";
	}

	public String getZvanje() {
		return zvanje;
	}

	
	public void stampaVozac()
	{
		super.stampaCovek();
		System.out.println(", zanimanje: " + zvanje);
	}

}
