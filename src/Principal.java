import br.com.alura.screematch.modelo.Episodio;
import br.com.alura.screematch.modelo.Filme;
import br.com.alura.screematch.modelo.Serie;
import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.Recomendacao;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("John Wick");
        meuFilme.setAnoDeLancamento(2018);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos() + " minutos.");

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println("Média de avaliações do filme: " + meuFilme.pegaMedia());
        System.out.println("\n");

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodioPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar a série: " + lost.getDuracaoEmMinutos() + " minutos.\n");

        Filme novoFilme = new Filme();
        novoFilme.setNome("Matrix");
        novoFilme.setAnoDeLancamento(1999);
        novoFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calc = new CalculadoraDeTempo();
        calc.incluir(meuFilme);
        calc.incluir(novoFilme);
        calc.incluir(lost);

        System.out.println(calc.getTempoTotal());

        Recomendacao filtro = new Recomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);
    }
}
