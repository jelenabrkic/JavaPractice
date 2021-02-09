package vezbaAutobus;

public class Covek {
	
	private String ime;
	private String prezime;
	
	public Covek(String ime, String prezime) {
		super();
		this.ime = ime;
		this.prezime = prezime;
	}

	public String getIme() {
		return ime;
	}

	public String getPrezime() {
		return prezime;
	}
	
	public void stampaCovek()
	{
		System.out.println("Ime: " + ime + ", prezime: " + prezime + "");
	}
	
	
}
