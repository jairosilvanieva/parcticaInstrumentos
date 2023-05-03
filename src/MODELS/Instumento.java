package MODELS;

public abstract class Instumento {
    protected Double precio;
    protected String marca;

    public Instumento() {
    }

    public Instumento(Double precio, String marca) {
        this.precio = precio;
        this.marca = marca;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Instumento{" +
                "precio=" + precio +
                ", marca='" + marca + '\'' +
                '}';
    }

    public void actualizacionPrecio(Double porcentaje){
        this.precio = (getPrecio()+(getPrecio()*porcentaje)/100);
    }


}
