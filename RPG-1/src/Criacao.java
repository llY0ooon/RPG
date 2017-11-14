
public class Criacao {
	Criacao(){
		
	}
	
	private String nome;
	private int pontosDeVida;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getPontosDeVida() {
		return pontosDeVida;
	}
	public void setPontosDeVida(int pontosDeVida) {
		this.pontosDeVida = pontosDeVida;
	}
	
	public boolean personagemMorreu() {
		
		if (getPontosDeVida()<=0) {
			
			return true;
			
		}else {
			return false;
		}
		
		
	}

}
