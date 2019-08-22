

package main;


public class JogoDeHanoi {
    PilhaOrigem pilhaOrigem;
    PilhaAuxiliar pilhaAuxiliar;
    PilhaDestino pilhaDestino;
    int numeroJogadas;

       
    public JogoDeHanoi(){
        
    }
    public JogoDeHanoi (PilhaOrigem pilhaOrigem, PilhaAuxiliar pilhaAuxiliar,
            PilhaDestino pilhaDestino, int numeroJogadas){
  
        numeroJogadas = 0;
    }
    
    public boolean fazerJogada(int numTorreOrigem, int numTorreDestino){
        
        int torreOrigem=0, torreDestino=0;    
        
        
        if(numTorreOrigem == 1){
           torreOrigem = pilhaOrigem.getTopo();
   
        }if(numTorreOrigem == 2){
           torreOrigem = pilhaAuxiliar.getTopo();
           
        }if(numTorreOrigem == 3){
           torreOrigem = pilhaDestino.getTopo();
        }
        
        if(numTorreDestino == 1){
           torreDestino = pilhaOrigem.getTopo();
        }if(numTorreDestino == 2){
           torreDestino = pilhaAuxiliar.getTopo();
        }if(numTorreDestino == 3){
           torreDestino = pilhaDestino.getTopo();
        }
        
        if(torreOrigem == 0){
            return false;
        }else{
            if(torreDestino == 0){
               if(numTorreOrigem == 1 && numTorreDestino == 2){
                   pilhaAuxiliar.push(pilhaOrigem.getTopo());
                   pilhaOrigem.pop();  
               }
               else if(numTorreOrigem == 1 && numTorreDestino == 3){
                   pilhaDestino.push(pilhaOrigem.getTopo());
                   pilhaOrigem.pop();  
               }
               else if(numTorreOrigem == 2 && numTorreDestino == 1){
                   pilhaOrigem.push(pilhaAuxiliar.getTopo());
                   pilhaAuxiliar.pop();  
               }
               else if(numTorreOrigem == 2 && numTorreDestino == 3){
                   pilhaDestino.push(pilhaAuxiliar.getTopo());
                   pilhaAuxiliar.pop();  
               }
               else if(numTorreOrigem == 3 && numTorreDestino == 1){
                   pilhaOrigem.push(pilhaDestino.getTopo());
                   pilhaDestino.pop();  
               }
               else if(numTorreOrigem == 3 && numTorreDestino == 2){
                   pilhaAuxiliar.push(pilhaDestino.getTopo());
                   pilhaDestino.pop();  
               }
               else{
                   return false;
               }
            }
            if(torreOrigem < torreDestino){
               if(numTorreOrigem == 1 && numTorreDestino == 2){
                   pilhaAuxiliar.push(pilhaOrigem.getTopo());
                   pilhaOrigem.pop();  
               }
               else if(numTorreOrigem == 1 && numTorreDestino == 3){
                   pilhaDestino.push(pilhaOrigem.getTopo());
                   pilhaOrigem.pop();  
               }
               else if(numTorreOrigem == 2 && numTorreDestino == 1){
                   pilhaOrigem.push(pilhaAuxiliar.getTopo());
                   pilhaAuxiliar.pop();  
               }
               else if(numTorreOrigem == 2 && numTorreDestino == 3){
                   pilhaDestino.push(pilhaAuxiliar.getTopo());
                   pilhaAuxiliar.pop();  
               }
               else if(numTorreOrigem == 3 && numTorreDestino == 1){
                   pilhaOrigem.push(pilhaDestino.getTopo());
                   pilhaDestino.pop();  
               }
               else if(numTorreOrigem == 3 && numTorreDestino == 2){
                   pilhaAuxiliar.push(pilhaDestino.getTopo());
                   pilhaDestino.pop();  
               }
            }else{
                return false;
            }
            numeroJogadas++;
        }    
    
    return true;
    }
    
    public boolean terminou(){
        if(pilhaOrigem.getTopo() != 0 && pilhaAuxiliar.getTopo() != 0
                || pilhaOrigem.getTopo() != 0 && pilhaDestino.getTopo() != 0){
            return false;
        }else{
            return true;
        }
    }

    public int getNumeroJogadas(){
        return numeroJogadas;
    }
         public String imprimir(){
       String saida = "" + pilhaOrigem.exibir() + "" + pilhaAuxiliar.exibir() +
               "" + pilhaDestino.exibir();
       
       return saida;
    }
    
}
