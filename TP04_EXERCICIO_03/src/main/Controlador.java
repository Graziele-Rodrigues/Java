package main;
import principal.Number;

public class Controlador {
	public static void main(String[] args) {
		Number n1 = new Number(1);
		Number n2 = new Number(5);
		
		System.out.println("Valor membro 1: "+ n1.getValue());
		System.out.println("Valor membro 2: "+ n2.getValue());
	
		System.out.println("São iguais: "+n1.equals(n2));
		System.out.println("Hashcode dos membros, respectivamente: "+n1.hashCode() + " | "+n2.hashCode());
		System.out.println("Dados armazenados: "+n1.toString()+n2.toString());
        
	}
}
