
import java.util.Set;
import utfpr.ct.dainf.if62c.pratica.Jogador;
import utfpr.ct.dainf.if62c.pratica.JogadorComparator;
import utfpr.ct.dainf.if62c.pratica.Time;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kiqdestro
 */
public class Pratica62 {
    public static void main( String[] args ){
        Time brasil;
        Set<String> posicoes;

        brasil = new Time();
 
        brasil.addJogador("Goleiro", new Jogador(12, "Diego Cavalieri"));
        brasil.addJogador("Zagueiro", new Jogador(32, "David Luiz"));
        brasil.addJogador("Atacante", new Jogador(7, "Hulk"));
        
        for(Jogador j: brasil.ordena(new JogadorComparator(false, true, true))){
            System.out.println(j);
        }
    }
}