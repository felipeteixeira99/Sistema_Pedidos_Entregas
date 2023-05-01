
public class TestarCliente {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		
		cliente.setId(1);
		cliente.setNome("Felipera");
		cliente.setCpf("000.351.289.21");
		cliente.setEndereco("Rua 1, N 256");
		cliente.setTelefone("(62)9999-5656");

		System.out.println(cliente);
		System.out.println(cliente.toString());
	}

}
