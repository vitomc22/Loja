package Loja.test;

import Loja.CarrinhoDeCompras;
import Loja.ProdutoComTamanho;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * Loja.CarrinhoDeCompras Tester.
 *
 * @author <Victor Oliveira>
 * @version 1.0
 * @since <pre>mai 28, 2022</pre>
 */
public class CarrinhoDeComprasTest {
    CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
    ProdutoComTamanho produto1 = new ProdutoComTamanho(10, "Tênis Adidas", 39.90, "35", 0);
    ProdutoComTamanho produto2 = new ProdutoComTamanho(9, "Shorts Adidas", 59.90, "20", 0);
    ProdutoComTamanho produto3 = new ProdutoComTamanho(5, "Camiseta Adidas", 79.90, "30", 0);


    @Before
    public void before() throws Exception {
        CarrinhoDeCompras.setQuantidadeNoCarrinho(0);
        CarrinhoDeCompras.setTotal(0.0);
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: getQuantidadeNoCarrinho()
     */
    @Test()
    public void testGetQuantidadeNoCarrinho() throws Exception {
        carrinho.adicionaProduto(produto1, 2);
        carrinho.adicionaProduto(produto2, 3);
        carrinho.adicionaProduto(produto3, 5);
        assertEquals(10, CarrinhoDeCompras.getQuantidadeNoCarrinho());
    }

    /**
     * Method: setQuantidadeNoCarrinho(int quantidadeNoCarrinho)
     */
    @Test
    public void testSetQuantidadeNoCarrinho() throws Exception {
        CarrinhoDeCompras.setQuantidadeNoCarrinho(5);
        CarrinhoDeCompras.setQuantidadeNoCarrinho(10);
        assertEquals(10, CarrinhoDeCompras.getQuantidadeNoCarrinho());

    }

    /**
     * Method: adicionaProduto(Loja.ProdutoComTamanho p, int quantidade)
     */
    @Test
    public void testAdicionaProduto() throws Exception {
        carrinho.adicionaProduto(produto1, 2);
        carrinho.adicionaProduto(produto2, 3);
        carrinho.adicionaProduto(produto3, 5);
        assertEquals(10, CarrinhoDeCompras.getQuantidadeNoCarrinho());


    }

    /**
     * Method: removeProduto(Loja.ProdutoComTamanho p, int quantidade)
     */
    @Test
    public void testRemoveProduto() throws Exception {
        carrinho.adicionaProduto(produto1, 2);
        carrinho.adicionaProduto(produto2, 3);
        carrinho.adicionaProduto(produto3, 5);
        carrinho.removeProduto(produto3, 5);
        assertEquals(5, CarrinhoDeCompras.getQuantidadeNoCarrinho());

    }

    /**
     * Method: getPrecoTotalCarrinho()
     */
    @Test
    public void testGetPrecoTotalCarrinho() throws Exception {
        carrinho.adicionaProduto(produto1, 2);
        carrinho.adicionaProduto(produto2, 3);
        carrinho.adicionaProduto(produto3, 5);
        assertEquals(659, carrinho.getPrecoTotalCarrinho());


    }



} 
