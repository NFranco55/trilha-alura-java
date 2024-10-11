package DesafiosHandsOn.VendaLivro;

public interface Vendavel {
    double calcularPrecoTotal(int quantidade);
    void aplicarDesconto(double percentualDesconto);
}
