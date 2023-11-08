public class Pessoa {

    protected static int kp = 0;
    protected String nome;
    protected char sexo;
    protected int idade;
    
    // <editor-fold desc="Generated Code"> 
    public int getKp() {
        return kp;
    }

    public void setKp(int kp) {
        Pessoa.kp = kp;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    //</editor-fold>
    
    public Pessoa(){
        
    }
    
    public Pessoa(String nome, char sexo, int idade){
        kp++;
        this.nome = nome;
        this.sexo = Character.toUpperCase(sexo);
        this.idade = idade;
    }
}
