package vezbaAutobus;

public class Putnik extends Covek {
	
	private double novac;

	public Putnik(String ime, String prezime, double novac) {
		super(ime, prezime);
		this.novac = novac;
	}

	public double getNovac() {
		return novac;
	}

	
	public boolean dodajNovac(double novacZaDodavanje)
	{
		novac = novac + novacZaDodavanje;
		return true;
	}
	
	public boolean oduzmiNovac(double novacZaOduzimanje)
	{
		if(novac >= novacZaOduzimanje)
		{
			novac = novac - novacZaOduzimanje;
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	public void stampaPutnik()
	{
		super.stampaCovek();
		System.out.println(", kolicina novca: " + novac);
	}

}
