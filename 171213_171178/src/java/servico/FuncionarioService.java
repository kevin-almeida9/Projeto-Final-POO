/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servico;

import java.util.ArrayList;
import modelo.Funcionario;

public class FuncionarioService {
    private ArrayList<Funcionario> listaFunc = Dados.getFuncionarios();
    
    public void salvar(Funcionario f){
      listaFunc.add(f);
    }
    public ArrayList<Funcionario> getFuncionarios(){
      return listaFunc;
    }

    public void removerFuncionario(Funcionario f) {
       listaFunc.remove(f);
    }
    
}
