
package Managedbean;


import Modelo.Moeda;
import Servico.MoedaService;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class MoedaMB {
    private MoedaService moedaService = new MoedaService();
    private Moeda moe = new Moeda();
    private Moeda selectedMoe;
    
    public void salvar(){
        moedaService.salvar(moe);
        moe = new Moeda();
    }
    
    public List<Moeda> getMoedas(){
        return moedaService.getMoedas();
    }
    
    public Moeda getMoe(){
        return moe;
    }
    
    public void setMoe(Moeda Moe){
        this.moe = Moe;
    }
    
    public Moeda getSelectedMoe(){
        return selectedMoe;
    }
    
    public void setSelectedMoe(Moeda selectedMoe){
        this.selectedMoe = selectedMoe;
    }
    
}
    

    
    
    
