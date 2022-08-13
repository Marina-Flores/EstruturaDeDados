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
            tamanhoLista++;
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

    public int Buscar(int elemento)
    {
        if(ListaVazia())
        {
            return -1;
        }
        else if(GetTamanho() == 1)
        {
            if(this.ref.getElemento() == elemento)
            {
                return -1;
            }            
        }            
        else
        {
            int posicao = 0;
            for(No aux = ref; aux != null; aux = aux.getProximo())
            {    
                if(aux.getElemento() == elemento)
                {
                    return posicao;
                }
                posicao++;
            }                     
        }  
        return -1;      
    }

    public void Excluir(int elemento)
    {
        if(ListaVazia())
        {
            System.out.println("Lista vazia");
            return;
        }
        else if(GetTamanho() == 1)
        {
            if(ref.getElemento() == elemento)
            {
                this.ref = null; 
                this.tamanhoLista --;
            }                 
            else
            {
                System.out.println("Elemento não encontrado");
            }        
            return;        
        }
        else
        {
            No aux = null; 
            for(No p = ref; p != null; p = p.getProximo())
            {
                if(p.getElemento() == elemento)
                {
                    if(aux == null)
                    {
                        ref = p.getProximo();
                        ref.setAnterior(null); 
                        this.tamanhoLista--;
                        return;
                    }
                    aux.setProximo(p.getProximo());
                    
                    if(p.getProximo() != null)                    
                        p.getProximo().setAnterior(aux);

                    this.tamanhoLista--;
                    return;
                }
                aux = p;
            }
        }
        System.out.println("Elemento não encontrado");
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
            for(No aux = ref; aux != null; aux = aux.getProximo())
            {
                System.out.print(aux + " ");
                if(aux.getProximo() == null){
                    ultimo = aux;
                    break;
                }
            }
            System.out.println("\n");
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
