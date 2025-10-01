package test_fonctionnelle;



import personnage.Druide;
import personnage.Gaulois;
import personnage.Romain;

public class TestGaulois {

	public static void main(String[] args) {
		Gaulois asterix, obelix;

		asterix = new Gaulois("Astérix", 8);
		obelix = new Gaulois("Obélix", 16);
		Romain minus = new Romain("Minus", 6);
		Romain brutus = new Romain("Brutus", 14);
		Druide panoramix = new Druide("Panoramix", 2);
		
		panoramix.fabriquerPotion(4, 3);
		panoramix.booster(obelix);
		panoramix.booster(asterix);
		
						

		
		for (int i = 0; i < 3; i++) {
			asterix.frapper(brutus);
		}
		
		
		
	}
}
