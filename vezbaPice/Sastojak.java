package vezbaPice;

public class Sastojak {
	
	private String naziv;
	private int kolicinaUKg;
	private int cenaPoKg;
	
	public Sastojak(String naziv, int kolicinaUKg, int cenaPoKg) {
		super();
		this.naziv = naziv;
		this.kolicinaUKg = kolicinaUKg;
		this.cenaPoKg = cenaPoKg;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public int getKolicinaUKg() {
		return kolicinaUKg;
	}

	public void setKolicinaUKg(int kolicinaUKg) {
		this.kolicinaUKg = kolicinaUKg;
	}

	public int getCenaPoKg() {
		return cenaPoKg;
	}

	public void setCenaPoKg(int cenaPoKg) {
		this.cenaPoKg = cenaPoKg;
	}
	
	public int cenaSastojka()
	{
		return kolicinaUKg * cenaPoKg;
	}
	
	public void stampaSastojak()
	{
		System.out.println("(" + naziv + "), (" + cenaSastojka() + ")");
	}
	
	

}
