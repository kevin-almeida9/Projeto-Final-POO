
package Servico;

import Modelo.Cliente;
import java.util.ArrayList;


public class ClienteService {
    private ArrayList <Cliente>  listcliente = Dados.getClientes();
    
    public void salvar (Cliente c){
        listcliente.add(c);
    }
    
    public ArrayList<Cliente> getClientes(){
        return listcliente;
    }
    
    public void remover(Cliente c){
        listcliente.remove(c);
    }
}
