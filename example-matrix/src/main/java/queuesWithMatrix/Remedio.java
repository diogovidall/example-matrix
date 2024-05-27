package queuesWithMatrix;

public class Remedio {
    private int id;
    private int quantidadeEmEstoque;
    private String nome;
    private double preco;
    private String laboratorio;

    public Remedio(int id, int quantidadeEmEstoque, String nome, double preco, String laboratorio) {
        this.id = id;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
        this.nome = nome;
        this.preco = preco;
        this.laboratorio = laboratorio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    @Override
    public String toString() {
        return "Remedio{" +
                "id=" + id +
                ", quantidadeEmEstoque=" + quantidadeEmEstoque +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", laboratorio='" + laboratorio + '\'' +
                '}';
    }
}

