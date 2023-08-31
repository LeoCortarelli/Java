package Subsistemas_de_jogos;

public class SistemaFacate {
	protected SistemaDeAudio audio;
	protected SistemaDeImput input;
	protected SistemaDeVideo video;
	
	public void iniciaSubSistemas() {
		this.video = new SistemaDeVideo();
		this.video.configurarCores();
		this.video.configurarResolucao();
		
		this.input = new SistemaDeImput();
		this.input.configurarJoystick();
		this.input.configurarTeclado();
		
		this.audio = new SistemaDeAudio();
		this.audio.configurarCanais();
		this.audio.configurarFrequencia();
		this.audio.configurarVolume();
	}
	
	public void reproduzirAudio(String arquivo) {
		this.audio.reproduzirAudio(arquivo);
	}
	
	public void renderizarImagem(String img) {
		this.video.renderezarImagem(img);
	}
	
	public void lerImput() {
		this.input.lerImput();
	}
}
