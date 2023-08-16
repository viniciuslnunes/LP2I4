//Vinicius Lopes Nunes CB1640879
//Diego negrete Alves CB1740229

package tp01;

import static java.lang.System.out;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		
		String name, email;
        char gender;       
        
        out.print("Informe o nome: ");
        name = scanLine.next();
        
        out.print("Informe o email: ");
        email = scanLine.next();
        
        do {
            out.print("Informe o sexo: ");
            gender = Character.toUpperCase(scan.nextLine().charAt(0));
            
        } while (gender != 'M' && gender != 'F');
        
        out.println("\n--------------------------------------------------\n");
        
        Author author = new Author(name, email, gender);
        
        out.println(author.toString());
        
        out.println("\n--------------------------------------------------\n");
        
        out.print("Informe o novo email: ");
        author.setEmail(scan.next());
        
        out.println("\n--------------------------------------------------\n");
        
        out.println("Nome : " + author.getName() + 
                    "\nEmail: " + author.getEmail() + 
                    "\nSexo : " + author.getGender());
	}
}