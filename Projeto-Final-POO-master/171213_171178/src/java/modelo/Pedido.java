
package modelo;


import java.util.ArrayList;
import java.util.Date;


public class Pedido {
    private long numero;
    private Date date;
    private ArrayList<ItemPedido> itens;
    private Cliente cliente;
    
    
    
    public ArrayList<ItemPedido> pedir(){
        
        return getItens();
    }
    
    
    public void receber(ArrayList <ItemPedido> itens){
        
        setItens(itens);
        
    }
    
    public void init(){
        
        itens = new ArrayList();
    }
    
    public double totalPedido(){
        return 0;
    }
    
    public double totalImposto(){
        return 0;
    }
    
    
    
    
    
    private long getNumero() {
        return numero;
    }

    private void setNumero(long numero) {
        this.numero = numero;
    }

    private Date getDate() {
        return date;
    }

    private void setDate(Date date) {
        this.date = date;
    }

    private ArrayList<ItemPedido> getItens() {
        if(itens == null){
            init();
        }
        
        return itens;
    }

    private void setItens(ArrayList<ItemPedido> itens) {
        this.itens = itens;
    }

    private Cliente getCliente() {
        return cliente;
    }

    private void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

}
