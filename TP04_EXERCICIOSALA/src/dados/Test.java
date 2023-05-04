package dados;

public class Test {
	public static void main(String[] args) throws Exception{
		Container c = new Container();
		
			c.addPessoa(new Fisica("Ana Luiza", 20, "111111"));
			c.addPessoa(new Juridica("UFOP", 50, "52525555"));
		
		c.print(System.out);
			
	}
}

