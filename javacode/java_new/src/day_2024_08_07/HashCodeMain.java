package day_2024_08_07;

import java.util.HashSet;
import java.util.Set;

class Num{
	private int num;
	
	public Num(int num) {
		this.num = num;
	}
	
	@Override
	public String toString() {
		return String.valueOf(num);
	}
	
	@Override
	public int hashCode() {
		return num;
	}
	
	@Override
	public boolean equals(Object obj) { 
		if(num == ((Num)obj).num)
			return true;
		else
			return false;
	}
}

public class HashCodeMain {

	public static void main(String[] args) {
		Set<Num> n1 = new HashSet<>();
		
		n1.add(new Num(1));
		n1.add(new Num(2));
		n1.add(new Num(2));
		
		System.out.println("인스턴스 수: " + n1.size());
		System.out.println(n1);
	}

}
