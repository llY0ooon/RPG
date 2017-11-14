
public class Mago extends ReinodoFogo {
	
	Mago(){
		
	}
	
	private int quantidadePoMagico=10;

	private void setQuantidadePoMagico(int quantidadePoMagico) {
		this.quantidadePoMagico = quantidadePoMagico;
	}

	public int getQuantidadePoMagico() {
		return quantidadePoMagico;
	}
	
	public int usarPoMagico() {
		if (quantidadePoMagico>0) {
			quantidadePoMagico=quantidadePoMagico-1;
		} else {
			System.out.println("o pó acabou.");
		}
		return 1;
	}
	
	public void incluirPontosDeVida() {
		if (getPontosDeVida()>0 && getPontosDeVida()<10) {
			
			setPontosDeVida(getPontosDeVida() + 1);
		}
		
	}
	

}
