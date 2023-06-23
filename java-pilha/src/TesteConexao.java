
public class TesteConexao  {

	public static void main(String[] args) {
	
		try (Conexao conexao= new Conexao()){
			conexao.leDados();
		} catch (IllegalStateException ex) {
			System.out.println("Deu erro na conexão");
		} 
		
		//--------------------------------
		
//		Conexao c = null;
//		try {
//			c = new Conexao();
//			c.leDados();
//
//		} catch (IllegalStateException ex) {
//			System.out.println("Deu erro na conexão");
//		} finally {
//			c.close();
//		}
	}
}


