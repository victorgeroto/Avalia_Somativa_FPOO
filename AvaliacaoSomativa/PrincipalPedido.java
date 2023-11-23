package AvaliacaoSomativa;

public class PrincipalPedido {

	public static void main(String[] args) {
		
		Pedido pedido = new Pedido (1,"Biscoito",2);
		System.out.println("id: "+ pedido.getId());
		System.out.println("Nome: " + pedido.getProduto());
		System.out.println("senha: "+ pedido.getQuantidade());

		

	}

}
