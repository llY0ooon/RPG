
public class Exc {

	public static void main(String[] args) {
		
		Cavaleiro cv = new Cavaleiro();
		cv.setNome("Maquininha");
		cv.setPontosDeVida(10);
		
		
		Mago mg = new Mago();
		mg.setNome("Valesca");
		mg.setPontosDeVida(10);
		
		
		Monstro mo = new Monstro();
		mo.setNome("Chikão");
		mo.setPontosDeVida(10);
		
		
		Fada fd = new Fada();
		fd.setNome("Valdomiro");
		fd.setPontosDeVida(10);
		
		
		//Agora a Batalha..//
		// Valesquinha VS Chikão//
		
		Batalha bt=new Batalha();
		bt.setPersonagemFogo(mg);
		bt.setPersonagemGelo(mo);
		
		mo.retiarPontosDeVida(mg.usarPoMagico());
		mo.retiarPontosDeVida(mg.usarPoMagico());
		mo.retiarPontosDeVida(mg.usarPoMagico());
		mo.retiarPontosDeVida(mg.usarPoMagico());
		mo.retiarPontosDeVida(mg.usarPoMagico());
		
		mg.retiarPontosDeVida(mo.darSoco());
		mg.retiarPontosDeVida(mo.darSoco());
		mg.retiarPontosDeVida(mo.darSoco());
		
		mg.incluirPontosDeVida();
		
		mg.retiarPontosDeVida(mo.darSoco());
		mg.retiarPontosDeVida(mo.darSoco());
		
		mg.incluirPontosDeVida();
		
		mg.retiarPontosDeVida(mo.darSoco());
		
		
		
		
		
		
		System.out.println("O Monstro tem: "+ mo.getPontosDeVida() + " de Vida.");
		System.out.println("O Mago tem: "+ mg.getPontosDeVida() + " de vida.");
		
		
		System.out.println("Vencedor: " + bt.vencedor());
		System.out.println("Perdedor: " + bt.perdedor());
		

	}

}
