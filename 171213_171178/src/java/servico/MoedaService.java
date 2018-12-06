
package Servico;

import Modelo.Moeda;
import java.util.ArrayList;



public class MoedaService {
    private ArrayList <Moeda>  listMoeda = Dados.getMoedas();
    
    public void salvar (Moeda c){
        listMoeda.add(c);
    }
    
    public ArrayList<Moeda> getMoedas(){
        return listMoeda;
    }

    public void setListMoeda(ArrayList<Moeda> listMoeda) {
        this.listMoeda = listMoeda;
    }
    
    public void remover(Moeda c){
        listMoeda.remove(c);
    }
    
     public Moeda getMoedaByNome(String value) {
    
        for(Moeda e: listMoeda){
           if(e.getNome().equals(value))
               return e;
        
        }
        
        return null;
    }
}
