package MODELS;

public class Bateria extends Instumento{
    private Integer cantTambores;
    private Integer cantPlatillos;

    public Bateria() {
    }

    public Bateria(Double precio, String marca, Integer cantTambores, Integer cantPlatillos) {
        super((double)((cantTambores*3000)+(cantPlatillos*2000)), marca);
        this.cantTambores = cantTambores;
        this.cantPlatillos = cantPlatillos;
    }

    public Integer getCantTambores() {
        return cantTambores;
    }

    public void setCantTambores(Integer cantTambores) {
        this.cantTambores = cantTambores;
    }

    public Integer getCantPlatillos() {
        return cantPlatillos;
    }

    public void setCantPlatillos(Integer cantPlatillos) {
        this.cantPlatillos = cantPlatillos;
    }

    @Override
    public String toString() {
        return "Bateria{" +
                "cantTambores=" + cantTambores +
                ", cantPlatillos=" + cantPlatillos +
                "} " + super.toString();
    }

    @Override
    public void actualizacionPrecio(Double porcentaje) {
        super.actualizacionPrecio(porcentaje);
    }
}
