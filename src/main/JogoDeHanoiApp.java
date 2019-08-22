package main;

import java.util.Scanner;

public class JogoDeHanoiApp {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        JogoDeHanoi jogo = new JogoDeHanoi();

        int nTorreO;
        int nTorreD;
        while(jogo.terminou()!= true){
            System.out.println("Qual a torre de origem? 1-Origem 2-Auxiliar 3-Destino");

                nTorreO= entrada.nextInt();

            System.out.println("Qual a torre de destino? 1-Origem 2-Auxiliar 3-Destino");

                nTorreD= entrada.nextInt();

                jogo.fazerJogada(nTorreO, nTorreD);

                System.out.println("Número de jogadas: "+jogo.getNumeroJogadas());
           }

                System.out.println("Estado final das torres: "+jogo.imprimir());
                System.out.println("Número final de jogadas: "+jogo.getNumeroJogadas());
   
  }
}
    
