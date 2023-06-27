package programfile;

public class Program126 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "My name is Vipul Kumar Gola";
		int count = 0;
		char[] p = s.toCharArray();

		for (char c : p) {
			if (c != ' ') {
				count++;
			}
		}
		System.out.println(count);
		System.out.println(s.length());
	}
}
