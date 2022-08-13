package lista.teste;

import lista.ListaEncadeada;

public class ListaEncadeadaTeste {
    public static void main(String[] args) throws Exception {
        ListaEncadeada lista = new ListaEncadeada();


        lista.Adicionar(1);  
        lista.Adicionar(2);
        lista.Adicionar(3);
        lista.Adicionar(5);       

        lista.Imprimir();

        lista.AdicionarOrdenado(4);
        lista.AdicionarOrdenado(7);

        lista.Imprimir();

    }
}
