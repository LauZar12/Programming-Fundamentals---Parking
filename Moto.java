public class Moto extends Vehiculo{
    private String tipo; 
    public Moto(double h, String p, String m, String c, String t){
        super(h,p,m,c);
        this.tipo = t;
    }
    public Moto(double h,String p, String m, String c, int v, String t){
        super(h,p,m,c,v);
        this.tipo = t;
    }
    public void setTipo(){
        this.tipo = "Moto";
    }
    public String getTipo(){
        return tipo;
    }
    public String toString(){
        return (tipo +". " + getPlaca() + ", " + getMarca() + ", " + getColor() + ", " + getValor() +". La fecha y hora de entrada es: " +getFecha());
    }
}