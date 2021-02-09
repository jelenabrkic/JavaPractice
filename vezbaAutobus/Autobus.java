package vezbaAutobus;

import java.util.List;

public class Autobus {
	
	private String naziv;
	private double cenaKarte;
	private Vozac vozac;
	private List<Putnik> putnici;
	
	public Autobus(String naziv, double cenaKarte, Vozac vozac, List<Putnik> putnici) {
		super();
		this.naziv = naziv;
		this.cenaKarte = cenaKarte;
		this.vozac = vozac;
		this.putnici = putnici;
	}

	public String getNaziv() {
		return naziv;
	}

	public double getCenaKarte() {
		return cenaKarte;
	}
	
	public void dodajPutnika(Putnik putinik)
	{
		putnici.add(putinik);
	}
	
	public void ukloniPutnika(String ime, String prezime)
	{
		int index = -1;
		for (int i = 0; i < putnici.size(); i++) {
			if(ime.equals(putnici.get(i).getIme()) && prezime.equals(putnici.get(i).getPrezime()))
			{
				index = i;
			}
		}
		if(index != -1)
		{
			putnici.remove(index);
		}
	}
		
	
	public void ukloniVozaca()
	{
		this.vozac = null;
	}
	
	public void setVozac(Vozac vozac) {
		this.vozac = vozac;
	}

	public boolean vozacPrisutan()
	{
		if(this.vozac != null)
		{
			return true;
		}
		return false;
	}
	
	public void naplatiKartu()
	{
		if(vozacPrisutan())
		{
			for (int i = 0; i < putnici.size(); i++)
			{
				putnici.get(i).oduzmiNovac(cenaKarte);
			}
				
		}
	}
	
	public void stampajAutobus()
	{
		System.out.println("Naziv autobusa " + naziv + ", cena karte je: " + cenaKarte);
		if(vozacPrisutan())
		{
			System.out.println("Vozac je: ");
			vozac.stampaVozac();
		}
		else
		{
			System.out.println("Nema vozaca u autobusu");
		}
		
		System.out.println("Putnici su: ");
		for (int i = 0; i < putnici.size(); i++)
		{
			putnici.get(i).stampaPutnik();
		}
		
		
	}
	

}
