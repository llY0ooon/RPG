
public class ReinodoGelo extends Criacao {
	
	ReinodoGelo(){
		
	}
	
	
	
	public void retiarPontosDeVida(int valor) {
		if(getPontosDeVida()>0) {
			setPontosDeVida(getPontosDeVida() - valor);
		}
		else {
			personagemMorreu();
		}
	}
	
	public void incluirPontosDeVida(int valor) {
		if(getPontosDeVida()>0 && getPontosDeVida() <10) {
			setPontosDeVida(getPontosDeVida() + valor);
		}
		else {
			System.out.println("Personagem não pode ser curado.!");
		}
	}

}
