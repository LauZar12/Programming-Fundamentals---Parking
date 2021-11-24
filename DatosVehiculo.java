import java.io.*;
public class DatosVehiculo{
    
    public void guardarDatos(String p, String m, String c, int v){
        FileWriter fichero = null;
        BufferedWriter bw = null;
        try
        {
            String rout = "BASEDEDATOSPARQUEADERO";
            File file = new File(rout);
            if (!file.exists()) {
                file.createNewFile();
            }
            fichero = new FileWriter(file.getAbsoluteFile(), true);
            bw = new BufferedWriter(fichero);

            bw.write("Placa: "+ p +"\n");
            bw.write("Marca: "+ m +"\n");
            bw.write("Color: "+ c +"\n");
            bw.write("Valor Comercial: "+ v + "\n");
            bw.write("\n");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != bw)
                    bw.close();
                if (null != fichero)
                    fichero.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
