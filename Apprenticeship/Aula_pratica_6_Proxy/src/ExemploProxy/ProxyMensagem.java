package ExemploProxy;

public class ProxyMensagem implements Mensagem{
	
	MensagemReal msg = new MensagemReal();
	
	public void mostraMensagem() {
		System.out.println("Proxy executa algo ANTES de MensagemReal !");
		msg.mostraMensagem();
		System.out.println("Proxy executa algo APOS de MensagemReal !");
	}
}
