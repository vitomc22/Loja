public class Produto {
    String nome;
    Integer codigo;
    Double preco;

    Integer quantidade;





    public Produto(Integer codigo, String nome, Double preco, Integer quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;



    }

    public Produto() {

    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = (prime * result) + this.getCodigo();
        return result;
    }

    @Override
    public boolean equals(Object o) {
        boolean result = this.getCodigo() == ((Produto) o).getCodigo() && this.hashCode() == o.hashCode();
        return result;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
}
