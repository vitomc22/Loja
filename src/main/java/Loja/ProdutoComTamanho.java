package Loja;

public class ProdutoComTamanho extends Produto{
    String tamanho;

    public ProdutoComTamanho(Integer codigo,String nome, Double preco, String tamanho, Integer quantidade) {
        super(codigo, nome, preco,quantidade);
        this.tamanho = tamanho;


    }

    public ProdutoComTamanho() {
        super();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = Integer.parseInt(prime * result  + tamanho);
        return result;
    }
    @Override
    public boolean equals(Object o) {
        boolean result = this.getCodigo() == ((ProdutoComTamanho) o).getCodigo() && this.getTamanho() == ((ProdutoComTamanho) o).getTamanho() && this.hashCode() == o.hashCode();
        return result;
    }


    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

}
