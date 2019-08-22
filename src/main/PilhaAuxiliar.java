
package main;


public class PilhaAuxiliar {
   
    private int[] dados;
    private int topo;
    
    public PilhaAuxiliar(int tam){
    dados = new int[tam];
    topo = 0;
    }

    public int[] getDados() {
        return dados;
    }

    public void setDados(int[] dados) {
        this.dados = dados;
    }
    
    public boolean isEmpty() {
        return (topo == 0);
    }
    
    public boolean isFull() {
        return (topo == dados.length);
    }
    
    public boolean push(int valor) {
        if(isFull())
            return false;
        dados[topo] = valor;
        topo++;
        return true;
    }
    
    public int getTopo(){
        return dados[topo-1];
    }
    
    public int pop(){
        if(isEmpty())
            System.out.println("Vazia");
        topo--;
        return dados[topo];
    }
    
    public int getSize(){
        return topo;
    }
    
    public String exibir() {
        if(isEmpty())
            return "Pilha Vazia";
        
        String saida = "" + topo;
        int aux = topo - 1;
        
        while(aux != 0){
            saida += ";" + aux;
            aux = aux - 1;
        }
        
        return saida;
    }
    
    
}
