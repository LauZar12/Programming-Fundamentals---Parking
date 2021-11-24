import java.util.Arrays;
import java.util.Date;
public class Vehiculo{
    public static Vehiculo[][] vehiculos;
    public static int tamano;
    public static int cantidad = 0;
    private String placa;
    private String marca;
    private String color;
    private int valorComercial;
    private Date fecha;
    private double horario;
    
    public Vehiculo(){

    }
    public Vehiculo(double h, String p, String m, String c){
        this(h,p,m,c,30000000);
    }
    public Vehiculo(double h, String p, String m, String c, int v){
        this.horario = h;
        this.placa = p;
        this.marca = m;
        this.color = c;
        this.valorComercial = v;
        cantidad++;
        this.fecha = new Date();
    }
    
    public void setLlegada(double h){
        this.horario = h;
    }
    public double getLlegada(){
        return this.horario;
    }
    
    public void setPlaca(String p){
        this.placa = p;
    }
    public String getPlaca(){
        return this.placa;
    }
    
    public void setMarca(String m){
        this.marca = m;
    }
    public String getMarca(){
        return this.marca;
    }
    
    public void setColor(String c){
        this.color = c;
    }
    public String getColor(){
        return this.color;
    }
    
    public void setValor(int v){
        this.valorComercial = v;
    }
    public int getValor(){
        return this.valorComercial;
    }
    public void setFecha(){
        this.fecha = new Date();
    }
    public Date getFecha(){
        return this.fecha;
    }
    public String toString(){
        return (placa + ", " + marca + ", " + color + ", " + valorComercial+". La fecha y hora de entrada es: " +fecha);
    }
    public static String toStringVehiculos(){
        String tvehiculos = "";
        for(int i = 0; i < vehiculos.length;i++){
            for(int j = 0; j < vehiculos[0].length;j++){
                if(vehiculos[i][j]!= null){
                    tvehiculos = tvehiculos + vehiculos[i][j].toString() + "\n";
                }
            }
        }
        return tvehiculos;
    }
    public static int cantidadVehiculos(){
        int cantidad2 = 0;
        for(int i = 0; i < vehiculos.length;i++){
            for(int j = 0; j < vehiculos[0].length;j++){
                if(vehiculos[i][j]!= null){
                    cantidad2++;
                }
            }
        }
        return cantidad2;
    }
    public static String colorVehiculos(String color){
        String colorsv = "";
        for(int i = 0; i < vehiculos.length;i++){
            for(int j = 0; j < vehiculos[0].length;j++){
                if(vehiculos[i][j]!= null){
                    if((vehiculos[i][j].getColor()).equals(color)){
                        colorsv = colorsv + vehiculos[i][j].toString() + "\n";
                    }
                }
            }
        }
        return colorsv;
    }
    public static Vehiculo[] llenarArray() {
        int contador = 0;
        Vehiculo[] resultado = new Vehiculo[cantidad];
        for (int i = 0; i < vehiculos.length; i++) {
            for (int j = 0; j < vehiculos[i].length; j++) {
                if (vehiculos[i][j] != null) {
                    resultado[contador] = vehiculos[i][j];
                    contador++;
                }
            }
        }
        return resultado;
    }
    
    public static Vehiculo[] ordenarVehiculos(Vehiculo[] car) {
        Vehiculo[] asdf = car;
        Vehiculo temporal;
        for (int i = 1; i < asdf.length; i++) {
            for (int j = 0; j < asdf.length - i; j++) {
                if (asdf[j].getValor() > asdf[j + 1].getValor()) {
                    temporal = asdf[j];
                    asdf[j] = asdf[j + 1];
                    asdf[j + 1] = temporal;
                }
            }
        }
        return asdf;
        }
    }

