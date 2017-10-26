
public class DelimiterChecker  {

	public DelimiterChecker() {

	}
	public static void main(String[] args) {
		String test = "{[()]}";
		String test2 = "[{]}";
		String test3 = "{}{()}[]";
		DelimiterChecker x = new DelimiterChecker();
		System.out.println(x.check(test));
		System.out.println(x.check(test2));
		System.out.println(x.check(test3));
	}
	public boolean check(String str) {
		StackX stackX = new StackX(str.length());
		for(int s = 0;s < str.length();s++) {
			System.out.println(str.substring(s, s+1));
			if (str.substring(s, s+1).equals("{")) {
				stackX.push('{');

			}
			if (str.substring(s, s+1).equals("[")) {
				stackX.push('[');

			}
			if (str.substring(s, s+1).equals("(")) {
				stackX.push('(');

			}
			if (str.substring(s, s+1).equals(")")) {
				if(stackX.peek() == '(') {
					stackX.pop();

				} else return false;
			}
			if (str.substring(s, s+1).equals("]")) {
				if(stackX.peek() == '[') {
					stackX.pop();

				} else return false;
			}
			if (str.substring(s, s+1).equals("}")) {
				if(stackX.peek() == '{') {
					stackX.pop();

				} else return false;

			}


		}
		if(stackX.isEmpty()) {
			return true;
		} else return false;
	}
	
}
