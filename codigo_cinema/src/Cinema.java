import java.util.ArrayList;
import java.util.List;

public class Cinema {
    private float precoPipoca;
    private float precoIngresso;
    private List<Catalogo> Catalogos = new ArrayList<>();

    public Cinema(float precoPipoca, float precoIngresso) {
        this.precoPipoca = precoPipoca;
        this.precoIngresso = precoIngresso;
    }

    public float getPrecoPipoca() {
        return precoPipoca;
    }

    public void setPrecoPipoca(float precoPipoca) {
        this.precoPipoca = precoPipoca;
    }

    public float getPrecoIngresso() {
        return precoIngresso;
    }

    public void setPrecoIngresso(float precoIngresso) {
        this.precoIngresso = precoIngresso;
    }

    public List<Catalogo> getCatalogos() {
        return Catalogos;
    }

    public void setCatalogos(List<Catalogo> catalogos) {
        Catalogos = catalogos;
    }

    @Override
    public String toString() {
        return "Cinema{" +
                "precoPipoca=" + precoPipoca +
                ", precoIngresso=" + precoIngresso +
                ", Catalogos=" + Catalogos +
                '}';
    }
}
