import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarrinhoDeCompras {
    private static int quantidadeNoCarrinho;
    private static double total = 0;
    List<ProdutoComTamanho> produtos = new ArrayList<>();
    private Map<ProdutoComTamanho, Integer> carrinho = new HashMap<>();

    public static int getQuantidadeNoCarrinho() {
        return quantidadeNoCarrinho;
    }

    public static void setQuantidadeNoCarrinho(int quantidadeNoCarrinho) {
        CarrinhoDeCompras.quantidadeNoCarrinho = quantidadeNoCarrinho;
    }

    public void adicionaProduto(ProdutoComTamanho p, int quantidade) {
        if (carrinho.containsKey(p) && p.equals(p)) {
            carrinho.put(p, p.quantidade + quantidade);
            int indice = produtos.indexOf(p);
            produtos.set(indice,p);
            System.out.println("Entrou no if equals de adiona produto: ");


        } else carrinho.put(p,quantidade);
        p.setQuantidade(quantidade);
        quantidadeNoCarrinho += quantidade;
        produtos.add(p);

    }

    public void removeProduto(ProdutoComTamanho p,  int quantidade) {
        if (carrinho.containsKey(p) && p.equals(p) && quantidade <= p.quantidade) {
            System.out.println("Entrou no if equals de remove produto: ");
            carrinho.remove(p);
            int indice = produtos.lastIndexOf(p);
            produtos.remove(indice);
            --quantidadeNoCarrinho ;
            System.out.println("Removido: "  + " --> " + p.nome);
        }
        else System.out.println("você nao pode remover mais do que tem!");
    }

    public double getPrecoTotalCarrinho() {
        for (ProdutoComTamanho p : carrinho.keySet()) {
            total = p.getPreco() * quantidadeNoCarrinho;
        }
        return total;
    }


    public HashMap<ProdutoComTamanho, Integer> getCarrinho() {

        return (HashMap<ProdutoComTamanho, Integer>) carrinho;
    }

    public void setCarrinho(HashMap<ProdutoComTamanho, Integer> carrinho) {
        this.carrinho = carrinho;
    }


}