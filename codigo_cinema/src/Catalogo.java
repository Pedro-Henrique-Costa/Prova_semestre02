import java.util.ArrayList;
import java.util.List;

public class Catalogo {
    private String nomeFilme;
    private String nomeGenero;
    private List<Filmes> Filmes = new ArrayList<>();


    public Catalogo(String nomeFilme, String nomeGenero) {
        this.nomeFilme = nomeFilme;
        this.nomeGenero = nomeGenero;
    }


    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public String getNomeGenero() {
        return nomeGenero;
    }

    public void setNomeGenero(String nomeGenero) {
        this.nomeGenero = nomeGenero;
    }

    public List<Filmes> getFilmes() {
        return Filmes;
    }

    public void setFilmes(List<Filmes> filmes) {
        Filmes = filmes;
    }

    @Override
    public String toString() {
        return "Catalogo{" +
                "nomeFilme='" + nomeFilme + '\'' +
                ", nomeGenero='" + nomeGenero + '\'' +
                ", Filmes=" + Filmes +
                '}';
    }

}
