package Servico;


import Modelo.Produto;
import Modelo.ProdutoExportacao;
import java.util.ArrayList;

public class ProdutoService {
        private ArrayList <Produto>  listProdutos = Dados.getProdutos();
    
    public void salvar (Produto p){
        listProdutos.add(p);
    }
    
    public ArrayList<Produto> getProdutos(){
        return listProdutos;
    }
    
    public void remover(Produto p){
        listProdutos.remove(p);
    }

    public ArrayList<ProdutoExportacao> getProdutosExterno() {
    
        ArrayList <ProdutoExportacao> aux = new ArrayList();
        for(Produto p: listProdutos)
        {
            if(p instanceof ProdutoExportacao){
                aux.add((ProdutoExportacao) p);
            }
        
        }
        
        return aux;
    }
}
