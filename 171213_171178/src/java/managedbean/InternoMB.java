
package managedbean;

import Modelo.Produto;
import Modelo.ProdutoExportacao;
import Servico.ProdutoService;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped

public class InternoMB {
    private ProdutoService produtoService =  new ProdutoService();
    private ProdutoExportacao pro = new ProdutoExportacao();
    private ProdutoExportacao selectedPro;
    
    public void salvar(){
        produtoService.salvar(pro);
        pro = new ProdutoExportacao();
    }

    public ArrayList<Produto> getProdutos() {
        return produtoService.getProdutos();
    }

    public void setProdutoService(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    public ProdutoExportacao getPro() {
        return pro;
    }

    public void setPro(ProdutoExportacao pro) {
        this.pro = pro;
    }

    public ProdutoExportacao getSelectedPro() {
        return selectedPro;
    }

    public void setSelectedPro(ProdutoExportacao selectedPro) {
        this.selectedPro = selectedPro;
    }
    
    
}
