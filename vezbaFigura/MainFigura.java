package vezbaFigura;

public class MainFigura {

	public static void main(String[] args) {
		
		Figura trougao1 = new JednakostranicniTrougao(2);
		Figura trougao2 = new JednakostranicniTrougao(3.5);
		Figura pravougaonik1 = new Pravougaonik(2, 3);
		Figura pravougaonik2 = new Pravougaonik(1.5, 4);
		Figura pravougaonik3 = new Pravougaonik(3, 6);
		
		Figura[] nizFigura = {trougao1, trougao2, pravougaonik1, pravougaonik2, pravougaonik3};
		
		double zbirPovrsina = trougao1.povrsina() + trougao2.povrsina() + pravougaonik1.povrsina() + pravougaonik2.povrsina() + pravougaonik3.povrsina();
		double zbirObima = trougao1.obim() + trougao2.obim() + pravougaonik1.obim() + pravougaonik2.obim() + pravougaonik3.obim();
		
		System.out.println("Zbir povrsina je " + zbirPovrsina);
		System.out.println("Zbir obima je " + zbirObima);
		
		for (int i = 0; i < nizFigura.length; i++) 
		{
			nizFigura[i].stampa();
		}

	}

}
