//Laura Danniela Zárate Guerrero.
//Luisa Fernanda Vallejo Chavarriaga.
//Miguel Angel Cock Cano.
//EQUIPO #4
import java.util.Scanner;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class Principal{
    public static void main(String[]args){
        Scanner sca = new Scanner(System.in);
        System.out.print("Digite la cantidad de pisos del edificio: ");
        int cpisos = sca.nextInt();
        System.out.print("Digite la cantidad de espacios de estacionamiento por piso: ");
        int cespacios = sca.nextInt();
        Vehiculo.tamano = cpisos*cespacios;
        Vehiculo.vehiculos = new Vehiculo[cpisos][cespacios];
        Sensor.sensores = new Sensor[cpisos][cespacios];
        Vehiculo.tamano = cpisos*cespacios;
        System.out.print("Digite el precio a pagar por hora de los carros: ");
        int precioCarros = sca.nextInt();
        System.out.print("Digite el precio a pagar por hora de las motos: ");
        int precioMotos = sca.nextInt();
        System.out.println("");
        Calendar calendario = new GregorianCalendar();
        int hora, minutos, segundos;
        while(true){
            System.out.print("Menú de opciones: ");
            System.out.println(" ");
            System.out.println("Digite 0 para salir del parqueadero.");
            System.out.println("Digite 1 para imprimir los sensores desocupados.");
            System.out.println("Digite 2 para seleccionar el espacio de parqueo deseado.");
            System.out.println("Digite 3 para seleccionar el espacio de parqueo deseado si conoce el valor de su vehículo.");
            System.out.println("Digite 4 para mostrar la información de los vehículos almacenados.");
            System.out.println("Digite 5 para mostrar la cantidad de vehículos creados hasta el momento.");
            System.out.println("Digite 6 para visualizar el estado de un piso y espacio específico.");
            System.out.println("Digite 7 para mostrar el estado de todos los sensores.");
            System.out.println("Digite 8 para mostrar la información de los vehículos almacenados de un mismo color.");
            System.out.println("Digite 9 para mostrar la información de todos los vehículos ordenados por precio. ");
            System.out.println("Digite 10 para sacar el vehículo del parqueadero y ver el precio a pagar.  ");
            System.out.println("Digite 11 para guardar la información de parqueo. ");
            int opcion = sca.nextInt();
            int piso = -1;
            int espacio = -1;

            switch(opcion){
                case 0:
                    System.out.println("Saliendo...");
                    return;
                case 1:
                    System.out.println(Sensor.sensorLibre());
                    break;
                case 2:
                    System.out.print("Digite el piso en el que desea estacionarse: ");
                    piso = sca.nextInt();
                    System.out.print("Digite el espacio en el que desea estacionarse: ");
                    espacio = sca.nextInt();
                    System.out.println("Digite 1 si quiere estacionar un auto y 2 si quiere estacionar una moto: ");
                    int tipo = sca.nextInt();
                    if(tipo == 1){
                        if(Vehiculo.vehiculos[piso][espacio] == null){
                            System.out.print("Digite su hora de entrada con minutos en horario de 24 horas: ");
                            double horaentrada = sca.nextDouble();
                            System.out.print("Digite la placa de su automovil: ");
                            String placa = sca.next();
                            System.out.print("Digite la marca de su automovil: ");
                            String marca = sca.next();
                            System.out.print("Digite el color de su automovil: ");
                            String color = sca.next();
                            Sensor.sensores[piso][espacio] = new Sensor(1);
                            Carro cars_the_movie = new Carro(horaentrada,placa,marca,color,"Carro");
                            Vehiculo.vehiculos[piso][espacio] = cars_the_movie;
                        } else{
                            System.out.println("El espacio está ocupado.");
                        }
                    } else if (tipo == 2){
                        if(Vehiculo.vehiculos[piso][espacio] == null){
                            System.out.print("Digite su hora de entrada con minutos en horario de 24 horas: ");
                            double horaentrada = sca.nextDouble();
                            System.out.print("Digite la placa de su moto: ");
                            String placa = sca.next();
                            System.out.print("Digite la marca de su moto: ");
                            String marca = sca.next();
                            System.out.print("Digite el color de su moto: ");
                            String color = sca.next();
                            Sensor.sensores[piso][espacio] = new Sensor(1);
                            Moto bihonicles_the_movie = new Moto(horaentrada,placa,marca,color,"Moto");
                            Vehiculo.vehiculos[piso][espacio] = bihonicles_the_movie;
                        } else{
                            System.out.println("El espacio está ocupado.");
                        }
                    }
                    break;
                case 3:
                    System.out.print("Digite el piso en el que desea estacionarse: ");
                    piso = sca.nextInt();
                    System.out.print("Digite el espacio en el que desea estacionarse: ");
                    espacio = sca.nextInt();
                    System.out.println("Digita 1 si quiere estacionar un auto y 2 si quiere estacionar una moto: ");
                    int tipo2 = sca.nextInt();
                    if(tipo2 == 1){
                        if(Vehiculo.vehiculos[piso][espacio] == null){
                            System.out.print("Digite su hora de entrada con minutos en horario de 24 horas: ");
                            double horaentrada = sca.nextDouble();
                            System.out.print("Digite la placa de su automovil: ");
                            String placa = sca.next();
                            System.out.print("Digite la marca de su automovil: ");
                            String marca = sca.next();
                            System.out.print("Digite el color de su automovil: ");
                            String color = sca.next();
                            System.out.println("Digite el valor comercial de su carro: ");
                            int valor = sca.nextInt();
                            Sensor.sensores[piso][espacio] = new Sensor(1);
                            Carro cars_the_movie = new Carro(horaentrada,placa,marca,color,valor,"Carro");
                            Vehiculo.vehiculos[piso][espacio] = cars_the_movie;
                        } else{
                            System.out.println("El espacio está ocupado.");
                        }
                    } else if(tipo2 == 2){
                        if(Vehiculo.vehiculos[piso][espacio] == null){
                             System.out.print("Digite su hora de entrada con minutos en horario de 24 horas: ");
                            double horaentrada = sca.nextDouble();
                            System.out.print("Digite la placa de su moto: ");
                            String placa = sca.next();
                            System.out.print("Digite la marca de su moto: ");
                            String marca = sca.next();
                            System.out.print("Digite el color de su moto: ");
                            String color = sca.next();
                            System.out.println("Digite el valor comercial de su moto: ");
                            int valor = sca.nextInt();
                            Moto bihonicles_the_movie = new Moto(horaentrada,placa,marca,color,valor,"Moto");
                            Vehiculo.vehiculos[piso][espacio] = bihonicles_the_movie;
                            Sensor.sensores[piso][espacio]  = new Sensor(1);
                        } else{
                            System.out.println("El espacio está ocupado.");
                        }
                    }
                    break;
                case 4:
                    System.out.println(Vehiculo.toStringVehiculos());
                    break;
                case 5:
                    System.out.println(Vehiculo.cantidadVehiculos());
                    break;
                case 6:
                    System.out.print("Comprobar disponibilidad.");
                    System.out.print("Digite el piso: ");
                    piso = sca.nextInt();
                    System.out.print("Digite el espacio: ");
                    espacio = sca.nextInt();
                    if((Sensor.sensores[piso][espacio].toString()).equals("Libre")){
                        System.out.println("El espacio solicitado está libre.");
                    } else {
                        System.out.println("El espacio solicitado está ocupado.");
                    }
                    break;
                case 7: 
                    System.out.println(Sensor.sensoresEstado());
                    break;
                case 8:
                    System.out.print("Ingresa un color: ");
                    String color = sca.next();
                    System.out.println(Vehiculo.colorVehiculos(color));
                    break;
                case 9:
                    for(int a = 0; a < Vehiculo.cantidad; a++){
                        System.out.println(Vehiculo.ordenarVehiculos(Vehiculo.llenarArray())[a].toString());
                    }
                    break;
                case 10:
                    System.out.print("En que piso esta su vehiculo: ");
                    int pizza = sca.nextInt();
                    System.out.print("En que sitio esta su vehiculo: ");
                    int sideral = sca.nextInt();
                    System.out.print("Digite su hora de salida con minutos en horario de 24 horas: ");
                    int horafin = sca.nextInt();
                    while(Vehiculo.vehiculos[pizza][sideral] == null){
                        System.out.println("El espacio digitado no tiene un vehículo. Digite de nuevo. ");
                        System.out.print("En que piso esta su vehiculo: ");
                        pizza = sca.nextInt();
                        System.out.print("En que sitio esta su vehiculo: ");
                        sideral = sca.nextInt();
                    }
                    System.out.println("Digite 1 si su vehiculo es un auto y 2 si su vehiculo es una moto: ");
                        int tipo1 = sca.nextInt();
                        double precio;
                        double p = horafin - Vehiculo.vehiculos[pizza][sideral].getLlegada();
                        if(tipo1 == 1){
                            precio = precioCarros*p;
                        }else{
                            precio = precioMotos*p;
                        }
                        Vehiculo.vehiculos[pizza][sideral] = null;
                        Sensor.sensores[pizza][sideral] = null;
                        System.out.println("El precio a pagar por el tiempo del vehículo en el estacionamiento es es de: "+ precio );
                    break;
                case 11:
                    DatosVehiculo guardarDatos = new DatosVehiculo();
                    for(int i = 0; i < Vehiculo.vehiculos.length;i++){
                        for(int j = 0; j < Vehiculo.vehiculos[0].length;j++){
                            if(Vehiculo.vehiculos[i][j]!= null){
                                guardarDatos.guardarDatos(Vehiculo.vehiculos[i][j].getPlaca(),Vehiculo.vehiculos[i][j].getMarca(),Vehiculo.vehiculos[i][j].getColor(),Vehiculo.vehiculos[i][j].getValor());
                            }
                        }
                    }
                    break;
                default:
                    System.out.println("Comando Incorrecto. \nDigite de nuevo la opción a elegir. \n ");
                    break;
            }
        }
    }
}
