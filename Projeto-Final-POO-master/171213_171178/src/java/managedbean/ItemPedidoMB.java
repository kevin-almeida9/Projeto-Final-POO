
package managedbean;

import java.util.ArrayList;
import modelo.ItemPedido;
import servico.ItemPedidoService;


public class ItemPedidoMB {
    
    private ItemPedidoService itempedidoService = new ItemPedidoService();
    private ItemPedido item = new ItemPedido();
    private ItemPedido selectedItem;
    
    
    public void salvar(){
        
        itempedidoService.salvar(item);
        item = new ItemPedido();
    }

    public ArrayList <ItemPedido> getItens() {
        return itempedidoService.getListitens();
    }

   
    public ItemPedido getItem() {
        return item;
    }

    public void setItem(ItemPedido item) {
        this.item = item;
    }

    public ItemPedido getSelectedItem() {
        return selectedItem;
    }

    public void setSelectedItem(ItemPedido selectedItem) {
        this.selectedItem = selectedItem;
    }
    
    public void deleteItem(){
        this.itempedidoService.remove(selectedItem);
        selectedItem = null;
    }
    
    
    
}
