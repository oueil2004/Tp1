package personnage;

public class Chaudron {

	private int quatitePotion;
	private int forcePotion;
	
	public void remplirChaudron(int forcePotion,int quantite) {
		this.quatitePotion = quantite;
		this.forcePotion = forcePotion;
		
	}
	
	public boolean resterPotion() {
		if (this.quatitePotion > 0) {
			return true;
			
		} else {
				return false;
		}
	}
	
	public int prendreLouche() {
		if (this.quatitePotion <= 0) {
			this.forcePotion = 0;			
		} else {
			this.quatitePotion -= 1;
		}
		
		return this.forcePotion;
		
	}
}
