package Subsistemas_de_jogos;

public class PrincipalMain {

	public static void main(String[] args) {
		
		SistemaFacate jogo1 = new SistemaFacate();
		
		jogo1.iniciaSubSistemas();
		jogo1.renderizarImagem("Super Mario Bros");
		jogo1.reproduzirAudio("Tocando musica do Mario");
		jogo1.lerImput();

	}

}
