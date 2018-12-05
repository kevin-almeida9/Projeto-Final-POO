package Service;


import Modelo.Produto;
import java.util.ArrayList;

public class ProdutoService {
        private ArrayList <Produto>  listProdutos = Dados.getProdutos();
    
    public void salvar (Produto p){
        listProdutos.add(p);
    }
    
    public ArrayList<Produto> getClientes(){
        return listProdutos;
    }
    
    public void remover(Produto p){
        listProdutos.remove(p);
    }
}
