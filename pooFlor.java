public class Main {
    public static void main(String[] args) {
        Flor rosa = new Flor("Rosa", 12, 3.50f); // cria um objeto Flor com nome "Rosa", número de pétalas 12 e preço 3.50 do tipo float
        Flor margarida = new Flor("Margarida", 20, 2.75f); // cria um objeto Flor com nome "Margarida", número de pétalas 20 e preço 2.75 do tipo float
        
        System.out.println("Flor 1 - Nome: " + rosa.getNome() + ", Número de pétalas: " + rosa.getNumPet() + ", Preço: R$" + rosa.getPreco()); // exibe na tela os valores dos atributos do objeto rosa
        System.out.println("Flor 2 - Nome: " + margarida.getNome() + ", Número de pétalas: " + margarida.getNumPet() + ", Preço: R$" + margarida.getPreco()); // exibe na tela os valores dos atributos do objeto margarida
    }
}



class Flor {
    private String nome; // atributo privado do tipo String que representa o nome da flor
    private int numPet; // atributo privado do tipo int que representa o número de pétalas da flor
    private float preco; // atributo privado do tipo float que representa o preço da flor
    
    public Flor(String nome, int numPet, float preco) { // construtor da classe Flor que recebe três parâmetros
        this.nome = nome; // inicializa o atributo nome com o valor do parâmetro nome
        this.numPet = numPet; // inicializa o atributo numPet com o valor do parâmetro numPet
        this.preco = preco; // inicializa o atributo preco com o valor do parâmetro preco
    }
    
    public String getNome() { // método público que retorna o valor do atributo nome
        return nome;
    }
    
    public int getNumPet() { // método público que retorna o valor do atributo numPet
        return numPet;
    }
    
    public float getPreco() { // método público que retorna o valor do atributo preco
        return preco;
    }
}
