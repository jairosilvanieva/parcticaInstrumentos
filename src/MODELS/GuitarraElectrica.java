package MODELS;

public class GuitarraElectrica extends InstrumentosCuerdas implements SonidoAmplificado{
    private String nombreModelo;

    public GuitarraElectrica() {
    }

    public GuitarraElectrica(Double precio, String marca, Integer cantCuerdas, String nombreModelo) {
        super(precio, marca, cantCuerdas);
        this.nombreModelo = nombreModelo;
    }

    public String getNombreModelo() {
        return nombreModelo;
    }

    public void setNombreModelo(String nombreModelo) {
        this.nombreModelo = nombreModelo;
    }

    @Override
    public String toString() {
        return "GuitarraElectrica{" +
                "nombreModelo='" + nombreModelo + '\'' +
                "} " + super.toString();
    }


    @Override
    public void sonidoAmplificado() {
        System.out.println(getNombreModelo()+ " : SONIDO AMPLIFICADO");
    }

    @Override
    public void actualizacionPrecio(Double porcentaje) {
        super.actualizacionPrecio(porcentaje);
    }
}
