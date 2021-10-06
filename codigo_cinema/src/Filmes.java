import java.util.ArrayList;
import java.util.List;

public class Filmes {
    private boolean confirmaIngresso;
    private int idadePermitida;
    private List<Horarios> Horarios = new ArrayList<>();


    public Filmes(boolean confirmaIngresso, int idadePermitida) {
        this.confirmaIngresso = confirmaIngresso;
        this.idadePermitida = idadePermitida;
    }


    public boolean isConfirmaIngresso() {
        return confirmaIngresso;
    }

    public void setConfirmaIngresso(boolean confirmaIngresso) {
        this.confirmaIngresso = confirmaIngresso;
    }

    public int getIdadePermitida() {
        return idadePermitida;
    }

    public void setIdadePermitida(int idadePermitida) {
        this.idadePermitida = idadePermitida;
    }

    public List<Horarios> getHorarios() {
        return Horarios;
    }

    public void setHorarios(List<Horarios> horarios) {
        Horarios = horarios;
    }

    @Override
    public String toString() {
        return "Filmes{" +
                "confirmaIngresso=" + confirmaIngresso +
                ", idadePermitida=" + idadePermitida +
                ", Horarios=" + Horarios +
                '}';
    }
}
