package MODELS;

public class GuitarraCriolla extends InstrumentosCuerdas {
    private String tipoMadera;

    public GuitarraCriolla() {
    }

    public GuitarraCriolla(Double precio, String marca, Integer cantCuerdas, String tipoMadera) {
        super(precio, marca, cantCuerdas);
        this.tipoMadera = tipoMadera;
    }

    @Override
    public void actualizacionPrecio(Double porcentaje) {
        super.actualizacionPrecio(porcentaje);
    }

    public String getTipoMadera() {
        return tipoMadera;
    }

    public void setTipoMadera(String tipoMadera) {
        this.tipoMadera = tipoMadera;
    }

    @Override
    public String toString() {
        return "GuitarraCriolla{" +
                "tipoMadera='" + tipoMadera + '\'' +
                "} " + super.toString();
    }


}
