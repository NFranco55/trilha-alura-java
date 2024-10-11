package Desafio.Livro;

public class PrincipalLivros {

    public static void main(String[] args) {
        Livro livro1 = new Livro();
        livro1.setTitulo("O Gato de Botas");
        livro1.setAutor("Charles Perrault");

        Livro livro2 = new Livro();
        livro2.setTitulo("Faixa Preta");
        livro2.setAutor("Hirokazu Kanazawa");

        livro1.exibirDetalhes();
        livro2.exibirDetalhes();

    }
}
