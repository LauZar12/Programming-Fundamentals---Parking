public class Sensor{
    public static Sensor[][] sensores;
    private int estado;
    public Sensor(){
        
    }
    public Sensor(int e){
        this.estado = e;
    }
    public void setEstado(int e){
            this.estado = e;
    }
    public int getEstado(){
        return this.estado;
    }
    public String toString(){
        return (this.estado == 1) ? "Ocupado" : "Libre";
    }
    public static String sensorLibre(){
        String espacios = "";
        for(int i = 0; i < sensores.length;i++){
            for(int j = 0; j < sensores[i].length;j++){
                if(sensores[i][j]== null){
                      espacios = espacios + "Piso: "+ i + " Espacio: "+j + "\n";
                    }
            }
        }
        return espacios;
    }
    public static String sensoresEstado(){
        String state = "";
        for(int i = 0; i < sensores.length;i++){
            for(int j = 0; j < sensores[0].length;j++){
                if(sensores[i][j]== null){
                    state = state + "En el Piso: "+ i + " el Espacio: "+ j + " está " + "libre" + "\n";
                }else{
                    state = state + "En el Piso: "+ i + " el Espacio: "+ j + " está " + sensores[i][j].toString() + "\n";
                }
            }
        }
        return state;
    }
}