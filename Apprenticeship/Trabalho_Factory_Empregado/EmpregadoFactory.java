package Trabalho_Factory_Empregado;

public class EmpregadoFactory {
	
	public static Empregado getEmpregado(int cargo, String nome, String email, int anoContratacao) {
		switch (cargo) {
		case 1:
			return new Gerente (nome, email, anoContratacao);
		case 2:
            return new PorComissao(nome, email, anoContratacao);
        case 3:
            return new PorHora(nome, email, anoContratacao);
        case 4:
            return new PorItem(nome, email, anoContratacao);
		default:
			return null;
		}
	}
	
}
