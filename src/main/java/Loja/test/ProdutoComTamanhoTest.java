package Loja.test;

import Loja.Produto;
import Loja.ProdutoComTamanho;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * Loja.Produto Tester.
 *
 * @author <Victor Oliveira>
 * @version 1.0
 * @since <pre>mai 28, 2022</pre>
 */
public class ProdutoComTamanhoTest {
    ProdutoComTamanho produto = new ProdutoComTamanho(10, "Bolsa", 30.0, "M",1);
    ProdutoComTamanho produto2 = new ProdutoComTamanho(10, "Bolsa", 30.0, "P",1);
    ProdutoComTamanho produto3 = new ProdutoComTamanho(30, "Sapato", 20.0, "32",1);

    @Test
    public void testEquals() throws Exception {

        boolean igual = produto.equals(produto2);
        assertEquals(false, igual);
    }

    @Test
    public void testGetNome() throws Exception {
        assertEquals("Bolsa", produto.getNome());
        assertEquals("Bolsa", produto2.getNome());
        assertEquals("Sapato", produto3.getNome());

    }

    @Test
    public void testSetNome() throws Exception {
        produto.setNome("Capacete");
        produto2.setNome("Sandália");
        produto3.setNome("Cinto");
        assertEquals("Capacete", produto.getNome());
        assertEquals("Sandália", produto2.getNome());
        assertEquals("Cinto", produto3.getNome());
    }

    @Test
    public void testGetCodigo() throws Exception {
        assertEquals(10, produto.getCodigo());
        assertEquals(10, produto2.getCodigo());
        assertEquals(30, produto3.getCodigo());
    }

    @Test
    public void testSetCodigo() throws Exception {
        produto.setCodigo(3);
        produto2.setCodigo(23);
        produto3.setCodigo(42);
        assertEquals(3, produto.getCodigo());
        assertEquals(23, produto2.getCodigo());
        assertEquals(42, produto3.getCodigo());
    }

    /**
     * Method: getPreco()
     */
    @Test
    public void testGetPreco() throws Exception {
        assertEquals(30, produto.getPreco());
        assertEquals(30, produto2.getPreco());
        assertEquals(20, produto3.getPreco());
    }

    /**
     * Method: setPreco(Double preco)
     */
    @Test
    public void testSetPreco() throws Exception {
        produto.setPreco(25.0);
        produto2.setPreco(30.0);
        produto3.setPreco(45.0);
        assertEquals(25, produto.getPreco());
        assertEquals(30, produto2.getPreco());
        assertEquals(45, produto3.getPreco());
    }


    /**
     * Method: getQuantidade()
     */
    @Test
    public void testGetQuantidade() throws Exception {
        assertEquals(1, produto.getQuantidade());
        assertEquals(1, produto2.getQuantidade());
        assertEquals(1, produto3.getQuantidade());

    }

    /**
     * Method: setQuantidade(Integer quantidade)
     */
    @Test
    public void testSetQuantidade() throws Exception {
        produto.setQuantidade(3);
        produto2.setQuantidade(5);
        produto3.setQuantidade(9);
        assertEquals(3, produto.getQuantidade());
        assertEquals(5, produto2.getQuantidade());
        assertEquals(9, produto3.getQuantidade());
    }

    @Test
    public void testGetTamanho() throws Exception {
        assertEquals("M", produto.getTamanho());
        assertEquals("P", produto2.getTamanho());
        assertEquals("32", produto3.getTamanho());

    }

    /**
     * Method: setQuantidade(Integer quantidade)
     */
    @Test
    public void testSetTamanho() throws Exception {
        produto.setTamanho("M");
        produto2.setTamanho("P");
        produto3.setTamanho("31");
        assertEquals("M", produto.getTamanho());
        assertEquals("P", produto2.getTamanho());
        assertEquals("31", produto3.getTamanho());
    }


} 
