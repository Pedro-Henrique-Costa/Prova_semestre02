public class Horarios {
    private int dia;
    private int hora;
    private int minuto;


    public Horarios(int dia, int hora, int minuto) {
        this.dia = dia;
        this.hora = hora;
        this.minuto = minuto;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    @Override
    public String toString() {
        return "Horarios{" +
                "dia=" + dia +
                ", hora=" + hora +
                ", minuto=" + minuto +
                '}';
    }
}
