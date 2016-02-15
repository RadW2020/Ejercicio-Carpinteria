package carpinteria;

/**
 * @author Raúl Jiménez Martín
 */
public class Pago_Mayor {
    /**
     * Método que busca el el array de interfaces cual ha sido
     * el mayor pago a un trabajador por un montaje o fabricación
     * @param vector
     * @return 
     */
    public static double Pago_Mayor (Carpinteria [] vector){
        double temp = 0;
        for(Carpinteria cosa :  vector){
            if (cosa.paga_trabajador() > temp){
                temp = cosa.paga_trabajador();
            }
        }
        return temp;
    }

}
