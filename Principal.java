import java.util.Scanner;
import javax.swing.JOptionPane;
public class Principal{
    public static void main (String[] args) {
        Principal.mostrarMenu();
    }

    public static void mostrarMenu(){

        Scanner scannner = new Scanner(System.in); 
        int x=1;
        while(x>=0){

            System.out.println("Bienvenido escribe un numero:   ");
            System.out.println("Presione 0 para salir del programa");
            System.out.println("Presione 1 para agregar un vehiculo");
            System.out.println("Presione 2 para ver la informacion de los vehiculos");
            System.out.println("Presione 3 para ver la cantidad de los vehiculos");
            System.out.println("Presione 4 para ver los vehiculos de color verde");
            System.out.println("Presione 5 para buscar un auto por su Id");
            int num = scannner.nextInt();

            switch(num){

                case 0:
                JOptionPane.showMessageDialog(null,"Se ha cerrado el programa ");

                break;

                case 1:

                Vehiculo v1 = new Vehiculo();

                System.out.println("Modelo del Automovil: ");
                int modelo = scannner.nextInt();
                v1.setModelo(modelo);

                System.out.println("Marca del Automovil: ");
                String marca = scannner.next();
                v1.setMarca(marca);

                System.out.println("ValorComercial del Automovil: ");
                double valorComercial = scannner.nextDouble();
                v1.setValorComercial(valorComercial);

                System.out.println("Color del Automovil: ");
                String color  = scannner.next();
                v1.setColor(color);

                System.out.println("Ingrese el Id: ");
                int  id  = scannner.nextInt();
                v1.setId(id);

                continue;

                case 2:

                System.out.println(Vehiculo.toStringVehiculos());
                continue;

                case 3:
                System.out.println("Cantidad de Vehiculos: " + Vehiculo.cantidadVehiculos());
                continue;

                case 4:
                System.out.println(Vehiculo.VehiculosVerdes());
                continue;

                case 5:
                System.out.println("Ingrese el Id del vehiculo que quiere encontrar");
                int BuscarId= scannner.nextInt();
                System.out.println(Vehiculo.VehiculoId(BuscarId));
                continue;

            }
        }
    }
}