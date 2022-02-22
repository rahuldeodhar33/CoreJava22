package Package1;

public class VowelSwitchClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "Clean India green India Go India aaa";
		int num = 0;
		for (int index=0;index<str1.length();index++) {
			
			char temp = str1.charAt(index);
			switch(temp) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				num++;
				break;
			}
		}
	System.out.println("Total count of vovel are " + num);
		
	}

}
