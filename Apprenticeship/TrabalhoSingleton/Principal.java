package TRABALHO;

import java.util.ArrayList;
import java.util.List;


public class Principal {

	public static void main(String[] args) {
		FilaSingleton atendenteRecepcionista = FilaSingleton.getFilaSingleton();
		FilaSingleton atendente_01 = FilaSingleton.getFilaSingleton();
		FilaSingleton atendente_02 = FilaSingleton.getFilaSingleton();
		
		Usuario usr01 = new Usuario(22, "Adson");
		atendenteRecepcionista.adicionaUsuario(usr01);
		atendenteRecepcionista.mostraFila();
		
		System.out.println("\n -------------------- \n");
		
		Usuario usr02 = new Usuario(13, "Fabio Santos");
		atendenteRecepcionista.adicionaUsuario(usr02);
		atendenteRecepcionista.mostraFila();
		
		System.out.println("\n -------------------- \n");
		
		Usuario usr03 = new Usuario(5, "Fausto Vera");
		Usuario usr04 = new Usuario(9, "Yuri Alberto");
		Usuario usr05 = new Usuario(12, "Cassio");
		Usuario usr06 = new Usuario(4, "Gil");
		
		atendenteRecepcionista.adicionaUsuario(usr03);
		atendenteRecepcionista.adicionaUsuario(usr04);
		atendenteRecepcionista.adicionaUsuario(usr05);
		atendenteRecepcionista.adicionaUsuario(usr06);
		atendenteRecepcionista.mostraFila();
		
		System.out.println("\n -------------------- \n");
		
		atendente_01.adicionaUsuario(usr01);
		atendente_01.retirarUsuario();
		atendente_01.mostraFila();
		
		System.out.println("\n -------------------- \n");
		
		atendente_02.adicionaUsuario(usr01);
		atendente_02.retirarUsuario();
		atendente_02.mostraFila();
		
		
	}

}
