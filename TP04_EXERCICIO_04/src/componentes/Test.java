package componentes;


public class Test {
	public static void main(String[] args) throws Exception{
		Container c = new Container();
		
			c.addForm(new Endereço("Ana Luiza", 20, "111111", "Minas Gerais", "Joao Monlevade", "AlbertoScharle"));
		
		c.print(System.out);
			
	}
}

