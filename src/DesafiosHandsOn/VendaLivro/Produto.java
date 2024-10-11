package DesafiosHandsOn.VendaLivro;

public class Produto implements Vendavel{
    private String nome;
    private Double precoUnitario;

    @Override
    public double calcularPrecoTotal(int quantidade) {
        return precoUnitario * quantidade;
    }

    @Override
    public void aplicarDesconto(double percentualDesconto) {
        precoUnitario -= precoUnitario * (percentualDesconto / 100.0);
    }
}
