
public abstract class Item { 	//Classe Abstrata, quando a classe � abstrata ela n�o pode ser instanciada
	private int posX;
	private int posY;
	
	public abstract void pegar(); //M�todo Abstrato, quando m�todo � abstrato ele n�o pode ser implementado

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}
	
	
}
