package MODELS;

public abstract class InstrumentosCuerdas extends Instumento{
    private Integer cantCuerdas;

    public InstrumentosCuerdas() {
    }

    public InstrumentosCuerdas(Double precio, String marca, Integer cantCuerdas) {
        super(precio, marca);
        this.cantCuerdas = cantCuerdas;
    }

    public Integer getCantCuerdas() {
        return cantCuerdas;
    }

    public void setCantCuerdas(Integer cantCuerdas) {
        this.cantCuerdas = cantCuerdas;
    }

    @Override
    public String toString() {
        return "InstrumentosCuerdas{" +
                "cantCuerdas=" + cantCuerdas +
                "} " + super.toString();
    }


}
