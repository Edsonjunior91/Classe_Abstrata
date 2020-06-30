
public abstract class Item { 	//Classe Abstrata, quando a classe é abstrata ela não pode ser instanciada
	private int posX;
	private int posY;
	
	public abstract void pegar(); //Método Abstrato, quando método é abstrato ele não pode ser implementado

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
