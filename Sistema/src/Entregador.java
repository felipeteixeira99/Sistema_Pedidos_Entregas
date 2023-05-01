
public class Entregador {
	
	private int id;
	private String nome;
	private String veiculo;
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getVeiculo() {
		return this.veiculo;
	}
	
	public void setVeiculo(String veiculo) {
		this.veiculo = veiculo;
	}
	
	public void PegarPedido(Pedido pedido) {
		pedido.setStatus(StatusPedido.EM_TRANSITO);
	}
	
	public void entregarPedido(Pedido pedido) {
		pedido.setStatus(StatusPedido.ENTREGUE);
	}
	
	//Teste entregador
	public static void main(String[] args) {
		Produto produto = new Produto();
		Entregador entregador = new Entregador();
		Pedido pedido = new Pedido();
		
		
		/*entregador.setId(1);
		entregador.setNome("Teste");
		entregador.setVeiculo("BIZ");
		System.out.println("ID do Entregador: " +  entregador.getId());
		System.out.println("Nome do Entregador: " + entregador.getNome());
		System.out.println("Veiculo: " + entregador.getVeiculo());*/
		

		System.out.println(pedido.getStatus());
		entregador.PegarPedido(pedido);
		System.out.println(pedido.getStatus());
		entregador.entregarPedido(pedido);
		System.out.println(pedido.getStatus());
		
}
	
	
	
	// metodo chamado pegarPedido, metodo que recebe um objeto da classe produto e altera o seus status par
	//"Em transito"
	
	// Adicionar um metodo chamado "entregar pedido" que altera o status do pedido para "Entregue".
}
