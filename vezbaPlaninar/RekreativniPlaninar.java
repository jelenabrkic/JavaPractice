package vezbaPlaninar;

public class RekreativniPlaninar extends Planinar {

	
	private int tezinaOpreme;
	private String nazivOkruga;
	private int maksUspon;
	
	public RekreativniPlaninar(int id, String ime, String prezime, int tezinaOpreme, String nazivOkruga,
			int maksUspon) {
		super(id, ime, prezime);
		this.tezinaOpreme = tezinaOpreme;
		this.nazivOkruga = nazivOkruga;
		this.maksUspon = maksUspon;
	}

	public int getTezinaOpreme() {
		return tezinaOpreme;
	}

	public String getNazivOkruga() {
		return nazivOkruga;
	}

	public int getMaksUspon() {
		return maksUspon;
	}


	@Override
	public void stampaj() {
		System.out.println("Rekreativac, id: " + getId());
		System.out.println("ime: " + getIme() + " " + getPrezime());
		System.out.println("Okrug: " + nazivOkruga);
	}

	@Override
	public double clanarina() {
		return 1000;
	}

	@Override
	public boolean uspesanUspon(Planina planina) {
		if(maksUspon - tezinaOpreme * 50 >= planina.getVisinaPlanine())
		{
			return true;
		}
		return false;
	}
	
	
	
	
	
	
}
