package AvaliacaoSomativa;

public class PrincipalLivro {

	public static void main(String[] args) {
		Livro livro = new Livro ("Percy Jackson","Victor",167);
		System.out.println("---------------------------");
		System.out.println("Nome: "+ livro.getNome());
		System.out.println("Cpf: "+ livro.getAutor());
		System.out.println("Rg: "+ livro.getPaginas());

	}

}
