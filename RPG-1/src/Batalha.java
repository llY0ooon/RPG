
public class Batalha {
	Batalha(){
		
	}
	
	private ReinodoGelo personagemGelo;
	private ReinodoFogo personagemFogo;
	
	
	public ReinodoGelo getPersonagemGelo() {
		return personagemGelo;
	}
	public void setPersonagemGelo(ReinodoGelo personagemGelo) {
		this.personagemGelo = personagemGelo;
	}
	public ReinodoFogo getPersonagemFogo() {
		return personagemFogo;
	}
	public void setPersonagemFogo(ReinodoFogo personagemFogo) {
		this.personagemFogo = personagemFogo;
	}
	
	public String vencedor() {
		if (personagemGelo.getPontosDeVida() < personagemFogo.getPontosDeVida()) {
			return personagemFogo.getNome();
		} else {
			return personagemGelo.getNome();
		}
		
	}
	
	public String perdedor() {
		
		if (personagemGelo.getPontosDeVida() > personagemFogo.getPontosDeVida()) {
			return personagemFogo.getNome();
		} else {
			return personagemGelo.getNome();
		}
		
	}
	

}
