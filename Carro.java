public class Carro extends Vehiculo{
    private String tipo; 
    public Carro(double h, String p, String m, String c, String t){
        super(h,p,m,c);
        this.tipo = t;
    }
    public Carro(double h,String p, String m, String c, int v, String t){
        super(h,p,m,c,v);
        this.tipo = t;
    }
    public void setTipo(String t){
        this.tipo = t;
    }
    public String getTipo(){
        return tipo;
    }
    public String toString(){
        return (tipo +". " + getPlaca() + ", " + getMarca() + ", " + getColor() + ", " + getValor() +". La fecha y hora de entrada es: " +getFecha());
    }
}
