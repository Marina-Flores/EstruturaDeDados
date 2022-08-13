package lista.teste;

import lista.ListaEncadeada;

public class ListaEncadeadaTeste {
    public static void main(String[] args) throws Exception {
        ListaEncadeada lista = new ListaEncadeada();

        lista.Adicionar(1);  
        lista.Adicionar(2);
        lista.Adicionar(5);
        lista.Adicionar(7);
        lista.Adicionar(3);
        lista.Adicionar(1);

        System.out.println(lista);

        lista.ExcluirPrimeiro();
        lista.ExcluirPrimeiro();
        lista.ExcluirPrimeiro();

        System.out.println(lista);

        lista.Excluir(7);      
        System.out.println(lista);

    }
}
