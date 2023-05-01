
public class TestarPedido {

	public static void main(String[] args) {
		Pedido pedido = new Pedido();
		Cliente cliente = new Cliente();
		Produto produto = new Produto();
		Entregador entregador = new Entregador();
		
		pedido.setId(1);
		pedido.setCliente(cliente); //atributo cliente está recebendo um objeto do tipo cliente
		pedido.getCliente().setNome("Hary Potter"); //o nome do cliente 
		pedido.setProduto(produto); //atributo produto recebendo um objeto do tipo produto
		pedido.getProduto().setNome("Pizza de Bacon"); //nome do produto
		pedido.setQuantidade(2); //quantidade de produtos dentro do pedido
		pedido.getProduto().setPreco(10); //preco do produto 
		
		//Dados do entregador
		entregador.setNome("Motoqueiro Fantasma");
		entregador.setVeiculo("CG Titan Azul");
	
		//Pedido
		System.out.println("ID do Pedido: " + pedido.getId());
		System.out.println("Cliente: " + pedido.getCliente().getNome());
		System.out.println("Pedido: " + pedido.getProduto().getNome());
		System.out.println("Valor do Pedido: R$" + pedido.Valor());
		System.out.println("Status do Pedido: " + pedido.getStatus());
		
		entregador.PegarPedido(pedido);
		System.out.println("O entregador: " + entregador.getNome() + " coletou o seu pedido!");
		System.out.println("O veiculo do entregador e: " + entregador.getVeiculo());
		System.out.println("Status atual do pedido: " + pedido.getStatus());
		entregador.entregarPedido(pedido);
		System.out.println("O seu pedido foi entregue!");
		System.out.println("Status atual do pedido: " + pedido.getStatus());

	}

}
