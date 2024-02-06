package Java_basic_pgm;

public class remove_special_character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//&*^#
		//String name="s&*^#n&*^#e&*^#h&*^#a&*^#l&*^#";
		//String b=name.replaceAll("[^a-zA-Z0-9]","");
		//System.out.println(b);
	

String name="   m   a   h   e   s   h   ";
//String trimmedstr= name.trim();
String s=name.replaceAll("\\s", "");
System.out.println(s);
}
}