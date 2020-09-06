public class SwitchExpression {
	public static void main(String[] args) {
		foo(1);
	}

	public static int foo(int i) {
		int tw = switch (i) {
		  case 1 -> {
			int yield = 10;
			yield yield;
		  }
		  default -> 0; 
		};
		return tw;
	}
}

//one case
//type mismatch
//default
// mixing
// yield inside block
// yield as a type
// yield as a var name
