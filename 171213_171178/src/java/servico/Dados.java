
package Servico;


import Modelo.Categoria;
import Modelo.Cliente;
import Modelo.Pedido;
import Modelo.Produto;
import java.util.ArrayList;

public class Dados {
    private static ArrayList <Cliente> LISTA_CLIENTES;
    private static ArrayList <Produto> LISTA_PRODUTOS;
    private static ArrayList <Pedido> LISTA_PEDIDOS;
    private static ArrayList <Categoria> LISTA_CATEGORIAS;
    
    public static void init() {
        
        LISTA_CLIENTES = new ArrayList();
        LISTA_PRODUTOS = new ArrayList();
        LISTA_PEDIDOS = new ArrayList();
        LISTA_CATEGORIAS = new ArrayList();
    }

    public static ArrayList<Pedido> getPedidos() {
        if(LISTA_PEDIDOS == null){
            init();
        }
        return LISTA_PEDIDOS;
    }
    
    
    public static ArrayList<Cliente> getClientes() {
        if(LISTA_CLIENTES == null){        
            init();
        }
        return LISTA_CLIENTES;
    }

    public static ArrayList<Produto> getProdutos() {
        if(LISTA_PRODUTOS == null){
            init();
        }
        return LISTA_PRODUTOS;
    }
    
    public static ArrayList<Categoria> getCategoriass() {
        if(LISTA_CATEGORIAS == null){
            init();
        }
        return LISTA_CATEGORIAS;
    }
}
