import Math.Sum;

public class Hello {

	public static void main(String[] args) {
		Sum mySum = new Sum(2,3);
		StringBuilder s = new StringBuilder();
		s.append("Hello World!");
		s.append(mySum.result());
		
		System.out.println(s);

	}

}
