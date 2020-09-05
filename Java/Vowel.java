//Program to identify vowel
class Vowel{
	static public void main(String[] arr){
		char ch = '\103'; 
		System.out.println(" " + ch);
/* We can use an int, short, byte, char, string and enumeration */
		switch(ch){
			case 'A':
			case 'a':
			System.out.println("Vowel.");
			break;
			case 'e':
			case 'E':
			System.out.println("Vowel.");
			break;
			case 'i':
			case 'I':
			System.out.println("Vowel.");
			break;
			case 'o':
			case 'O':
			System.out.println("Vowel.");
			break;
			case 'u':
			case 'U':
			System.out.println("Vowel.");
			break;

			default:
			System.out.println("Consonant.");
		}
	}
}