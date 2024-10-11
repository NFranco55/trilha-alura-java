package DesafiosHandsOn.IdadePessoa;

public class PrincipalIdadePessoa {
    public static void main(String[] args) {

        idadePessoa pessoa1 = new idadePessoa();
        pessoa1.setIdade(22);
        pessoa1.setNome("Antônio");

        idadePessoa pessoa2 = new idadePessoa();
        pessoa2.setIdade(18);
        pessoa2.setNome("Camila");


        System.out.println(pessoa1.getNome() + " tem " + pessoa1.getIdade() + " anos.");
        pessoa1.verificarIdade();
        System.out.println(pessoa2.getNome() + " tem " + pessoa2.getIdade() + " anos.");
        pessoa2.verificarIdade();

    }
}
