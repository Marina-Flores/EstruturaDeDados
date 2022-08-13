package ListaDuplamenteEncadeada;

public class ListaDuplamenteEncadeada {
    private No ref;
    private int tamanhoLista = 0; 
    
    public boolean ListaVazia()
    {
        return this.ref == null; 
    }

    public void Adicionar(int elemento)
    {
        No novoNo = new No(elemento);
        if(ListaVazia())
        {
            this.ref = novoNo;
            //this.ref.setAnterior(null);            
        }        
        else
        {
            for(No aux = ref; aux != null; aux = aux.getProximo())
            {                
                if(aux.getProximo() == null){
                    aux.setProximo(novoNo);
                    novoNo.setAnterior(aux);
                    tamanhoLista++;
                    return;
                }
            }            
        }
    }

    public void Imprimir()
    {
        if(ListaVazia())
        {
            System.out.println("Lista Vazia!");
        }
        else
        {
            No ultimo = null;
            System.out.println("Lista do início para o final: ");
            for(No aux = ref; aux != null; aux = aux.getProximo())
            {
                System.out.print(aux + " ");
                if(aux.getProximo() == null){
                    ultimo = aux;
                    break;
                }
            }
            System.out.println("\n");
            System.out.println("Lista do final para o início: ");
            for(No aux = ultimo; aux != null; aux = aux.getAnterior())
            {
                System.out.print(aux + " ");
            }
        }
    }

    public int GetTamanho(){
        return tamanhoLista;
    }


}
