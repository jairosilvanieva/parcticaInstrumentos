package MODELS;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        List<Instumento> instrumento = new ArrayList<>();

        Bateria bat1 = new Bateria(100.00, "Bosh", 3,5);
        Bateria bat2 = new Bateria(150.00, "Meridian", 4,3);
        GuitarraElectrica gElec1 = new GuitarraElectrica(75.00, "Casa Nuñez", 6 , "xt345" );
        GuitarraElectrica gElec2 = new GuitarraElectrica(90.00, "Castelvile", 6 , "longstret");
        Bajo bajito= new Bajo(130.00, "Parking", 4, "terra2000");
        Bajo bajote= new Bajo(200.00, "howart", 4, "nibus4500");
        GuitarraCriolla criollita = new GuitarraCriolla(50.00, "Antigua", 6, "caoba");
        GuitarraCriolla crio2 = new GuitarraCriolla(68.00, "Mala", 6, "nogal");


        instrumento.add(bat1);
        instrumento.add(bat2);
        instrumento.add(gElec1);
        instrumento.add(gElec2);
        instrumento.add(bajito);
        instrumento.add(bajote);
        instrumento.add(criollita);
        instrumento.add(crio2);


        for (Instumento instu: instrumento){
            System.out.println(instu);
            System.out.println("\n");
        }

        for(Instumento instu2: instrumento){
            if(instu2 instanceof SonidoAmplificado){
                ((SonidoAmplificado) instu2).sonidoAmplificado();
            }
        }

        Scanner teclado = new Scanner(System.in);

        Double descuentoBateria;
        Double descuentoGuitarraElectrica;
        Double descuentoGuitarraCriolla;
        Double descuentoBajo;

        System.out.println("\nIngrese el descuento que quiere aplicar a rubro Bateria ");
        descuentoBateria = teclado.nextDouble();
        teclado.nextLine();


        System.out.println("\nIngrese el descuento que quiere aplicar a rubro Guitarra Electrica ");
        descuentoGuitarraElectrica = teclado.nextDouble();
        teclado.nextLine();


        System.out.println("\nIngrese el descuento que quiere aplicar a rubro Guitarra Criolla ");
        descuentoGuitarraCriolla = teclado.nextDouble();
        teclado.nextLine();


        System.out.println("\nIngrese el descuento que quiere aplicar a rubro Bajo ");
        descuentoBajo = teclado.nextDouble();
        teclado.nextLine();

        for(Instumento instu3 : instrumento){
            System.out.println("Producto: "+ instu3.getMarca() +"El precio antes de actualizar es:  "+ instu3.getPrecio());
            if(instu3 instanceof GuitarraElectrica){
                instu3.actualizacionPrecio(descuentoGuitarraElectrica);
            }
            if(instu3 instanceof GuitarraCriolla){
                instu3.actualizacionPrecio(descuentoGuitarraCriolla);
            }
            if(instu3 instanceof Bateria){
                instu3.actualizacionPrecio(descuentoBateria);
            }
            if(instu3 instanceof Bajo){
                instu3.actualizacionPrecio(descuentoBajo);
            }

            System.out.println("El precio actualizado es: "+ instu3.getPrecio());
        }

    }
}