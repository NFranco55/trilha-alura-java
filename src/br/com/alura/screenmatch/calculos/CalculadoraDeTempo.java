package br.com.alura.screenmatch.calculos;

import br.com.alura.screematch.modelo.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal = 0;

    public int getTempoTotal() {
        return this.tempoTotal;
    }
     // Na unha
//    public void incluir(Filme f){
//        this.tempoTotal += f.getDuracaoEmMinutos();
//    }
//
//    public void incluir(Serie s){
//        this.tempoTotal += s.getDuracaoEmMinutos();
//    }

    //Usando polimorfismo
    public void incluir (Titulo titulo){
        System.out.println("Adicionando duração em minutos é de: " + titulo);
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }

}
