package produto;

public class Produto {

    private int id;

    private String nome;
    private double preco;

    public Produto(int id, String nome,double preco) {
        this.id = id;
        this.preco = preco;
        this.nome = nome;
    }

    public String obterDetalhes(){
        return String.format("ID: %d | Nome: %s | Preço: %f", this.id, this.nome, this.preco);
    }
}
