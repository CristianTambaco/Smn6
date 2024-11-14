package vehiculo_herencia;

public class VEHICULO {

    //atributos
    String modelo;
    String marca;
    int anio;
    double kilometraje;

    //metodo constructor
    public VEHICULO(String marca, String modelo, int anio, double kilometraje){
        this.marca =marca;
        this.modelo =modelo;
        this.anio = anio;
        this.kilometraje =kilometraje;
    }


    //metodo para imprimir

    public void imprimir() {

        System.out.println("El modelo es: " + modelo + "la marca es: " + marca + " el anio es: " + anio + " el kilometraje es:" + kilometraje);
    }


        //herencia

        public static class Coche extends VEHICULO {


            public Coche(String marca, String modelo, int anio, double kilometraje) {
                super(marca, modelo, anio, kilometraje);  //van la parte de informacion


            }


        }


        public static class Motocicleta extends VEHICULO {

            public Motocicleta(String marca, String modelo, int anio, double kilometraje) {
                super(marca, modelo, anio, kilometraje);

            }


        }

        public static class Camion extends VEHICULO {
            public Camion(String marca, String modelo, int anio, double kilometraje) {
                super(marca, modelo, anio, kilometraje);


            }

        }


        public static void main (String[]args){

            System.out.println();

            //crear objeto datos quemados
            Coche coche1 = new Coche("Chevrolet", "Family", 2024, 160);
            Motocicleta moto1 = new Motocicleta("Suzuki", "Modelomoto", 2020, 2000);
            Camion camion1 = new Camion("Hino", "Hinomodelo", 2023, 8000);

            coche1.imprimir();
            moto1.imprimir();
            camion1.imprimir();


        }







}

