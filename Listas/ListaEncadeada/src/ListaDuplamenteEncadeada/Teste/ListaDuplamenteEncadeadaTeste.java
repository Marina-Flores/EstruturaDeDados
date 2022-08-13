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
        
        lista.Excluir(0);  
        lista.Excluir(2);  
        lista.Excluir(3);
        
        lista.Imprimir();
        System.out.println("\n");

        lista.Adicionar(4);
        lista.Adicionar(0);
        lista.Adicionar(10);

        lista.Imprimir();

        lista.Excluir(10);

        lista.Imprimir();
    }
}
