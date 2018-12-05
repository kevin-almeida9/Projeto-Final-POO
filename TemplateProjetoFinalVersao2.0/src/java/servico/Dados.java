/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servico;

import java.util.ArrayList;
import modelo.Empresa;
import modelo.Funcionario;

/**
 *
 * @author glauc
 */
public class Dados {

    private static ArrayList<Funcionario> LISTA_FUNCIONARIOS;
    private static ArrayList<Empresa> LISTA_EMPRESAS;

    private static void init() {
       
        LISTA_EMPRESAS = new ArrayList();
        LISTA_FUNCIONARIOS = new ArrayList();
           
        LISTA_EMPRESAS.add(new Empresa(1, "Empresa A"));
        LISTA_EMPRESAS.add(new Empresa(2, "Empresa B"));
        LISTA_EMPRESAS.add(new Empresa(3, "Empresa C"));
        LISTA_EMPRESAS.add(new Empresa(4, "Empresa D"));
        LISTA_EMPRESAS.add(new Empresa(5, "Empresa E"));
    }

    public static ArrayList<Funcionario> getFuncionarios() {
        if (LISTA_FUNCIONARIOS == null) {
            init();
        }
        return LISTA_FUNCIONARIOS;
    }

    public static ArrayList<Empresa> getEmpresas() {
        if (LISTA_EMPRESAS == null) {
            init();
        }
        return LISTA_EMPRESAS;
    }

}
