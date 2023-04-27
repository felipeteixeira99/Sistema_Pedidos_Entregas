/*
 * Classe Pedido: Crie uma classe chamada "Pedido" com os atributos: id (int), cliente
(objeto da classe Cliente), produto (objeto da classe Produto), quantidade (int) e
status (String - "Aguardando", "Em trânsito" ou "Entregue"). Adicione métodos para
definir (set) e obter (get) os valores desses atributos e um método para calcular o
valor total do pedido (quantidade * preço do produto).
 */

public class Pedido {
	private int id;
	private Cliente cliente;
	private Produto produto;
	private int quantidade;
	private String status;
	
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Cliente getCliente() {
		return this.cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Produto getProduto() {
		return this.produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public int getQuantidade() {
		return this.quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public String getStatus() {
		return this.status;
		//TODO Aguardando, Em transito, Entregue 
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	//Funcao que calcula o valor total do pedido 
	public double getValor() {
		int valor = 0;
		valor = (int) (this.getQuantidade() * this.produto.getPreco());
		return valor;
		}

	//TODO Metodo para calcular o valor total do pedido
	// quantidade * preco do produto
}
