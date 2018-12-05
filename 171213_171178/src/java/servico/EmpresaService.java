/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servico;

import java.util.ArrayList;
import modelo.Empresa;
import modelo.Funcionario;

public class EmpresaService {
    private ArrayList<Empresa> listaEmpresa = Dados.getEmpresas();
    
    public void salvar(Empresa e){
      listaEmpresa.add(e);
    }

    public ArrayList<Empresa> getListaEmpresa() {
        return listaEmpresa;
    }

    public void setListaEmpresa(ArrayList<Empresa> listaEmpresa) {
        this.listaEmpresa = listaEmpresa;
    }
    

    public void removerFuncionario(Empresa empresa) {
       listaEmpresa.remove(empresa);
    }

    public Empresa getEmpresaByNome(String value) {
    
        for(Empresa e: listaEmpresa){
           if(e.getNome().equals(value))
               return e;
        
        }
        
        return null;
    }
    
}
