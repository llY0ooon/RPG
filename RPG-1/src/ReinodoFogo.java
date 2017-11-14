
public class ReinodoFogo extends Criacao {
	
	ReinodoFogo(){
		
	}
	
	
	
	public void retiarPontosDeVida(int valor) {
		if(getPontosDeVida()>0) {
			setPontosDeVida(getPontosDeVida() - valor);
		}
		else {
			personagemMorreu();
		}
	}

}
