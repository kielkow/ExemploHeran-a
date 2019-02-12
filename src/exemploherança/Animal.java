package exemploherança;

public class Animal {
    
    private String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public Animal() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String som(){
        return "som do animal";
    }
    
    
    
}