
package servico;

import java.util.ArrayList;
import modelo.ItemPedido;



public class ItemPedidoService {
    
    private  ArrayList <ItemPedido> listitens  ;
    
    
    public void salvar(ItemPedido i ){
        
        listitens.add(i);
    }

    public ArrayList<ItemPedido> getListitens() {
        return listitens;
    }

    public void setListitens(ArrayList<ItemPedido> listitens) {
        this.listitens = listitens;
    }
    
    public void remove(ItemPedido i){
        listitens.remove(i);
    }
    
}
