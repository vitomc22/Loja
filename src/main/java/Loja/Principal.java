package Loja;

public class Principal {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        ProdutoComTamanho produto1 = new ProdutoComTamanho(10, "Tênis Adidas", 39.90, "35",0);
        ProdutoComTamanho produto2 = new ProdutoComTamanho(9, "Shorts Adidas", 59.90, "20",0);
        ProdutoComTamanho produto3 = new ProdutoComTamanho(5, "Camiseta Adidas", 79.90, "30",0);
        ProdutoComTamanho produto4 = new ProdutoComTamanho(9, "Shorts Adidas", 59.90, "40",0);
        ProdutoComTamanho produto5 = new ProdutoComTamanho(10, "Tênis Adidas", 39.90, "39",0);
        ProdutoComTamanho produto6 = new ProdutoComTamanho(9, "Shorts Adidas", 59.90, "20",0);
        carrinho.adicionaProduto(produto1,1);
        System.out.println("Adicionado: " +  " --> " + produto1.nome);
        carrinho.adicionaProduto(produto2, 1);
        System.out.println("Adicionado: "  + " --> " + produto2.nome);
        carrinho.adicionaProduto(produto3, 1);
        System.out.println("Adicionado: "  + " --> " + produto3.nome);
        carrinho.adicionaProduto(produto4, 1);
        System.out.println("Adicionado: "  + " --> " + produto4.nome);
        carrinho.adicionaProduto(produto5, 1);
        System.out.println("Adicionado: " + " --> " + produto5.nome);
        carrinho.adicionaProduto(produto6, 1);
        System.out.println("Adicionado: " + " --> " + produto5.nome);

        //listando itens
        System.out.println("Seu carrinho tem os " + CarrinhoDeCompras.getQuantidadeNoCarrinho() + " seguintes itens Abaixo: ");
        carrinho.produtos.stream().forEach(produto -> System.out.println("Nome: " + produto.getNome() + "   Tamanho: " + produto.getTamanho() + " Código: " + produto.getCodigo() +
         " Quantidade: " +produto.quantidade +  "   Preço R$: " + produto.getPreco()));
        System.out.println("O preço total é: R$  " + carrinho.getPrecoTotalCarrinho());

        //removendo itens
        carrinho.removeProduto(produto6,1);


        //listando itens
        System.out.println("Seu carrinho tem os " + CarrinhoDeCompras.getQuantidadeNoCarrinho() + " seguintes itens Abaixo: ");
        carrinho.produtos.stream().forEach(produto -> System.out.println("Nome: " + produto.getNome() + "   Tamanho: " + produto.getTamanho() + " Código: " + produto.getCodigo() +
                " Quantidade: " +  produto.getQuantidade() + "   Preço R$: " + produto.getPreco()));
        System.out.println("O preço total é: R$  " + carrinho.getPrecoTotalCarrinho());

    }


}
