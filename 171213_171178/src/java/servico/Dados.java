
package Servico;

import Modelo.Cliente;
import Modelo.Produto;
import java.util.ArrayList;

public class Dados {
    private static ArrayList <Cliente> LISTA_CLIENTES;
    private static ArrayList <Produto> LISTA_PRODUTOS;
    
    public static void init() {
        
         LISTA_CLIENTES = new ArrayList();
         LISTA_PRODUTOS = new ArrayList();
        
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
    
}
