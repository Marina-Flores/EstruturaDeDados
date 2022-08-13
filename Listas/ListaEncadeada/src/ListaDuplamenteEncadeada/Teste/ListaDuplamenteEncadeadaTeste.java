package ListaDuplamenteEncadeada.Teste;

import ListaDuplamenteEncadeada.ListaDuplamenteEncadeada;

public class ListaDuplamenteEncadeadaTeste {
    public static void main(String[] args) throws Exception {
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();
        
        lista.Adicionar(0);  
        lista.Adicionar(2);  
        lista.Adicionar(3);
        
        lista.Imprimir();       
        System.out.println("\n");

        lista.Excluir(3);

        lista.Imprimir();       

    
    }
}
