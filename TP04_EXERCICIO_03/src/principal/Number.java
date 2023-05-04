package principal;

import java.util.Objects;

public class Number {
	private int number;
	
	public Number(int number) {
		this.number = number; 
	}
	
	public Number(){
		
	}
	
	public void setValue(int number) {
		this.number = number; 
	}
	
	public int getValue() {
		return number;
	}
	
	@Override
	public String toString() {
		return "|"+ this.number+"|";
	}

	
	@Override
	public int hashCode() {
		return this.number;
	}

	@Override
	public boolean equals(Object obj) {
		Number n = (Number) obj;
		return this.number == n.number;
	}

	

}