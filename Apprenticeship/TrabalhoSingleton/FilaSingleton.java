package TRABALHO;

import java.util.ArrayList;

public class FilaSingleton {
	
	private static FilaSingleton filaSingleton;
	
	
	private ArrayList<Usuario> filaUsuario;
	
	private FilaSingleton(){
		filaUsuario = new ArrayList<>();
	}
	
	public static FilaSingleton getFilaSingleton() {
		if(filaSingleton == null) {
			filaSingleton = new FilaSingleton();
		}
		return filaSingleton;
	}

	
	
	public void adicionaUsuario(Usuario user) {
		filaUsuario.add(user);
	}
	
	public Usuario retirarUsuario() {
		Usuario users = filaUsuario.remove(0);
		return users;
	}
	
	public void mostraFila() {
		for (Usuario user : filaUsuario) {
			System.out.println(user.toString());
		}
	}
}
