package lista;

public class ListaEncadeada {
    private No ref; 
    private int tamanho = 0; 

    public void Imprimir(){
        if(EmptyList())
            System.out.println("Lista vazia!");
        else
            System.out.println(ref);
    }

    public void Adicionar(int elemento)
    {
        No celula = new No(elemento);

        if(EmptyList())
            this.ref = celula;        
        else
        {
            for(No aux = ref; aux != null; aux = aux.getProximo())
            {              
                if(aux.getProximo() == null)
                {
                    aux.setProximo(celula);
                    this.tamanho++;
                    return;
                }
            }
        }         
    }

    public void AdicionarOrdenado(int elemento){
        No novoNo = new No(elemento);

        if(EmptyList())
            this.ref = novoNo;
        else if(GetTamanho() == 1)
        {
            if(ref.getElemento() < elemento){
                ref.setProximo(novoNo);
            }
            else{
                novoNo.setProximo(ref);
                ref = novoNo;
            }
            this.tamanho++;
        }
        else
        {
            No aux = ref;
            for(No p = ref.getProximo(); p != null; p = p.getProximo()){
                if(aux.getElemento() < elemento && p.getElemento() > elemento){
                    aux.setProximo(novoNo);
                    novoNo.setProximo(p);
                    this.tamanho++;
                    return;
                }              
                else if(p.getProximo() == null && p.getElemento() < elemento){
                    p.setProximo(novoNo);
                    this.tamanho++;
                    return;
                }  
                aux = p;
            }
        }
    }

    public String Buscar(int elemento)
    {
        if(EmptyList())
        {
            return "-1";
        }
        else if(GetTamanho() == 1)
        {
            if(this.ref.getElemento() == elemento)
            {
                return "-1";
            }            
        }            
        else
        {
            for(No aux = ref; aux != null; aux = aux.getProximo())
            {                
                if(aux.getElemento() == elemento)
                {
                    return "elemento encontrado";
                }
            }                     
        }  
        return "-1";      
    }

    public void ExcluirPrimeiro()
    {
        this.ref = ref.getProximo();
        this.tamanho--;
    }

    public void Excluir(int elemento)
    {
        if(EmptyList())
        {
            System.out.println("Lista vazia");
        }
        else if(GetTamanho() == 1)
        {
            if(ref.getElemento() == elemento)
            {
                this.ref = null; 
                this.tamanho --;
            }                 
            else
            {
                System.out.println("Elemento não encontrado");
            }                
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
                        this.tamanho--;
                        return;
                    }
                    aux.setProximo(p.getProximo());
                    this.tamanho--;
                    return;
                }
                aux = p;
            }
        }
        System.out.println("Elemento não encontrado");
    }

    public int GetTamanho()
    {
        return this.tamanho;
    }

    public boolean EmptyList()
    {
        return ref == null; 
    }

    @Override
    public String toString() 
    {
        return "ListaEncadeada [Início => " + ref + "]";
    }    
}
