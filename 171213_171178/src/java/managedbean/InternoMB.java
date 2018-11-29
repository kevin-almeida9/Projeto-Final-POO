
package managedbean;

import Modelo.ProdutoMercadoInterno;
import Servico.ProdutoService;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped

public class InternoMB {
    private ProdutoService produtoService =  new ProdutoService();
    private ProdutoMercadoInterno pro = new ProdutoMercadoInterno();
    private ProdutoMercadoInterno selectedPro;
    
    public void salvar(){
        produtoService.salvar(pro);
        pro = new ProdutoMercadoInterno();
    }

    public ArrayList<ProdutoMercadoInterno> getProdutos() {
        return produtoService.ProdutoMercadoInterno();
    }

    public void setProdutoService(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    public ProdutoMercadoInterno getPro() {
        return pro;
    }

    public void setPro(ProdutoMercadoInterno pro) {
        this.pro = pro;
    }

    public ProdutoMercadoInterno getSelectedPro() {
        return selectedPro;
    }

    public void setSelectedPro(ProdutoMercadoInterno selectedPro) {
        this.selectedPro = selectedPro;
    }
    
    
}
