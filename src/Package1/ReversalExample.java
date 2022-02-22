package Package1;

public class ReversalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//reverse string variable, array, number
		String str1 = "Clean India green India Go India : I lOve you/U INDIA Palaash Rahul Deodhar";
		String revStr1 = "";
		for (int index=str1.length()-1;index>=0;index--) {
			revStr1 = revStr1 + str1.charAt(index);
		}
		System.out.println("Reverse String --> " + revStr1);
		
		//number of vowels "a,e,i,o,u"
		int num=0,num1=0,num2=0,num3= 0,num4=0,num5=0,num6=0,num7=0,num8=0,num9=0;
		
		for (int index=0; index<str1.length();index++) {
			if ( str1.charAt(index) == 'a') {
				num ++;
				
			}else if (str1.charAt(index)== 'A') {
				num1 ++;
			}else if (str1.charAt(index)== 'e') {
				num2 ++;
			}else if(str1.charAt(index)=='E') {
				num3 ++;
			}else if (str1.charAt(index)=='i') {
				num4 ++;
			}else if (str1.charAt(index)=='I') {
				num5 ++;
			}else if (str1.charAt(index)=='o') {
				num6 ++;
			}else if (str1.charAt(index)=='O') {
				num7 ++;
			}else if (str1.charAt(index)=='u') {
				num8 ++;
			}else if (str1.charAt(index)=='U') {
				num9 ++;
			}
			
			else {
					continue;
			}
							
		}
		System.out.println("a vowel found " + num + " times");
		System.out.println("A vowel found " + num1 +" times.");
		System.out.println("e vowel found " + num2 +" times.");
		System.out.println("E vowel found " + num3 +" times.");
		System.out.println("i vowel found "  + num4 +" times.");
		System.out.println("I vowel found "  + num5 +" times.");
		System.out.println("o vowel found "  + num6 +" times.");
		System.out.println("O vowel found "  + num7 +" times.");
		System.out.println("u vowel found "  + num8 +" times.");
		System.out.println("U vowel found "  + num9 +" times.");
		
		
		
	}

}
