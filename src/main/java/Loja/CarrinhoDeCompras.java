package Loja;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarrinhoDeCompras {


    private static int quantidadeNoCarrinho;
    private static double total = 0;
    List<ProdutoComTamanho> produtos = new ArrayList<>();
    private final Map<ProdutoComTamanho, Integer> carrinho = new HashMap<>();

    public static int getQuantidadeNoCarrinho() {
        return quantidadeNoCarrinho;
    }

    public static void setQuantidadeNoCarrinho(int quantidadeNoCarrinho) {
        CarrinhoDeCompras.quantidadeNoCarrinho = quantidadeNoCarrinho;
    }

    public static double getTotal() {
        return total;
    }

    public static void setTotal(double total) {
        CarrinhoDeCompras.total = total;
    }

    public void adicionaProduto(ProdutoComTamanho p, int quantidade) {
        if (carrinho.containsKey(p) && p.equals(p)) {
            carrinho.put(p, p.quantidade + quantidade);
            int indice = produtos.indexOf(p);
            produtos.set(indice, p);
            System.out.println("Entrou no if equals de adiona produto: ");


        } else carrinho.put(p, quantidade);
        p.setQuantidade(quantidade);
        quantidadeNoCarrinho += quantidade;
        produtos.add(p);

    }

    public void removeProduto(ProdutoComTamanho p, int quantidade) {
        if (carrinho.containsKey(p) && p.equals(p) && quantidade <= p.quantidade) {
            System.out.println("Entrou no if equals de remove produto: ");
            carrinho.remove(p);
            int indice = produtos.lastIndexOf(p);
            produtos.remove(indice);
            quantidadeNoCarrinho = quantidadeNoCarrinho - p.getQuantidade();
            System.out.println("Removido: " + " --> " + p.nome);
        } else System.out.println("você nao pode remover mais do que tem!");
    }

    public double getPrecoTotalCarrinho() {
      //  for (ProdutoComTamanho p : carrinho.keySet()) {
       //     total += p.getPreco() * p.getQuantidade();
       // }
        carrinho.keySet().stream().forEach(p -> total += p.getPreco() * p.getQuantidade() );

        return total;
        }

    }


