
package Managedbean;

import Modelo.Cliente;
import Servico.ClienteService;
import java.util.List;

public class ClienteMB {
    private ClienteService servico = new ClienteService();
    private Cliente cli = new Cliente();
    
    public void salvar(){
        servico.salvar(cli);
        cli = new Cliente();
    }
    
    public List<Cliente> getFuncionarios(){
        return servico.getClientes();
    }
    
    public Cliente getCli(){
        return cli;
    }
    
    public void serCli(Cliente Cli){
        this.cli = Cli;
    }
    
}
    

    
    
    
