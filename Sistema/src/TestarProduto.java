
public class TestarProduto {

	public static void main(String[] args) {
		
		Produto produto = new Produto();
		produto.setDescricao("Arroz");
		produto.setId(1);
		produto.setNome("Teste");
		
		produto.toString();
		
		System.out.println(produto.toString());

	}

}
