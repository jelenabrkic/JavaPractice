package vezbaPlaninar;

public class Alpinista extends Planinar {
	
	private int poeni;

	public Alpinista(int id, String ime, String prezime, int poeni) {
		super(id, ime, prezime);
		this.poeni = poeni;
	}

	public int getPoeni() {
		return poeni;
	}

	public void setPoeni(int poeni) {
		this.poeni = poeni;
	}

	@Override
	public void stampaj() {
		System.out.println("Alpinista, id: " + getId());
		System.out.println("ime: " + getIme() + " " + getPrezime());
		System.out.println("Broj poena: " + poeni);
	}

	@Override
	public double clanarina() {
		return 1500 - poeni * 50;
	}

	@Override
	public boolean uspesanUspon(Planina planina) {
		if(planina.getVisinaPlanine() < 4000)
		{
			return true;
		}
		return false;
	}
	
	
	

}
