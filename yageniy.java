package morze;
import java.util.Scanner;
public class yageniy {

	public static void main(String[] args) {
		 
		Scanner scan = new Scanner(System.in);
		int num;
		int letter;
		 
		System.out.print("Введите текст(eng):");
		String str = scan.nextLine();
		for(int i = 0; i<str.length(); i++) {	
			if(i>str.length()) 
				   break; 	        
	      letter = str.charAt(i);
	      num = letter;
	       
	 		switch (num) {	 		
	    case 97, 65: System.out.print(".- ");      //через цикл нельзя, 
	        break;                                 //у каждогго числа свое значение(
	    case 98, 66: System.out.print("-... ");
	        break;
	    case 99, 67: System.out.print("-.-. ");
	        break;
	    case 100, 68: System.out.print("-.. ");
	        break;
	    case 101, 69: System.out.print(". ");
	        break;
	    case 102, 70: System.out.print("..-. ");
	        break;
	    case 103, 71: System.out.print("--. ");
	        break;
	    case 104, 72: System.out.print(".... ");
	        break;
	    case 105, 73: System.out.print(".. ");
	        break;
	    case 106, 74: System.out.print(".--- ");
	        break;
	    case 107, 75: System.out.print("-.- ");
	        break;
	    case 108, 76: System.out.print(".-.. ");
	        break;
	    case 109, 77: System.out.print("-- ");
	        break;
	    case 110, 78: System.out.print("-. ");
	        break;
	    case 111, 79: System.out.print("--- ");
	        break;
	    case 112, 80: System.out.print(".--. ");
	        break;
	    case 113, 81: System.out.print("--.- ");
	        break;
	    case 114, 82: System.out.print(".-. ");
	        break;
	    case 115, 83: System.out.print("... ");
	        break;
	    case 116, 84: System.out.print("- ");
	        break;
	    case 117, 85: System.out.print("..- ");
	        break;
	    case 118, 86: System.out.print("...- ");
	        break;
	    case 119, 87: System.out.print(".-- ");
	        break;
	    case 120, 88: System.out.print("-..- ");
	        break;
	    case 121, 89: System.out.print("-.-- ");
	        break;
	    case 122, 90: System.out.print("--.. ");
	        break;
	    case 32, 33, 44, 45, 46: break; 
	        default: 
	        System.out.println("Вы использовали недопустимые символы, попробуйте снова.");
	        break;
	 		}
	 	 
		  	    	   
    }		
  }
}
