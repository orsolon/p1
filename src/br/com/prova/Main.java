package br.com.prova;

public class Main {

    /* Defina uma classe principal para a aplicação. Inicie o array com algumas instâncias de Usuario. Realize duas chamadas ao método buscar simulando, primeiro uma tentativa de login não encontrado, e na segunda, sucesso no login, ou seja, login encontrado.
        A aplicação responde "Não autorizado" em caso de falha, e "Seja bem-vindo [nome]" em caso de sucesso.
     */

    public static void main(String[] args) {
	        Usuario c1, c2, c3;
	       c1 = new Usuario("Maria", "soumaria", "123456");
	       c2 = new Usuario("Lucas", "soulucas", "112233");
	       c3 = new Usuario("Rodrigo", "sourodrigo", "666777");

	       c1.buscar("naosoumaria");
			System.out.println("Não autorizado");

			c1.buscar("soumaria");
			System.out.println("Seja bem vinda: " + c1.getNome());
	}

}
