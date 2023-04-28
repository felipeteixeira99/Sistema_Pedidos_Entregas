/*Classe Cliente: Crie uma classe chamada "Cliente" com os atributos: id (int), nome
(String), cpf (String), endereco (String) e telefone (String). Adicione métodos para
definir (set) e obter (get) os valores desses atributos.*/

public class Cliente {
	private int id;
	private String nome;
	private String cpf;
	private String endereco;
	private String telefone;
	
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
	public String getCpf() {
		return this.cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEndereco() {
		return this.endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return this.telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	@Override
	public String toString() {
		return ("ID:" + id + "\n" + "Nome:" + nome +
				"\n"  + "CPF:" + cpf + "\n" + "Endereço:" +  endereco + "\n" +"Telefone:" +  telefone);
	}
}

//teste de alteracao pelo o vs code

