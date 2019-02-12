package exemploherança;
public class ExemploHerança {

    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.setNome("Animal");
        System.out.println(a1.som());
        
        Cachorro a2 = new Cachorro();
        a2.setNome("Cachorro");
        System.out.println(a2.som());
        
        Gato a3 = new Gato();
        a3.setNome("Gato");
        System.out.println(a3.som());
        
        Animal a4 = new Gato(); // Cria uma variavel Animal que pode ser tanto Gato quanto Cachorro
        Gato g1 = (Gato)a4; // Depositar valor de a4 na variavel g1
        
        System.out.println(a4 instanceof Animal);
        System.out.println(a4 instanceof Gato);
        System.out.println(a4 instanceof Cachorro);
    }
}