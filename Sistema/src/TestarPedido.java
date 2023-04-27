
public class TestarPedido {

	public static void main(String[] args) {
		Pedido pedido = new Pedido();
		Cliente cliente = new Cliente();
		Produto produto = new Produto();
		
		
		pedido.setId(1);
		pedido.setCliente(cliente); //atributo cliente está recebendo um objeto do tipo cliente
		pedido.getCliente().setNome("Hary Potter"); //o nome do cliente 
		pedido.setProduto(produto); //atributo produto recebendo um objeto do tipo produto
		pedido.getProduto().setNome("Pizza de Bacon"); //nome do produto
		pedido.setQuantidade(1);
		pedido.getProduto().setPreco()
		
		//Calculo
		pedido.setQuantidade(1); //quantidade de produtos que o cliente pediu 
		pedido.setQuantidade(2);
		pedido.setProduto("13");
		
		
		
		//Dados do pedido
		System.out.println("ID do Pedido: " + pedido.getId());
		System.out.println("Cliente: " + pedido.getCliente().getNome());
		System.out.println("Pedido: " + pedido.getProduto().getNome());
		

	}

}
