package DesafiosHandsOn.VendaLivro;

public class ProdutoFisico extends Produto implements Calculavel{
    @Override
    public double calcularPrecoFinal() {
        double preco = 0;
        return preco * 1.05;
    }
}
