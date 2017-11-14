
public class Fada extends ReinodoGelo {

	Fada() {

	}

	private int durabilidadeMagia = 10;

	private void setDurabilidadeMagia(int durabilidadeMagia) {
		this.durabilidadeMagia = durabilidadeMagia;
	}

	public int getDurabilidadeMagia() {
		return durabilidadeMagia;
	}

	public int usaMagia() {
		if (durabilidadeMagia > 0) {
			durabilidadeMagia = durabilidadeMagia - 1;
		} else {
			System.out.println("A Mágia acabou.");
		}
		return 1;
	}

	public void incluirPontosDeVida() {

		if (getPontosDeVida() > 0 && getPontosDeVida() < 10) {

			setPontosDeVida(getPontosDeVida() + 3);
		}
	}

}
