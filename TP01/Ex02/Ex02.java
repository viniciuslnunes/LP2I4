//Vinicius Lopes Nunes CB1640879
//Diego negrete Alves CB1740229

package tp01;

import static java.lang.System.out;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		
		String authorName, email, bookName;
        char gender;  
        int qty;
        double price;
        
        ArrayList<Author> authors = new ArrayList();
        
        for (int i = 0; i < 2; i++) {
            out.print("Informe o nome do " + (i + 1) + "º autor: ");
            authorName = scan.nextLine();
        
            out.print("Informe o email do " + (i + 1) + "º autor: ");
            email = scan.nextLine();
        
            do {
                out.print("Informe o sexo do " + (i + 1) + "º autor: ");
                gender = Character.toUpperCase(scan.nextLine().charAt(0));
            
            } while (gender != 'M' && gender != 'F');
        
            out.println("\n--------------------------------------------------\n");        
        
            authors.add(new Author(authorName, email, gender));        
        } 
        
        out.print("Informe o nome do livro: ");
        bookName = scan.nextLine();
        
        out.print("Informe o preço do livro: ");
        price = scan.nextDouble();
        
        out.print("Informe a quantidade de livros: ");
        qty = scan.nextInt();
        
        out.println("\n--------------------------------------------------\n");  
        
        Book book = new Book(bookName, authors, price, qty);
        
        out.println(book.toString());
        
        out.println("\n--------------------------------------------------\n"); 
        
        out.println("Nome   : " + book.getName());
        
        for (int i = 0; i < book.getAuthors().size(); i++) {
            out.println(book.getAuthors().get(i) + ", ");
        }
        
        out.println("Preço  : " + book.getPrice());
        
        out.println("Qtd    : " + book.getQty());
    }    
}