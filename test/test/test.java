
package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import main.PilhaOrigem;
import main.PilhaAuxiliar;
import main.PilhaDestino;
import main.JogoDeHanoi;

public class test {
    private PilhaOrigem p;
    private PilhaAuxiliar a;
    private PilhaDestino d;
    private JogoDeHanoi j;
    
    @Test
    public void testPilhaVaziaOrigem(){ 
        int tamanho = 4;
        p = new PilhaOrigem(tamanho);
        boolean vazia = p.isEmpty();
        assertTrue(vazia);
    }
    
    @Test
    public void testPilhaVaziaAuxiliar(){ 
        int tamanho = 4;
        a = new PilhaAuxiliar(tamanho);
        boolean vazia = a.isEmpty();
        assertTrue(vazia);
    }
    
    @Test
    public void testPilhaVaziaDestino(){ 
        int tamanho = 4;
        d = new PilhaDestino(tamanho);
        boolean vazia = d.isEmpty();
        assertTrue(vazia);
    }
    
    @Test
    public void testValorNoTopoOrigem(){
        int tamanho = 4;
        p = new PilhaOrigem(tamanho);
        p.push(10);
        assertEquals(10, p.getTopo());
    }
    
    @Test
    public void testValorNoTopoAuxiliar(){
        int tamanho = 4;
        a = new PilhaAuxiliar(tamanho);
        a.push(10);
        assertEquals(10, a.getTopo());
    }
    @Test
    public void testValorNoTopoDestino(){
        int tamanho = 4;
        p = new PilhaOrigem(tamanho);
        p.push(10);
        assertEquals(10, p.getTopo());
    }

    
    @Test
    public void testInserirUmValorOrigem(){
        int tamanho = 4;
        p = new PilhaOrigem(tamanho);
        
        boolean inseriu = p.push(10);
        assertFalse(p.isEmpty());
        assertTrue(inseriu);
    }
    
    @Test
    public void testInserirUmValorAuxiliar(){
        int tamanho = 4;
        a = new PilhaAuxiliar(tamanho);
        
        boolean inseriu = a.push(10);
        assertFalse(a.isEmpty());
        assertTrue(inseriu);
    }
    
    @Test
    public void testInserirUmValorDestino(){
        int tamanho = 4;
        d = new PilhaDestino(tamanho);
        
        boolean inseriu = d.push(10);
        assertFalse(d.isEmpty());
        assertTrue(inseriu);
    }
    
    @Test
    public void testRemoverUmValorOrigem(){
        int tamanho = 4;
        p = new PilhaOrigem(tamanho);
        p.push(1);
        
        int valor = p.pop();
        
        assertEquals(1, valor);
        assertTrue(p.isEmpty());
    }
    @Test
    public void testRemoverUmValorAuxiliar(){
        int tamanho = 4;
        a = new PilhaAuxiliar(tamanho);
        a.push(1);
        
        int valor = a.pop();
        
        assertEquals(1, valor);
        assertTrue(a.isEmpty());
    }
    
    @Test
    public void testRemoverUmValorDestino(){
        int tamanho = 4;
        d = new PilhaDestino(tamanho);
        d.push(1);
        
        int valor = d.pop();
        
        assertEquals(1, valor);
        assertTrue(d.isEmpty());
    }
    
    @Test
    public void testExibirOrigem(){
        int tamanho = 4;
        p = new PilhaOrigem(tamanho);
        p.push(1);
        p.push(2);
        p.push(3);
        
        String retorno = p.exibir();
        
        assertEquals("3;2;1",retorno);
    }
    
    @Test
    public void testExibirAuxiliar(){
        int tamanho = 4;
        a = new PilhaAuxiliar(tamanho);
        a.push(1);
        a.push(2);
        a.push(3);
        
        String retorno = a.exibir();
        
        assertEquals("3;2;1",retorno);
    }
    
    @Test
    public void testExibirDestino(){
        int tamanho = 4;
        d = new PilhaDestino(tamanho);
        d.push(1);
        d.push(2);
        d.push(3);
        
        String retorno = d.exibir();
        
        assertEquals("3;2;1",retorno);
    }
    
    @Test
    public void testFazerJogada(){
        int tamanho = 4;
        p = new PilhaOrigem(tamanho);
        a = new PilhaAuxiliar(tamanho);
        d = new PilhaDestino(tamanho);
        j = new JogoDeHanoi();
        p.push(1);
        d.push(4);
        
        boolean jogou = j.fazerJogada(1, 3);
        assertTrue(jogou);
    }

}
    

