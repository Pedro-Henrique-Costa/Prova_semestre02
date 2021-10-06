public class Main {
    public static void main(String[] args) {

        Cinema cineCataratas = new Cinema(2.00f,5.00f);
        Catalogo filmesHoje = new Catalogo("Vingadores","Aventura");
        Filmes secaoFilme = new Filmes(true,16);
        Horarios horarioFilme = new Horarios(16,16,30);

        secaoFilme.getHorarios().add(horarioFilme);
        filmesHoje.getFilmes().add(secaoFilme);
        cineCataratas.getCatalogos().add(filmesHoje);

        System.out.println(cineCataratas);


    }
}
