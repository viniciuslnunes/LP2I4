//Vinicius Lopes Nunes CB1640879
//Diego negrete Alves CB1740229


package tp01;

public class Author {
    private String name, email;
    private char gender;
    
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }    
    
    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }
    
    public Author(String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    
    public String toString(){
        return "Author [ name = " + name + ", email = " + email + ", gender = " + gender + " ]";
    }
}