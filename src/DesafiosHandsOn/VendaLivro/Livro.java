package DesafiosHandsOn.VendaLivro;

import DesafiosHandsOn.Livro.Produto;

public class Livro extends Produto implements Calculavel {
    private String autor;

    @Override
    public double calcularPrecoFinal() {
        double preco = 0;
        return preco * 0.9;
    }
}
