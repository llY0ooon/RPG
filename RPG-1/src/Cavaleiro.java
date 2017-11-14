
public class Cavaleiro extends ReinodoFogo {

	Cavaleiro() {

	}

	private int durabilidadeEspada = 10;

	public int getDurabilidadeEspada() {
		return durabilidadeEspada;
	}

	private void setDurabilidadeEspada(int durabilidadeEspada) {
		this.durabilidadeEspada = durabilidadeEspada;
	}

	public int usarEspada() {

		if (durabilidadeEspada > 0) {

			durabilidadeEspada = durabilidadeEspada - 1;

		} else {
			System.out.println("A espada Quebrou!");
		}

		return 1;
	}

}
