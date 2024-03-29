/*Classe Produto: Crie uma classe chamada "Produto" com os atributos: id (int), nome
(String), descricao (String) e preco (double). Adicione métodos para definir (set) e
obter (get) os valores desses atributos e um método para exibir as informações
completas do produto dentro de uma String.*/

public class Produto {
	private int id;
	private String nome;
	private String descricao;
	private double preco;
	
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
	public String getDescricao() {
		return this.descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}	
	
	public double getPreco() {
		return this.preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	//Retorna em formato de str todos os valores armazenados nos atributos da classe 
	@Override
	public String toString() {
		return  ("ID:" + id + "\n" + "Nome:" + nome + "\n" + "Descricao:" + descricao);
	}
}
