//Vinicius Lopes Nunes CB1640879
//Diego negrete Alves CB1740229

package tp01;

import static java.lang.System.out;
import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome, endereco, curso, escola;
        int ano;
        double taxa, salario;
               
        // <editor-fold desc="Aluno">
        
        out.print("Informe o nome do aluno: ");  
        nome = scan.nextLine();
        
        out.print("Informe endereço do aluno: ");  
        endereco = scan.nextLine();
        
        out.print("Informe o curso do aluno: ");  
        curso = scan.nextLine();
        
        out.print("Informe o ano do aluno: ");  
        ano = scan.nextInt();
        
        out.print("Informe a taxa do aluno: ");  
        taxa = scan.nextDouble();
        
        
        out.println("\n---------------------------------------\n");
        
        
        Student student = new Student(nome, endereco, curso, ano, taxa);
        
        out.println(student.toString());
        
        out.println("\n---------------------------------------\n");
        
        out.println("Nome    : " + student.getName() + 
                    "\nEndereço: " + student.getAddress() + 
                    "\nCurso   : " + student.getProgram() + 
                    "\nAno     : " + student.getYear() + 
                    "\nTaxa    : " + student.getFee());
        
        out.println("\n***************************************\n");
        
        out.print("Informe o nome do funcionário: ");  
        nome = scan.nextLine();
        
        out.print("Informe endereço do funcionário: ");  
        endereco = scan.nextLine();
        
        out.print("Informe a escola do funcionário: ");  
        escola = scan.nextLine();
        
        out.print("Informe o salário do funcionário: ");  
        salario = scan.nextDouble();
        
        
        out.println("\n---------------------------------------\n");
        
        
        Staff staff = new Staff(nome, endereco, escola, salario);
        
        out.println(staff.toString());
        
        out.println("\n---------------------------------------\n");
        
        out.println("Nome    : " + staff.getName() + 
                    "\nEndereço: " + staff.getAddress() +
                    "\nEscola  : " + staff.getSchool() + 
                    "\nSalário : " + staff.getPay());
    }    
}